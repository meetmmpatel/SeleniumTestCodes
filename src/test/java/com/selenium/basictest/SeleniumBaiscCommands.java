package com.selenium.basictest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.selenium.basictest.base.BaseTestClass;

public class SeleniumBaiscCommands extends BaseTestClass {

	@Test
	public static void testBasic() {

		webDriver.get("http://yahoo.com");

		// How to set the timeline to keep the browser open
		webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// This is how selenium open the given website
		webDriver.get("https://opensource-demo.orangehrmlive.com/");

		String name = webDriver.findElement(By.id("btnLogin")).getText();
		System.out.println(name);

	}

}
