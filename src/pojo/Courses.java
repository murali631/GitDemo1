package pojo;

import java.util.List;

public class Courses {
	private List<WebAutomation> webAutomation;
	private List<Api> api;
	private List<Mobile> mobile;
	public List<WebAutomation> getWebAutomation() {
		return webAutomation;
	}
	public void setWebAutomation(List<WebAutomation> webAutomation) {
		this.webAutomation = webAutomation;
	}
	public List<Api> getApi() {
		return api;
	}
	public void setApi(List<Api> api) {
		this.api = api;
	}
	public List<Mobile> getMobile() {
		return mobile;
	}
	public void setMobile(List<Mobile> mobile) {
		this.mobile = mobile;
		System.out.println("Post clone 6");
		
		System.out.println("Branch 1i");
	}

	public void branchcourse(List<Api> api) {
		this.api = api;
	}
	
	public void branch1pushfromgitstuffcourse(List<Api> api) {
		this.api = api;
	}
	System.out.println("Branch clone 1iii-Gitstuff push");
	System.out.println("Branch clone 1iv-Gitstuff push");
}
