package com.selenium.basictest;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.selenium.basictest.base.BaseTestClass;

public class LoginTest extends BaseTestClass {

	@Test
	public void testLoginPage() {

		webDriver.get("https://opensource-demo.orangehrmlive.com");
		webDriver.findElement(By.id("txtUsername")).sendKeys("Admin");
		webDriver.findElement(By.id("txtPassword")).sendKeys("admin123");
		webDriver.findElement(By.id("btnLogin")).click();
		

	}

}
