package practice;

import org.testng.annotations.Test;

import practiceGeneric.BaseClass;

public class AmazonTest extends BaseClass {

	@Test
	public void amazonTest() {
		driver.get("https://www.amazon.in/");
	}
}
