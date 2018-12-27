package com.tdbank.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.tdbank.qa.base.TestBase;
import com.tdbank.qa.pages.BusinessSignUpPage;
import com.tdbank.qa.pages.HomePage;
import com.tdbank.qa.pages.LoginPage;
import com.tdbank.qa.util.TestUtil;

public class BusinessSignUpTestCase extends TestBase {
	HomePage page;
	LoginPage loginPge;
	BusinessSignUpPage bsSignUp;
	TestUtil testUtil;
	
	String sheetName = "SignIn";
	
	public BusinessSignUpTestCase() { 
		super();
	}
	@BeforeMethod
	public void setUp() { 
		initialization();
		page = new HomePage();
		loginPge = new LoginPage();
		loginPge = page.tdBankLoginClick();
		bsSignUp = new BusinessSignUpPage();
		loginPge.businessSignupClick();
		testUtil = new TestUtil();
		//testUtil.getTestData(sheetName);
	}
	@DataProvider
	public Object[][] getData() { 
		Object data[][] = TestUtil.getTestData(sheetName);
		return data;
		
	}
	@Test(priority=1, dataProvider="getData")
	//public void businessSignUpTest(String taxPayIdOne, String taxPayIdTwo, String debitCardNoOne, String debitCardNoTwo, String debitCardNoThree, String debitCardNoFour, String BuissAccNo, String thisAccDropdown, String companyName, String firstName, String lastName, String email, String confirmEmail) 
	public void businessSignUpTest(String tpidone, String tpidtwo, String dbcnone, String dbcntwo, String dbcnthre, 
			String dbcnfour, String busacno, String thisacc, String compnm, String ftname, String ltname, String mail,
			String confemail)
	{ 
		
	//	bsSignUp.signUpTDBank("12", "12345", "2342", "7656", "7678", "7865", "265434576", "Savings", "newtest", "Ricky", "Ponting", "ricky.ponting@gmail.com", "ricky.ponting@gmail.com");
		//bsSignUp.signUpTDBank(taxPayIdOne, taxPayIdTwo, debitCardNoOne, debitCardNoTwo, debitCardNoThree, debitCardNoFour, BuissAccNo, thisAccDropdown, companyName, firstName, lastName, email, confirmEmail);
		bsSignUp.signUpTDBank(tpidone, tpidtwo, dbcnone, dbcntwo, dbcnthre, dbcnfour, busacno, thisacc, compnm, ftname, ltname, mail, confemail);
		
	}
	
	
	

}
