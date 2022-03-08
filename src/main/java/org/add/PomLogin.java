package org.add;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PomLogin extends Class2 {
	
	@FindBy(id="username")
	private WebElement txtusername;
	
	@FindBy(id="password")
	private WebElement txtpassword;
	
	@FindBy(id="login")
	private WebElement btnlogin;

	public WebElement getTxtusername() {
		return txtusername;
	}

	public WebElement getTxtpassword() {
		return txtpassword;
	}

	public WebElement getBtnlogin() {
		return btnlogin;
	}
	
	
	public void login(String username, String password) {
	type(getTxtusername(), username);
	type(getTxtpassword(), password);
	click(btnlogin);
		
		

	}
	

}
