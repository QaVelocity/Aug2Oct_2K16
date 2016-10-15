package Framework2_0.Framework2_0;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;

public class GenericKeyword {

	public String openBrowser (String browserName, String url){
		
		String driverExe = null;
		
		String tempRes = Constants.Keyword_FAIL;
		switch(browserName){
		case "firefox" :
			Constants.browser = new FirefoxDriver();
			tempRes = Constants.Keyword_PASS;
			break;
		case "chrome" :
			System.out.println("chrome...");
			driverExe = Constants.basePath + "\\driverExe\\chromedriver.exe";
			System.out.println(driverExe);
			System.setProperty("webdriver.chrome.driver", driverExe);
			Constants.browser = new ChromeDriver();
			tempRes = Constants.Keyword_PASS;
			break;
		case "internet explorer" :
			driverExe = Constants.basePath + "\\driverExe\\InternetExplorerDriver.exe";
			System.setProperty("webdriver.ie.driver", driverExe);
			Constants.browser = new InternetExplorerDriver();
			tempRes = Constants.Keyword_PASS;
			break;
		}
		return tempRes;
	}
	
	public String typeText(String objectLogicalName, String textToType) throws IOException{
		String tempRes = Constants.Keyword_PASS;
		WebElement locateElement = Locator.locateElement(objectLogicalName);
		
		locateElement.sendKeys(textToType);	
		
		return tempRes;
	}
	
	public String selectDropDown(String objectLogicalName, String valueToSelect) throws IOException{
		String tempRes = Constants.Keyword_PASS;
		WebElement locateElement = Locator.locateElement(objectLogicalName);		
		
		Select sc =  new Select(locateElement);
		sc.selectByVisibleText(valueToSelect);
		
		return tempRes;
	}
	
	
}
