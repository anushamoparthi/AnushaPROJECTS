package com.java.practice.selenium.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgExample {

	@Test
	public void method1() {
		System.out.println("I am inside method1");
	}
	
	@Test
	public void method2() {
		System.out.println("I am inside method2");
	}
	@BeforeTest
	public void method0(){
		System.out.println("This is the main method");
	}
}
