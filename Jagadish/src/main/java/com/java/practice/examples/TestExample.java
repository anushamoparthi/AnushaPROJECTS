package com.java.practice.examples;

import org.testng.annotations.Test;

import com.java.practice.common.WebDriverBaseClass;

public class TestExample extends WebDriverBaseClass {
	
	@Test
	public void test(){
	driver.get("www.google.com");
	}
}
