package Abcd;

import org.testng.annotations.Test;

public class Demo2Test {
	
	@Test(groups = "smoke")
	public void sample() {
		System.out.println("sample");
	}
	
	@Test(groups = "regression")
	public void sample2() {
		System.out.println("sample");

}
}