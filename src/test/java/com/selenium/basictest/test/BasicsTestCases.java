package com.selenium.basictest.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.selenium.basictest.base.BaseTestClass;

public class BasicsTestCases extends BaseTestClass {

	@Test(priority = 0)
	public void testOpenWebsite() {
		webDriver.get("https://opensource-demo.orangehrmlive.com/");

	}

	@Test(priority = 1)
	public void testUserNamePassword() {
		webDriver.findElement(By.id("txtUsername")).sendKeys("Admin");

		WebElement password = webDriver.findElement(By.id("txtPassword"));
		password.sendKeys("admin123");

	}

	@Test(priority = 2)
	public void testClickLoginButton() {

		WebElement loginButton = webDriver.findElement(By.id("btnLogin"));
		loginButton.click();

	}

}
