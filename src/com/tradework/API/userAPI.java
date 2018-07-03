/**
 * 
 */
package com.tradework.API;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import org.apache.oltu.oauth2.client.request.OAuthClientRequest;
import org.apache.oltu.oauth2.common.exception.OAuthSystemException;
import org.apache.oltu.oauth2.common.message.types.GrantType;
import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;
import org.glassfish.jersey.client.JerseyClientBuilder;

import java.net.URI;
import java.net.URISyntaxException;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.WebTarget;

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
		@Path("/getUpstoxData/{apiKey}/{apiSecret}")
		@GET
		@Produces(MediaType.TEXT_HTML)
		public Response getAccessCode(@PathParam("apiKey") String apikey,@PathParam("apiSecret") String apiSecret) {
			String baseURL="https://api.upstox.com/index/dialog/authorize/";
			Client client =JerseyClientBuilder.newClient();
//			String authCode = null;
			OAuthClientRequest request = null;
			String redirect_uri="http://localhost:8080/TradeWork/api/getUpstoxAccessCode";
			try {
				request = OAuthClientRequest.authorizationLocation(baseURL)
						.setParameter("apiKey", apikey)
						.setRedirectURI(redirect_uri).setResponseType("code").buildQueryMessage();
				System.out.println(request.getLocationUri());
			} catch (OAuthSystemException e1) {
				System.out.println("******************1******************************");
				e1.printStackTrace();
			}
			WebTarget target= null;
			try {
				System.out.println(request.getLocationUri());
				target = client.target(new URI(request.getLocationUri()));
			} catch (URISyntaxException e1) {
				System.out.println("----------------2------------------");
				e1.printStackTrace();
			}
			System.out.println(request.getLocationUri());
			try {
				return Response.status(Status.MOVED_PERMANENTLY).location(new URI(request.getLocationUri())).build();
			} catch (URISyntaxException e) {
				e.printStackTrace();
				return Response.status(Status.INTERNAL_SERVER_ERROR).build();
			}
			/*Response response = target.request(MediaType.TEXT_HTML).get();
			String responseString = response.readEntity(String.class);
			System.out.println("**********************RESPONSE STrting************"+responseString);
			JSONObject jsonObject;
			try {
				jsonObject = new JSONObject(responseString);
				JSONObject queryParameters = jsonObject.getJSONObject("queryParameters");
				if(queryParameters!=null) {
					
					authCode=queryParameters.getString("code");
				}
			} catch (JSONException e1) {
				System.out.println("+++++++++++++++++++++3+++++++++++++++++++");
				e1.printStackTrace();
			}
			OAuthClientRequest request2 = null;
			String tokenURI = "https://api.upstox.com/index/oauth/token";
			try {
				request2 = OAuthClientRequest.tokenLocation(tokenURI).setClientSecret(apiSecret).setGrantType(GrantType.AUTHORIZATION_CODE)
						.setCode(authCode).setRedirectURI(redirect_uri).buildQueryMessage();
			} catch (OAuthSystemException e) {
				System.out.println("===============4===================");
				e.printStackTrace();
			}
			try {
				client.target(new URI(request2.getLocationUri()));
				response= target.request(MediaType.APPLICATION_JSON).get();
			} catch (URISyntaxException e) {
				System.out.println("_-___----_---ACCESS TOKEN ERROR---_---____--");
				e.printStackTrace();
			}
//			GitHubTokenResponse tokenResponse = OAuthClient.accessToken(request2,GitHubTokenResponse.class);
			return response;*/
		}
		
		@Path("/getUpstoxAccessCode")
		@GET
		@Produces(MediaType.APPLICATION_JSON)
		public String getAccessJSON(@QueryParam("code") String code) {
			String tokenURI = "https://api.upstox.com/index/oauth/token";
			String redirect_uri="http://localhost:8080/TradeWork/api/getUpstoxAccessToken";
			String apiSecret = "lvanalaoeb";
			OAuthClientRequest request2 = null;
			Client client =JerseyClientBuilder.newClient();
			Response response = null;
			try {
				request2 = OAuthClientRequest.tokenLocation(tokenURI).setParameter("apiSecret", apiSecret).setGrantType(GrantType.AUTHORIZATION_CODE)
						.setCode(code).setRedirectURI(redirect_uri).buildQueryMessage();
				System.out.println(request2.getLocationUri());
			} catch (OAuthSystemException e) {
				System.out.println("===============4===================");
				e.printStackTrace();
			}
			WebTarget target= null;
			try {
				target = client.target(new URI(request2.getLocationUri()));
			} catch (URISyntaxException e1) {
				System.out.println("----------------2------------------");
				e1.printStackTrace();
			}
			try {
				client.target(new URI(request2.getLocationUri()));
				response= target.request(MediaType.APPLICATION_JSON).get();
			} catch (URISyntaxException e) {
				System.out.println("_-___----_---ACCESS TOKEN ERROR---_---____--");
				e.printStackTrace();
			}
			return response.readEntity(String.class);
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
		@Path("/getUpstoxAccessToken")
		@POST
		@Consumes(MediaType.APPLICATION_JSON)
		@Produces(MediaType.TEXT_PLAIN)
		public String getAccessToken(String data) {
			return data;
		}
}

