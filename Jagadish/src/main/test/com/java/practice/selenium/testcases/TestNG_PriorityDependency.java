package com.java.practice.selenium.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNG_PriorityDependency {
@Test(priority=2)
	public void m1(){
		System.out.println("i am in m1");
		Assert.fail();
	}
	@Test(priority=1,dependsOnMethods="m1",alwaysRun=true)
	public void m2(){
		System.out.println("i am in m2");
	}
	@Test(priority=3)
	public void m3(){
		System.out.println("i am in m3");
	}
}
