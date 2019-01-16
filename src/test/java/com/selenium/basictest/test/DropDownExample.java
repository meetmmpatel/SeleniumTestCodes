package com.selenium.basictest.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.selenium.basictest.base.BaseTestClass;

public class DropDownExample extends BaseTestClass {
	
	@Test(priority = 100)
    public void getWebsite() {
		
		webDriver.navigate().to("https://the-internet.herokuapp.com/");
	}
	
	@Test(priority = 101)
	public void testDropDown() {
		
		WebElement dropDownMenu = webDriver.findElement(By.cssSelector("#content > ul > li:nth-child(9) > a"));
		dropDownMenu.click();
		
		WebElement dropDown = webDriver.findElement(By.id("dropdown"));
		
		
		
		
		Select select = new Select(dropDown);
		select.selectByValue("2");
		
//		select.deselectAll();		
//		select.deselectByIndex(2);
		
	    System.out.println(select.getOptions().toString());
	    
	    System.out.println(select.getFirstSelectedOption());
	    
	    
		
		
	}
	
	
}
