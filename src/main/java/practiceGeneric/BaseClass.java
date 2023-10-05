package practiceGeneric;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class BaseClass {

	public RemoteWebDriver driver;
	
	@Parameters("Browser")
	@BeforeClass
	public void ConfigBC(String Browser) throws Throwable {
		
		URL url=new URL("http://192.168.255.1:4444/wd/hub");
		DesiredCapabilities cap=new DesiredCapabilities();
		if(Browser.equalsIgnoreCase("chrome")) {
			cap.setPlatform(Platform.WINDOWS);
			cap.setBrowserName("chrome");
		}
		else if(Browser.equalsIgnoreCase("edge")) {
			cap.setPlatform(Platform.WINDOWS);
			cap.setBrowserName("edge");
		}
		driver=new RemoteWebDriver(url, cap);
	}
}
