package com.selenium.basictest.base;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class PageScrollDemo extends BaseTestClass {

	@Test
	public void testPageScroll() {

		webDriver.navigate().to("https://the-internet.herokuapp.com/");

		WebElement scroll = webDriver.findElement(By.cssSelector("#content > ul > li:nth-child(23) > a"));

		scroll.click();

		JavascriptExecutor js = (JavascriptExecutor) webDriver;
		js.executeScript("scrollBy(0,5000)");

	}

}
