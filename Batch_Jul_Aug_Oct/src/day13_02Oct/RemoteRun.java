package day13_02Oct;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class RemoteRun {

	public static void main(String[] args) throws MalformedURLException {
		// We have to mention browser which we want to use for test execution
		DesiredCapabilities cap=DesiredCapabilities.chrome();
		 
		// Set the platform where we want to run our test- we can use MAC and Linux and other platforms as well
		cap.setPlatform(Platform.MAC);
		 
		// Here you can use hub address, hub will take the responsibility to execute the test on respective node
		URL url=new URL("http://localhost:4444/wd/hub");
		 
		// Create driver with hub address and capability
		WebDriver driver=new RemoteWebDriver(url, cap);
		 
		// start application
		driver.get("http://learn-automation.com/");
		 
		// get the title and print the same
		System.out.println("Blog title is "+driver.getTitle());
		 
		driver.close();
		System.out.println("--Bye--");
		
	}
	
}
