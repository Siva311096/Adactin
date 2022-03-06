package org.pom;

import java.io.IOException;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseClass {
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	

	@FindBy(id="username")
	private WebElement txtUserName;
	
	@FindBy(id="password")
	private WebElement txtPassWord;
	
	@FindBy(id="login")
	private WebElement btnLogin;

	public WebElement getTxtUserName() {
		return txtUserName;
	}

	public WebElement getTxtPassWord() {
		return txtPassWord;
	}

	public WebElement getBtnLogin() {
		return btnLogin;
	}
	
	public void login(String userName, String passWord) throws Exception {
		//String userName1 = getData("Sheet1", 1, 0);
		insertValues(getTxtUserName(), userName);
		//String passWord1 = getData("Sheet1", 1, 1);
		insertValues(getTxtPassWord(), passWord);
		clkBtn(getBtnLogin());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
