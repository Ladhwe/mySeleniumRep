package com.tdbank.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.tdbank.qa.base.TestBase;
import com.tdbank.qa.pages.HomePage;
import com.tdbank.qa.pages.LoginPage;
import com.tdbank.qa.pages.OnlineLoginPage;

public class LoginPageTest extends TestBase{
	HomePage page;
	LoginPage loginPge;
	OnlineLoginPage onlLogin;
	
	public LoginPageTest() { 
		super();
	}
	@BeforeMethod
	public void setUp() { 
		initialization();
		page = new HomePage();
		loginPge = page.tdBankLoginClick();
	}
	@AfterMethod
	public void tearDown() { 
		driver.quit();
	}
	@Test(priority = 1)
	public void verifyOnlineBankTextTest() { 
		String onlineBankText = loginPge.verifyOnlineBankText();
		Assert.assertEquals(onlineBankText, "Online Banking");
	}
	@Test(priority = 2)
	public void verifyBusDirectTextTest() { 
		String BusDrText = loginPge.verifyBusDirectText();
		Assert.assertEquals(BusDrText, "TD Bank BusinessDirect");
	}
	@Test(priority = 3)
	public void loginButtonClickTest() { 
		onlLogin =loginPge.loginButtonClick();
		
	}

}
