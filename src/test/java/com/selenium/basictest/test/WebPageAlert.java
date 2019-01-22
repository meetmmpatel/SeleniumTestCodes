package com.selenium.basictest.test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.selenium.basictest.base.BaseTestClass;

public class WebPageAlert extends BaseTestClass {

	

	@Test(priority = 1)
	public void getWebSite() {
		webDriver.navigate().to("https://the-internet.herokuapp.com/");
	}

	@Test(priority = 2)
	public void clickOneAlert() throws InterruptedException {
		WebElement pageCick = webDriver.findElement(By.cssSelector("#content > ul > li:nth-child(25) > a"));
		pageCick.click();

		webDriver.findElement(By.cssSelector("#content > div > ul > li:nth-child(1) > button")).click();
		Alert alert = webDriver.switchTo().alert();
		Thread.sleep(2000);
		alert.accept();

	}

	@Test(priority = 3)
	public void secoudAlert() throws InterruptedException {
		WebElement sedoundAlert = webDriver
				.findElement(By.cssSelector("#content > div > ul > li:nth-child(2) > button"));
		sedoundAlert.click();
		Alert alert = webDriver.switchTo().alert();
		alert.dismiss();
		Thread.sleep(2000);
		sedoundAlert.click();
		alert.accept();
		Thread.sleep(2000);

		WebElement thirdAlert = webDriver.findElement(By.cssSelector("#content > div > ul > li:nth-child(3) > button"));
		thirdAlert.click();

		webDriver.switchTo().alert().sendKeys("Tesing for accept");
		Thread.sleep(2000);
		alert.accept();

		thirdAlert.click();
		System.out.println(alert.getText());
		Thread.sleep(5000);

		alert.dismiss();
		Thread.sleep(2000);

	}

}
