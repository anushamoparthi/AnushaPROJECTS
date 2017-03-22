package com.java.practice.selenium.examples;

import org.testng.annotations.Test;


public class DPtest{
	

	@Test(dataProviderClass=DataProviderTest.class,dataProvider="dp1")
	public void dataDetails(String name,String password){
		System.out.println(name+ "----" +password);
	}
	
	@Test(dataProviderClass=DataProviderTest.class,dataProvider="dp1")
	public void dataDetails1(String name,String password,int age){
		System.out.println(name+ "----" + password + "----" +age);
	}
	}
	
