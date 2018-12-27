package com.tdbank.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.tdbank.qa.base.TestBase;
import com.tdbank.qa.pages.HomePage;
import com.tdbank.qa.pages.LoginPage;
import com.tdbank.qa.pages.OnlineHomePage;
import com.tdbank.qa.pages.OnlineLoginPage;

public class OnlineLoginTest extends TestBase {
	HomePage page;
	OnlineLoginPage onllog;
	LoginPage loginPge;
	OnlineLoginPage onlLogin;
	OnlineHomePage Onlhomepage;
	
	public OnlineLoginTest() { 
		super();
	}
	@BeforeTest
	public void setUp() { 
		initialization();
		page = new HomePage();
		page.tdBankLoginClick();
		
		loginPge = new LoginPage();
		loginPge.loginButtonClick();
		onlLogin = new OnlineLoginPage();
		
	}
	@Test(priority=1)
	public void enterLoginTest() { 
		
		Onlhomepage = onlLogin.onlineLogin(prop.getProperty("user"),prop.getProperty("password"));
		
	}
	@AfterMethod
	public void tearDown() { 
		//driver.quit();
	}

}
