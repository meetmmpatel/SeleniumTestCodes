package com.selenium.basictest.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.selenium.basictest.base.BaseTestClass;

public class SeleniumActionsDemo extends BaseTestClass {
	
	
	@Test(priority = 1)
	public void testRightClick() {
		webDriver.get("https://the-internet.herokuapp.com/");
		
		//Right click 
		Actions actions = new Actions(webDriver);
		
		WebElement element = webDriver.
				findElement(By.cssSelector("#content > ul > li:nth-child(1) > a"));
		actions.contextClick(element).perform();
		
	}
	
	
	

}
