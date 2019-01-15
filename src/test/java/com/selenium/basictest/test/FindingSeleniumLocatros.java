package com.selenium.basictest.test;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import com.selenium.basictest.base.BaseTestClass;

public class FindingSeleniumLocatros extends BaseTestClass {
	
	@Test
	public void testOpenWebsite() {
		
		webDriver.navigate().to("https://opensource-demo.orangehrmlive.com/");
		
		webDriver.findElement(By.name("txtUsername")).sendKeys("TestOne");
		webDriver.findElement(By.cssSelector("#txtUsername")).sendKeys("TestTwo");
		webDriver.findElement(By.xpath("//*[@id=\"txtUsername\"]")).sendKeys("TestThree");
		
		
	}
	
	

}
