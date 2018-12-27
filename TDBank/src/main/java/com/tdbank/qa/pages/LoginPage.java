package com.tdbank.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tdbank.qa.base.TestBase;

public class LoginPage extends TestBase{
	
	//constructor
			public LoginPage() { 
				PageFactory.initElements(driver, this);
			}
	
	@FindBy(xpath ="//h2[contains(text(),'Online Banking')]")
	WebElement OnlBankText;
	
	@FindBy(xpath ="//h2[contains(text(),'TD Bank BusinessDirect')]")
	WebElement BusDirect;
	
	@FindBy(xpath = "//*[@id='main']/div[1]/div[2]/section/div/div/div/div[2]/div/div[2]/div[1]/button")
	WebElement loginButton;
	
	@FindBy(xpath = "//a[@title='Sign up for BusinessDirect']")
	WebElement businessSignup;
	
	public String verifyOnlineBankText() { 
		return OnlBankText.getText();
		
	}
	public String verifyBusDirectText() { 
		return BusDirect.getText();
	}
	public OnlineLoginPage loginButtonClick() { 
		loginButton.click();
		return new OnlineLoginPage();
		
	}
	public void businessSignupClick() { 
		businessSignup.click();
	}

}
