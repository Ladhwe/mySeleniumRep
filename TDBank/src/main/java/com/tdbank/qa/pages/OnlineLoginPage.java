package com.tdbank.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tdbank.qa.base.TestBase;

public class OnlineLoginPage extends TestBase{
	
	@FindBy(id = "formElement_1")
	WebElement username;
	
	@FindBy(id = "formElement_2")
	WebElement password;
	
	@FindBy(xpath = "//label[@class='ng-binding card']")
	WebElement remember;
	
	@FindBy(xpath = "//form[@id='loginForm']/button")
	WebElement login;
	public OnlineLoginPage() { 
		PageFactory.initElements(driver, this);
	}
	
	public OnlineHomePage onlineLogin(String un, String pw) { 
		username.sendKeys(un);
		password.sendKeys(pw);
		remember.click();
		login.click();
		return new OnlineHomePage();
		
		
	}

	

}
