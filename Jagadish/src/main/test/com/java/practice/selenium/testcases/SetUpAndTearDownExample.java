package com.java.practice.selenium.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.java.practice.common.WebDriverBaseClass;

public class SetUpAndTearDownExample extends WebDriverBaseClass {

	
	@BeforeMethod(alwaysRun = true)
	public void setUp() {
	
	}
	
	@AfterMethod(alwaysRun = true)
	public void tearDown() {
		driver.quit();
	}
	
	@Test
	public void googleWebsite() {
		driver.get("www.google.com");
		webDriverWait.until(ExpectedConditions.elementToBeClickable(By.name("btnK")));
		driver.findElement(By.id("lst-ib")).sendKeys("Jagadish Jampani");
		driver.findElement(By.name("btnK")).click();
		webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[5]/div[4]/div[10]/div[1]/div[2]/div/div[3]/div[2]/div/div/div/div[1]/div[1]/div/h3/a")));
		driver.findElement(By.xpath("/html/body/div[5]/div[4]/div[10]/div[1]/div[2]/div/div[3]/div[2]/div/div/div/div[1]/div[1]/div/h3/a")).click();
	}
	
	@Test
	public void yahooWebsite() {
		driver.get("www.yahoo.com");
	}	
}
