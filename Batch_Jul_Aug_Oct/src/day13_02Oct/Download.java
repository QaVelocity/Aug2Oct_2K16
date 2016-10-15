package day13_02Oct;

import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Download {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\Lavanya\\Code\\Aug2Oct_2K16\\Batch_Jul_Aug_Oct\\src\\ThirdPartyJars\\chromedriver.exe");
		
		HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
	//	chromePrefs.put("profile.default_content_settings.popups", 0);
		chromePrefs.put("download.default_directory", "F:\\Lavanya\\MyCustomDownload");
		
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("prefs", chromePrefs);
		
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(ChromeOptions.CAPABILITY, options);
				
		WebDriver browser =  new ChromeDriver(cap);	
		
		browser.navigate().to("https://www.java.com/en/download/win10.jsp");
		
		//browser.manage().timeouts().implicitlyWait(arg0, arg1);
		WebElement downloadButton = browser.findElement(By.xpath("//span[contains(text(),'Agree and Start Free Download')]"));
		downloadButton.click();
		
		
		
		
		WebDriverWait wdw = new WebDriverWait(browser, 10);
		wdw.until(ExpectedConditions.elementToBeClickable(By.id("someid")));
		
		Wait wait = new FluentWait(browser)
				.withTimeout(30, TimeUnit.SECONDS)
				 
			    .pollingEvery(5, TimeUnit.MILLISECONDS)
			 
			    .ignoring(NoSuchElementException.class);
		
		/*WebElement foo = wait.until(new Function() {
			 
		    public WebElement apply(WebDriver driver) {
		 
		    return driver.findElement(By.id("foo"));
		 
		    }
		 
		   });*/
		
		System.out.println("--Bye--");
	}
}
