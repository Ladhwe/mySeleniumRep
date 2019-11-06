package stepDefinations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class Login {
	
	 WebDriver driver;
	
	@Given("^bookshelf user is on bookshelf login page$")
	public void user_is_already_on_Login_Page() {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://bookshelf.vitalsource.com");
	
	    
	}

	@When("^title of login page is VitalSource Bookshelf Sign In$")
	public void title_of_login_page_is_VitalSource_Bookshelf_Sign_In() {
	    // Write code here that turns the phrase above into concrete actions
		String bookTitle = driver.getTitle();
		
		System.out.println("The title of the page is : " +bookTitle);
		Assert.assertEquals("VitalSource Bookshelf: Sign In", bookTitle);
	    
	}

	@Then("^bookshelf user enters \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enters_and(String username, String password) {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//input[@id='email-field']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@id='password-field']")).sendKeys(password);
		
	    
	}

	@Then("^user clicks on SignIn button$")
	public void user_clicks_on_SignIn_button() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//button[@id='submit-btn']")).click();
	    
	}

	@Then("^bookshelf home page should be displayed$")
	public void user_is_on_home_page() {
	    // Write code here that turns the phrase above into concrete actions
		String Tutorial = driver.findElement(By.xpath("Bookshelf Tutorial")).getText();
		Assert.assertEquals("Bookshelf Tutorial", Tutorial);
	    
	}
	
	@Then("^verify the message please enter the password$")
	public void verify_the_message_please_enter_the_password()  {
	    // Write code here that turns the phrase above into concrete actions
		String pwMsg = driver.findElement(By.xpath("//div[contains(text(),'Please enter a password.')]")).getText();
		Assert.assertEquals("Please enter an email address.", pwMsg);
	    
	}

	@Then("^verify the message please enter an email address$")
	public void verify_the_message_please_enter_an_email_address()  {
	    // Write code here that turns the phrase above into concrete actions
		String emailMessage =driver.findElement(By.xpath("//div[contains(text(),'Please enter an email address.')]")).getText();
		Assert.assertEquals("Please enter an email address.", emailMessage);
	    
	}

	@Then("^verify both the messages$")
	public void verify_both_the_messages()  {
	    // Write code here that turns the phrase above into concrete actions
		String emailMessage =driver.findElement(By.xpath("//div[contains(text(),'Please enter an email address.')]")).getText();
		Assert.assertEquals("Please enter an email address.", emailMessage);
		String pwMsg = driver.findElement(By.xpath("//div[contains(text(),'Please enter a password.')]")).getText();
		Assert.assertEquals("Please enter an email address.", pwMsg);
	    
	    
	    
	}



}
