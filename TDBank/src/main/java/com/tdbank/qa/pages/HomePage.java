package com.tdbank.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tdbank.qa.base.TestBase;

public class HomePage extends TestBase {
	LoginPage login;
	// page Factory OR 
	//public static WebDriver driver;
	
	//constructor
		public HomePage() { 
			PageFactory.initElements(driver, this);
		}
	
	@FindBy(xpath="//div[@id='td-pagetitlearea']/h1")
	@CacheLookup  // to improve the script performance
	WebElement welcome;
	
	@FindBy(xpath ="//*[@id='td-logo']/a/img")
	WebElement logo;
	
	@FindBy(xpath ="//div[@id='all']/div[1]/div[1]/div/div[2]/ul[2]/li/a")
	WebElement TdBankLogin;
	//actions
		public String validateHomePageTitle() {
			return driver.getTitle();
		}
		public String welcomeTextVarification() { 
			return welcome.getText();
			}
		public Boolean validateLogo() { 
			return logo.isDisplayed();
		}
		public LoginPage tdBankLoginClick() { 
			TdBankLogin.click();
			return new LoginPage();
		}
	
	
	
	
}
