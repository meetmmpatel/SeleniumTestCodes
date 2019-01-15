package com.selenium.basictest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.selenium.basictest.base.BaseTestClass;

public class SeleniumWaitClass extends BaseTestClass{
	
	
	private static final By ElementLocator = null;

	/**
	 * 1. Implicit wait : wait for driver to see the element loaded or 
	 * not..wait till the given time. Implicit wait applied to all the 
	 * element 
	 * 
	 * 2. Explicit wait: this class will wait for each element to be
	 * loaded based on the given time.
	 * 
	 */
	
	@Test
	public void testWaitClasses() {
		
		
		
		//Implicit wait
		webDriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//Explicit wait
		WebDriverWait wait = new WebDriverWait(webDriver, 20);
		final By ElementLocator = null;
		wait.until(ExpectedConditions.presenceOfElementLocated(ElementLocator));
		
	}
	
	

}
