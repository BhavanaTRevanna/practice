package practice;

import org.testng.annotations.Test;

import practiceGeneric.BaseClass;

public class FacebookTest extends BaseClass{
	
	@Test
	public void facebookTest() {
		driver.get("https://www.facebook.com/");
	}

}
