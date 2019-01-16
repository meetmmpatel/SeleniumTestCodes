package com.selenium.basictest.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.selenium.basictest.base.BaseTestClass;

public class TestTwo extends BaseTestClass {

	
	@Test(priority = 0)
	public void baseTest() {
		TestOne tests = new TestOne();
		tests.getWebsite();
		tests.testUserNamePassword();
		tests.testLoginButton();
	}
	
	@Test(priority = 3)
	public void testAdminPage() {
		webDriver.findElement(By.cssSelector("#menu_admin_viewAdminModule > b")).click();
		
	}
	
	@Test(priority = 4)
	public void postTheAdminInfo() {
		webDriver.findElement(By.id("searchSystemUser_userName")).sendKeys("TestOne");
		
		WebElement userRole = webDriver.findElement(By.id("searchSystemUser_userType"));
		
		Select selectOne = new Select(userRole);
		selectOne.selectByValue("1");
		
		webDriver.findElement(By.id("searchSystemUser_employeeName_empName")).sendKeys("TempEMp");
		
		WebElement status = webDriver.findElement(By.id("searchSystemUser_status"));
		Select selecTwo = new Select(status);
		selecTwo.selectByValue("1");
		
		webDriver.findElement(By.id("searchBtn")).click();
		
		String str = webDriver.
				findElement(By.cssSelector("#resultTable > tbody > tr > td")).getText();
	    System.out.println(str);
	}
	
	

}
