package demo3;

import org.testng.annotations.Test;

public class TestNGDependencyDemo {
	
	@Test(dependsOnMethods = "Test2")
	public void Test1() {
		System.out.println("I am inside test 1");
	}
	@Test()
	public void Test2() {
		System.out.println("I am inside test 2");
	}
	@Test()
	public void Test3() {
		System.out.println("I am inside test 3");
	
}}
