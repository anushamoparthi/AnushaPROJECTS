package com.java.practice.examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



import com.java.practice.common.WebDriverBaseClass;


public class ZacksEarnings extends WebDriverBaseClass {
		
	public static void main(String[] args){
		
	
		
			
			System.setProperty("webdriver.chrome.driver","C://Anusha//selenium//chromedriver//chromedriver.exe");

			WebDriver driver=new ChromeDriver();
			driver.get("https://www.zacks.com/earnings/earnings-calendar");
			String xp_start="html/body/div[3]/div[2]/section[2]/div[8]/div/div[4]/div[2]/div[2]/table/tbody/tr[";
			//String xp_end="]/td[5]";
			//int rownum=1;
			for(int i=1;i<=12;i++){
				for(int j=1;j<=7;j++){
					String y=driver.findElement(By.xpath(xp_start+i+"]/td["+j+"]")).getText();
					System.out.print(y);
					System.out.print("    ");
				}
		
					System.out.println();
		}
	}
}
