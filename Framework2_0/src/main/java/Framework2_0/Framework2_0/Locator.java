package Framework2_0.Framework2_0;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Locator {

	public static WebElement locateElement(String logicalName) throws IOException{
		WebElement tempElement = null;
		String objPropValue = fetchValueFromPropertyFile(logicalName); //xpath=//input[@name='login']
		
		int indexOf = objPropValue.indexOf("=");
		
		String locatorName = objPropValue.substring(0, indexOf);
		String locatorValue = objPropValue.substring(indexOf+1, objPropValue.length());
		WebDriver browser = Constants.browser;
		switch(locatorName){
		
		case "id" :
			tempElement = browser.findElement(By.id(locatorValue));
			break;
		case "name" :			
			tempElement = browser.findElement(By.name(locatorValue));
			break;
		case "linkText" :
			tempElement = browser.findElement(By.linkText(locatorValue));
			break;
		case "partialLinkText" :
			tempElement = browser.findElement(By.partialLinkText(locatorValue));
			break;
		case "cssSelector" :
			tempElement = browser.findElement(By.cssSelector(locatorValue));
			break;
		case "xpath" :
			tempElement = browser.findElement(By.xpath(locatorValue));
			break;
		case "tagName" :
			tempElement = browser.findElement(By.tagName(locatorValue));
			break;
		case "className" :
			tempElement = browser.findElement(By.className(locatorValue));
			break;		
		}	
				
		return tempElement;
	}
	
	
	static String fetchValueFromPropertyFile(String logicalName) throws IOException{
		
		String file = Constants.basePath + "\\ObjectRepo.properties";
		FileInputStream fis = new FileInputStream(file);
		Properties p = new Properties();		
		p.load(fis);
		String propValue = (String) p.get(logicalName);
		
		return propValue;
	}
}
