package com.tdbank.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.tdbank.qa.base.TestBase;
import com.tdbank.qa.pages.HomePage;
import com.tdbank.qa.pages.LoginPage;

public class HomePageTest extends TestBase {
	
	HomePage page;
	LoginPage login;
	public HomePageTest() { 
		super();
		
	}
	@BeforeMethod
	public void setUp() { 
		initialization();
		page = new HomePage();
	}
	
	
	@Test(priority = 1)
	public void validateTitleTest() { 
		String Title = page.validateHomePageTitle();
		Assert.assertEquals(Title, "TD Bank Group - Banking, Wealth Management & Insurance | TD Bank Group");
	}
	@Test(priority = 2)
	public void welcomeTextVarificationTest() { 
		String welcometext = page.welcomeTextVarification();
		Assert.assertEquals(welcometext, "Welcome to TD");
	}
	@Test(priority = 3)
	public void validateLogoTest() { 
		Boolean logoverify = page.validateLogo();
		Assert.assertTrue(logoverify);
	}
	@Test(priority =4)
	public void TDBankLoginClick() { 
		login = page.tdBankLoginClick();
	}
	@AfterMethod
	public void tearDown() { 
		driver.quit();
	}
	

}
