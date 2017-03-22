package com.java.practice.selenium.examples;

import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;

public class DataProviderTest {

	@DataProvider(name="dp1")
	public static Object[][] getData(Method m){
		Object[][] data=null;
		
		if(m.getName().equals("dataDetails")){
		
		data=new Object[2][2];
		data[0][0]="name1";
		data[0][1]="password1";
		
		data[1][0]="name2";
		data[1][1]="password2";
		}
		else if(m.getName().equals("dataDetails1")){
			
			data=new Object[2][3];
			data[0][0]="name1";
			data[0][1]="password1";
			data[0][2]=21;
			
			data[1][0]="name2";
			data[1][1]="password2";
			data[1][2]=23;
		}
		return data;
				
		
	}
}
