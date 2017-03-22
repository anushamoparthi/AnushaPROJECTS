package com.java.practice.selenium.testcases;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNgParameterExample {

	@Parameters("sampleParam")
	@Test
	public void parameterExample(String arg1) {
		System.out.println("I have received an argument :"+arg1);
	}
	
	
	@Parameters(value={"first","second"})
	@Test
	public void add(int x,int y){
		//int sum=x+y;
		System.out.println("value of sum:"+(x+y));
}
}
