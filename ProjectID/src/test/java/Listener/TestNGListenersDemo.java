package Listener;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGListenersDemo {
	
	@Test
	public void Test1(){
		System.out.println("I am inside Test 1");
	}
	@Test
	public void Test2(){
		System.out.println("I am inside Test 2");
		Assert.assertTrue(false);
	}
	@Test
	public void Test3(){
		System.out.println("I am inside Test 3");
	}
	@Test
	
	public void Test4(){
		System.out.println("I am inside Test 4");
	}

}
