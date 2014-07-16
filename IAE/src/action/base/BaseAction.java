package action.base;

import services.Services;

import com.opensymphony.xwork2.ActionSupport;

public class BaseAction extends ActionSupport{
	
	protected Services services;

	public void setServices(Services services) {
		this.services = services;
	}
	
	protected String redirectUrl;
	public String getRedirectUrl() {
		return redirectUrl;
	}
	
	public String redirect(String to) {
		redirectUrl = to;
		return "redirect";
	}
	
}
