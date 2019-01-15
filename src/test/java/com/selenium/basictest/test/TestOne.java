package com.selenium.basictest.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.selenium.basictest.base.BaseTestClass;

public class TestOne extends BaseTestClass {

	@Test(priority = 0)
	public void getWebsite() {
		webDriver.get("https://opensource-demo.orangehrmlive.com");
		webDriver.navigate().to("https://opensource-demo.orangehrmlive.com/");

		String urlString = "https://opensource-demo.orangehrmlive.com/";
		String webUrl = webDriver.getCurrentUrl();

		Assert.assertEquals(webUrl, urlString);

	}

	@Test(priority = 1)
	public void testUserNamePassword() {

		WebElement userName = webDriver.findElement(By.cssSelector("#txtUsername"));
		userName.sendKeys("Admin");

		WebElement password = webDriver.findElement(By.cssSelector("#txtPassword"));
		password.sendKeys("admin123");

	}

	@Test(priority = 2)
	public void testLoginButton() {
		webDriver.findElement(By.xpath("//*[@id=\"btnLogin\"]")).click();

	}

	@Test(priority = 3)
	public void testAdminPage() {

		String adminUrl = "https://opensource-demo.orangehrmlive.com/index.php/dashboard";
		String currentUrl = webDriver.getCurrentUrl();

		Assert.assertEquals(adminUrl, currentUrl);

		WebElement assignLeave = webDriver.findElement(By.cssSelector(
				"#dashboard-quick-launch-panel-menu_holder > table > tbody > tr > td:nth-child(1) > div > a > img"));
		assignLeave.click();

		WebElement empName = webDriver.findElement(By.cssSelector("#assignleave_txtEmployee_empName"));
		empName.sendKeys("Some Value");

	}

}
