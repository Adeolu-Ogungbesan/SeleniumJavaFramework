package demo3;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

public class TestNGRerunDemo {
	@Test
	public void test1() {
		System.out.println("I am inside test 1");
	}
	@Test
	public void test2() {
		System.out.println("I am inside test 2");
		//int i=1/0;
	}
	@Test(retryAnalyzer = Listener.RetryTestDemo.class)
	public void test3() {
		System.out.println("I am inside test 3");
		Assert.assertTrue(false);
	}

}
