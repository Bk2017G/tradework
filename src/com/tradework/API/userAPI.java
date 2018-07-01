/**
 * 
 */
package com.tradework.API;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import com.tradework.bean.LoginBean;
import com.tradework.business.service.LoginService;
import com.tradework.resources.AppConfig;
import com.tradework.resources.Factory;
import com.tradework.resources.JSONParser;

@Path("api")
public class userAPI{
	@GET
    @Produces(MediaType.TEXT_HTML)
    public String getHello() {
        return "<html><head><title>API OF TRADEWORK</title></head><body>If you are here just for fun we can show you awesome fun</body></html>";
    }
		@Path("/Login")
		@POST
		@Produces(MediaType.APPLICATION_JSON)
		@Consumes(MediaType.APPLICATION_JSON)
		public Response userLogin(String dataRecieved) throws Exception {
			
			Response response = null;
			String successMessage=null;
			String returnString=null;
			try {
				
				LoginBean loginBean = JSONParser.fromJson( dataRecieved ,LoginBean.class);
				System.out.println(loginBean.getUserName()+" "+loginBean.getMessage());
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
					System.out.println(returnString);
				response=Response.status(Status.OK).entity(returnString).build();
				}//try
			catch(Exception e) {
				e.printStackTrace();
				String errorMessage = AppConfig.PROPERTIES.getProperty(e
						.getMessage());

				LoginBean loginBean = new LoginBean();
				loginBean.setMessage(errorMessage);

				 returnString = JSONParser.toJson(loginBean);
				 System.out.println(returnString);

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

