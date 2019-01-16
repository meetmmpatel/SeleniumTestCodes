package com.selenium.basictest.base;

import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BaseTestClass {

	public static WebDriver webDriver;

	@BeforeSuite
	public void setUp() {

		System.out.println("Please enter your choice of browser");
		System.out.println("The options are 1 for Chrome 2 for Firefox");
		Scanner scan = new Scanner(System.in);
		int browser = scan.nextInt();

		if (browser == 1) {
			System.setProperty("webdriver.chrome.driver", "/Users/milanpatel/Documents/core/software/chromedriver-3");
			webDriver = new ChromeDriver();
			webDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			
		} else if (browser == 2) {
			System.setProperty("webdriver.gecko.driver", "/Users/milanpatel/Documents/core/software/geckodriver 2");
			webDriver = new FirefoxDriver();
			webDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		} else {
			try {
				throw new FileNotFoundException();
			} catch (FileNotFoundException e) {
				System.out.println("Please enter valid value");
			}
		}

	}

	@AfterSuite
	public void cleanUp() throws InterruptedException {

		Thread.sleep(5000);
		webDriver.quit();
	}

}
