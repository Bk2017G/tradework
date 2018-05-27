/**
 * 
 */
package com.tradework.API;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.Consumes;
//import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;


import com.tradework.bean.LoginBean;
import com.tradework.business.service.LoginService;
import com.tradework.resources.AppConfig;
import com.tradework.resources.Factory;
import com.tradework.resources.JSONParser;


@Path("User")
public class userAPI {

		@Path("/Login")
		@POST
		@Consumes(javax.ws.rs.core.MediaType.APPLICATION_JSON)
		@Produces(javax.ws.rs.core.MediaType.APPLICATION_JSON)
		public Response userLogin(String dataRecieved) throws Exception {

			Response response = null;
			String string = dataRecieved;
			try {

				LoginBean loginBean = JSONParser.fromJson(string,
						LoginBean.class);

				LoginService service = Factory.createLoginService();

				LoginBean bean = service.getLogin(loginBean);
				
				if(bean.getUserName().equals(loginBean.getUserName())) {
					String succesString = this
							.getLoginSuccess(loginBean);
					loginBean.setMessage(succesString);

					String returnString = JSONParser.toJson(loginBean);
					response = Response.status(Status.OK).entity(returnString)
							.build();
				}
				else {
					String succesString = "YOU ARE UNAUTHORISED";
					loginBean.setMessage(succesString);

					String returnString = JSONParser.toJson(loginBean);
					response = Response.status(Status.UNAUTHORIZED)
							.entity(returnString).build();
				}
		}//try
			catch(Exception e) {
				String errorMessage = AppConfig.PROPERTIES.getProperty(e
						.getMessage());

				LoginBean loginBean = new LoginBean();
				loginBean.setMessage(errorMessage);

				String returnString = JSONParser.toJson(loginBean);

				response = Response.status(Status.SERVICE_UNAVAILABLE)
						.entity(returnString).build();
			}
		return response;		
		}
		private String getLoginSuccess(LoginBean loginBean) {
			return "Welcome,  " + loginBean.getUserName() + "  :)";
		}
}

