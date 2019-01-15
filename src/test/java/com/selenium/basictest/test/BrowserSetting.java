package com.selenium.basictest.test;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.testng.annotations.Test;

import com.selenium.basictest.base.BaseTestClass;

public class BrowserSetting extends BaseTestClass {
	
	
	@Test(priority = 0)
	public void getWebsite() {
		
		webDriver.navigate().to("https://the-internet.herokuapp.com");
		
	}
	
	@Test(priority = 1)
	public void testUrlInfo() throws InterruptedException {
		
		//How to refresh the website page using selenium
		
		webDriver.navigate().refresh();
		webDriver.navigate().back();
		webDriver.navigate().forward();
		
	
		String UrlName = webDriver.getCurrentUrl();
		System.out.println(UrlName);
		
		
		
		
		//Resize the browser window
		
		webDriver.manage().window().setPosition(new Point(0,-100));
		
		int width = 400;
		int height = 200;
		
		Dimension dimension = new Dimension(width, height);
		webDriver.manage().window().setSize(dimension);
		
		Thread.sleep(2000);
		
	}
	
	

}
