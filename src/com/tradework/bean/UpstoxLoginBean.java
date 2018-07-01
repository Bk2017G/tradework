/**
 * 
 */
package com.tradework.bean;

/**
 * @author super
 *
 */
public class UpstoxLoginBean {
	private String apiKey;
	private String redirect_uri;
	private int response_type;
	private String grant_type;
	private String code;
	public String getApiKey() {
		return apiKey;
	}
	public void setApiKey(String apiKey) {
		this.apiKey = apiKey;
	}
	public String getRedirect_uri() {
		return redirect_uri;
	}
	public void setRedirect_uri(String redirect_uri) {
		this.redirect_uri = redirect_uri;
	}
	public int getResponse_code() {
		return response_type;
	}
	public void setResponse_code(int response_code) {
		this.response_type = response_code;
	}
	public String getGrant_type() {
		return grant_type;
	}
	public void setGrant_type(String grant_type) {
		this.grant_type = grant_type;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}

}
