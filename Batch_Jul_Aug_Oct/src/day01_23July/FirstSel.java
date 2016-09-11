package day01_23July;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstSel {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\July_Aug_Oct\\Batch_Jul_Aug_Oct\\src\\ThirdPartyJars\\chromedriver.exe");
		// Launch the Browser
		FirefoxDriver browser =  new FirefoxDriver();
		//ChromeDriver browser =  new ChromeDriver();
		Alert nal ;
	
				
		// Navigate to Url
		browser.navigate().to("http://www.seleniumhq.org/download/");
		
		// check for some controls appears
		WebElement mainContentDiv = browser.findElement(By.id("mainContent"));
		
		boolean displayed = mainContentDiv.isDisplayed();
		
		if(displayed==true){
			System.out.println("Page is successfullyy Loaded");
		}else{
			System.out.println("Alias..!! Page Not successfullyy Loaded");
		}
		
		
	}
	
}
