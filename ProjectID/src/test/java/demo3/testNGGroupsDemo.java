package demo3;

import org.testng.annotations.Test;

public class testNGGroupsDemo {
	@Test(groups = {"sanity"})
	public void Test1() {
		System.out.println("This is test 1");
	}
	@Test(groups = {"sanity","smoke"})
	public void Test2() {
		System.out.println("This is test 2");
	}

	@Test(groups = {"smoke","regression"})
	public void Test3() {
		System.out.println("This is test 3");
	}
	@Test
	public void Test4() {
		System.out.println("This is test 4");
	}

}
