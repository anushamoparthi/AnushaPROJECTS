package com.java.practice.common;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.events.WebDriverEventListener;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverBaseClass {

	protected WebDriverEventListener eventListener;
	protected  WebDriver driver;
	protected WebDriverWait webDriverWait;

	public WebDriverBaseClass() {
		
		this.driver = new FirefoxDriver();
		DesiredCapabilities capability = DesiredCapabilities.firefox();
		capability.setBrowserName("firefox");
		capability.setPlatform(Platform.WINDOWS);
		
		/*System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();*/
		webDriverWait = new WebDriverWait(driver, 50);
		driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
		driver.manage().timeouts().setScriptTimeout(50, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

	public boolean isClickable(WebElement element, WebDriver driver) {

		try {
			webDriverWait.until(ExpectedConditions.elementToBeClickable(element));
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	public boolean isVisible(WebElement element, WebDriver driver) {
		
		boolean status = false;
		try {
			String text = element.getAttribute("class");
			if(!text.contains("disabled")) {
				status = true;
			} else {
				status = false;
			}
			return status;
		} catch (Exception e) {
			return status;
		}
	}
	
	public boolean isElementPresent(String id,WebDriver driver) {
		boolean exists = false;
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.MILLISECONDS);
		exists = driver.findElements(By.id(id)).size() != 0;
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		return exists;
	}
}
