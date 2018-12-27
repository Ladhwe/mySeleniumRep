package com.tdbank.qa.util;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.WebDriverEventListener;

import com.tdbank.qa.base.TestBase;

public class WebEventListener extends TestBase implements WebDriverEventListener {
	public void beforeNavigateTo(String url, WebDriver driver) { 
		System.out.println("Before Navigate to : '" + url + "'");
	}
	
	public void afterNavigateTo(String url, WebDriver driver) { 
		System.out.println("Navigate to : '" + url + "'");
	}
	public void beforeChangeValueOf(WebElement element, WebDriver driver) { 
		System.out.println("Value of the : " + element.toString() + "Before any changes made");
	}
	public void afterChangeValueOf(WebElement element, WebDriver driver) { 
		System.out.println("Element value changed to : " + element.toString());
	}
	public void beforeClickOn(WebElement element, WebDriver driver) { 
		System.out.println("Trying to click on : " + element.toString());
	}
	public void afterClickOn(WebElement element, WebDriver driver) { 
		System.out.println("clicked on : " + element.toString());
	}
	public void beforeNavigateBack(WebDriver driver) { 
		System.out.println("Navigating back to previous page");
	}
	public void afterNavigateBack(WebDriver driver) { 
		System.out.println("Navigating back to previous page");
	}
	public void beforeNavigateForward(WebDriver driver) { 
		System.out.println("Navigating forward to next page");
	}
	public void onException(Throwable error, WebDriver driver) { 
		System.out.println("Exception occured : " +error);
		try{ 
			TestUtil.takeScreenshotAtEndOfTest();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public void beforeFindBy(By by, WebElement element, WebDriver driver) { 
		System.out.println("Trying to find Element By : " +by.toString());
	}
	public void beforeScript(String script, WebDriver driver) {
		
	}
	public void afterScript(String script, WebDriver driver) {
		
	}
	public void beforeAlertAccept(WebDriver driver) { 
		
	}
	public void afterAlertAccept(WebDriver driver) { 
		
	}
	public void afterAlertDismiss(WebDriver driver) { 
		
	}
	public void beforeAlertDismiss(WebDriver driver) { 
		
	}
	public void beforeNavigateRefresh(WebDriver driver) { 
		
	}
	public void afterNavigateRefresh(WebDriver driver) { 
		
	}
	public void beforeChangeValueOf(WebElement element, WebDriver driver, CharSequence[] KeysToSend) {
		
	}
	public void afterChangeValueOf(WebElement element, WebDriver driver, CharSequence[] KeysToSend) {
		
	}

	public void afterFindBy(By arg0, WebElement arg1, WebDriver arg2) {
		// TODO Auto-generated method stub
		
	}

	public <X> void afterGetScreenshotAs(OutputType<X> arg0, X arg1) {
		// TODO Auto-generated method stub
		
	}

	public void afterGetText(WebElement arg0, WebDriver arg1, String arg2) {
		// TODO Auto-generated method stub
		
	}

	public void afterNavigateForward(WebDriver arg0) {
		// TODO Auto-generated method stub
		
	}

	public void afterSwitchToWindow(String arg0, WebDriver arg1) {
		// TODO Auto-generated method stub
		
	}

	public <X> void beforeGetScreenshotAs(OutputType<X> arg0) {
		// TODO Auto-generated method stub
		
	}

	public void beforeGetText(WebElement arg0, WebDriver arg1) {
		// TODO Auto-generated method stub
		
	}

	public void beforeSwitchToWindow(String arg0, WebDriver arg1) {
		// TODO Auto-generated method stub
		
	}

}
