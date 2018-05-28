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


@Path("TradeWork")
public class userAPI{
		@Path("Login")
		@POST
		@Consumes(javax.ws.rs.core.MediaType.APPLICATION_JSON)
		@Produces(javax.ws.rs.core.MediaType.APPLICATION_JSON)
		public Response userLogin(String dataRecieved) throws Exception {
			Response response = null;
			String successMessage=null;
			String returnString=null;
			System.out.print("hello sau");
			try {
				
				LoginBean loginBean = JSONParser.fromJson( dataRecieved ,LoginBean.class);

				LoginService service = Factory.createLoginService();

				LoginBean bean = service.getLogin(loginBean);
					if(bean.getMessage()==null) {
						if(bean.getUserName().equals(loginBean.getUserName())) {
							successMessage=this.getLoginSuccess(loginBean);
						}
						else {
							successMessage=this.getLoginFailure(loginBean);
						}
						loginBean.setMessage(successMessage);
						returnString=JSONParser.toJson(bean);
					}
					else {
						loginBean= new LoginBean();
						loginBean.setMessage(bean.getMessage());
						returnString=JSONParser.toJson(loginBean);
					}
				response=Response.status(Status.OK).entity(returnString).build();
				}//try
			catch(Exception e) {
				String errorMessage = AppConfig.PROPERTIES.getProperty(e
						.getMessage());

				LoginBean loginBean = new LoginBean();
				loginBean.setMessage(errorMessage);

				 returnString = JSONParser.toJson(loginBean);

				response = Response.status(Status.SERVICE_UNAVAILABLE)
						.entity(returnString).build();
			}
		return response;		
		}
		private String getLoginFailure(LoginBean loginBean) {
			// TODO Auto-generated method stub
			String message=AppConfig.PROPERTIES.getProperty("ADMINAPI.SIGNIN_FAILURE");
			return message;
		}
		private String getLoginSuccess(LoginBean loginBean) {
			String message=AppConfig.PROPERTIES.getProperty("ADMINAPI.SIGNIN_SUCCESS");
			return message;
		}
}

