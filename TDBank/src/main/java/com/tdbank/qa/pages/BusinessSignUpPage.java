package com.tdbank.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.tdbank.qa.base.TestBase;

public class BusinessSignUpPage extends TestBase {
	//constructor
	public BusinessSignUpPage() { 
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//h1[contains(text(),'Sign Up for TD Bank BusinessDirect')]")
	WebElement signUpVerify;
	@FindBy(id = "ctlWorkflow_txtTIN1")
	WebElement taxPayIdOne;
	@FindBy(id = "ctlWorkflow_txtTIN2")
	WebElement taxPayIdTwo;
	
	@FindBy(id = "ctlWorkflow_txtCardNumber1")
	WebElement debitCardNoOne;
	
	@FindBy(id = "ctlWorkflow_txtCardNumber2")
	WebElement debitCardNoTwo;
	
	@FindBy(id = "ctlWorkflow_txtCardNumber3")
	WebElement debitCardNoThree;
	
	@FindBy(id = "ctlWorkflow_txtCardNumber4")
	WebElement debitCardNoFour;
	
	@FindBy(id = "ctlWorkflow_txtAccountNumber")
	WebElement BuissAccNo;
	
	//@FindBy(id = "ctlWorkflow_ddlAccountType")
	//WebElement thisAccDropdown;
	
	@FindBy(id = "ctlWorkflow_chkPrimaryOwnerYes")
	WebElement primaryCheckBox;
	
	@FindBy(id = "ctlWorkflow_txtCompanyName")
	WebElement companyName;
	
	@FindBy(id = "ctlWorkflow_txtFirstName")
	WebElement firstName;
	
	@FindBy(id = "ctlWorkflow_txtLastName")
	WebElement lastName;
	
	@FindBy(id = "ctlWorkflow_txtEmailAddress")
	WebElement email;
	
	@FindBy(id = "ctlWorkflow_txtConfirmEmailAddress")
	WebElement confirmEmail;
	
	@FindBy(id = "ctlWorkflow_btnContinue")
	WebElement continueButton;
	
	public void signUpTDBank(String tpidone, String tpidtwo, String dbcnone, String dbcntwo, String dbcnthre, 
			String dbcnfour, String busacno, String thisacc, String compnm, String ftname, String ltname, String mail,
			String confemail) { 
		taxPayIdOne.sendKeys(tpidone);
		taxPayIdTwo.sendKeys(tpidtwo);
		debitCardNoOne.sendKeys(dbcnone);
		debitCardNoTwo.sendKeys(dbcntwo);
		debitCardNoThree.sendKeys(dbcnthre);
		debitCardNoFour.sendKeys(dbcnfour);
		BuissAccNo.sendKeys(busacno);
		Select selct = new Select(driver.findElement(By.id("ctlWorkflow_ddlAccountType")));
		selct.selectByVisibleText(thisacc);
		primaryCheckBox.click();
		companyName.sendKeys(compnm);
		firstName.sendKeys(ftname);
		lastName.sendKeys(ltname);
		email.sendKeys(mail);
		confirmEmail.sendKeys(confemail);
		continueButton.click();
			}

}
