package com.selenium.basictest.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.selenium.basictest.base.BaseTestClass;

public class DragAndDropDemo extends BaseTestClass {
	
	

	@Test(priority = 1)
	public void getWebSite() {
		webDriver.navigate().to("https://the-internet.herokuapp.com/");
	}
	
	@Test(priority = 2)
	public void testDregAndDrop() {
		
		webDriver.findElement(By.cssSelector("#content > ul > li:nth-child(8) > a")).click();
		
		WebElement from = webDriver.findElement(By.id("column-a"));
		WebElement to = webDriver.findElement(By.id("#column-b"));
		
		Actions drag = new Actions(webDriver);
		
		drag.dragAndDropBy(from,250,150).build().perform();
		
		Action dragDrop = drag.clickAndHold(from).moveToElement(to).build();
		dragDrop.perform();
		
		
		
	}
	
	
	
	

}
