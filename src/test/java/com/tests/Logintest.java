package com.tests;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Logintest {
	
	WebDriver driver;
	
	Logger log = Logger.getLogger(Logintest.class);
	
	@BeforeMethod
	public void setup() {
		log.info("****************************** Starting test cases execution  *****************************************");
		System.setProperty("webdriver.chrome.driver", "E:/My Backups/chromedriver.exe");	
		driver = new ChromeDriver(); 
		log.info("launching chrome browser");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://classic.crmpro.com");
		
		log.info("Entering application url");
		log.fatal("Fatal error message");
		log.warn("warning message");
		log.debug("this is debug message");
	}

		@Test
		public void freeecrmtitletest() {
			log.info("************starting test case**********************");
			log.info("*****************freeecrmtitletest******************");
			String title = driver.getTitle();
			Assert.assertEquals(title, "CRMPRO  - CRM software for customer relationship management, sales, and support.");
			log.info("************ending test case**********************");
			log.info("*****************freeecrmtitletest******************");
		}
		
	@Test
	public void freecrmlogotest() {
		log.info("************starting test case**********************");
		log.info("*****************freecrmlogotest******************");
		boolean b = driver.findElement(By.xpath("//img[@class='img-responsive']")).isDisplayed();
		Assert.assertTrue(b);
		log.info("************ending test case**********************");
		log.info("*****************freecrmlogotest******************");
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	
	

}
