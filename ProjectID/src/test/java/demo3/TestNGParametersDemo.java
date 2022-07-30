package demo3;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGParametersDemo {
	@Test
	@Parameters({"Myname"})
	public void test(@Optional String name) {
		System.out.println("Name is : "+"Ade");
	}

}
