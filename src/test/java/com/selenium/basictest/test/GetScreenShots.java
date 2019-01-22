package com.selenium.basictest.test;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.selenium.basictest.base.BaseTestClass;

public class GetScreenShots extends BaseTestClass {

	@BeforeTest
	public void setTest() {
		// webDriver.manage().window().maximize();
		webDriver.get("http://google.com");
		webDriver.navigate().refresh();
	}

	@Test
	public void googleCalculator() {
		WebElement searchBox = webDriver.findElement(By.name("q"));
		searchBox.sendKeys("2+2");
		searchBox.sendKeys(Keys.ENTER);

		WebElement calculator = webDriver.findElement(By.id("cwos"));
		String result = calculator.getText();

		Assert.assertEquals(result, 10);
	}

	@AfterMethod
	public void takeScreenShotOnFailure(ITestResult testResult) throws IOException {
		if (testResult.getStatus() == ITestResult.FAILURE) {
			System.out.println(testResult.getStatus());
			File scrFile = ((TakesScreenshot) webDriver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(scrFile, new File("errorScreenshots\\" + testResult.getName() + "-"
					+ Arrays.toString(testResult.getParameters()) + ".jpg"));
		}
	}

}
