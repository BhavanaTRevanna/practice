package Abcd;

import org.testng.annotations.Test;

public class DemoTest {
	@Test(groups = "regression")
	public void sample() {
		System.out.println("sample");
	}

	@Test(groups = "smoke")
	public void sample2() {
		System.out.println("sample");
	}
}
