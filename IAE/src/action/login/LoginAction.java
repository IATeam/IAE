package action.login;

import action.base.BaseAction;

public class LoginAction extends BaseAction {

	private String username;
	private String password;
		
	public String execute(){
		if(getUsername().equals("username") && getPassword().equals("password")){
			System.out.println("right uname and pword");
			return SUCCESS;
		}
		return LOGIN;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
