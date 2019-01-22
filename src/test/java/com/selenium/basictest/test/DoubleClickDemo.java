package com.selenium.basictest.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.selenium.basictest.base.BaseTestClass;

public class DoubleClickDemo extends BaseTestClass {

	@Test(priority = 1)
	public static void getWebsite() {
		webDriver.navigate().to("https://opensource-demo.orangehrmlive.com/");
	}

	@Test(priority = 2)
	public static void doublClickDemo() {

		Actions actions = new Actions(webDriver);
		WebElement loginButton = webDriver.findElement(By.id("btnLogin"));

		actions.doubleClick(loginButton).perform();

	}
	
	

}
