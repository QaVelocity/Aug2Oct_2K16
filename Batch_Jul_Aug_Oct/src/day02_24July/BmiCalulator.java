package day02_24July;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class BmiCalulator {

	
	public static void main(String[] args) {
		
		/* 
		 * we are using double-slash(//) in path because java starts thinking single
		 * single-slash(/) to be special and behave differently
		 * eg. /n newLine 
		 * /t tab
		 * 
		 * Putting double slash is called escape-sequence-character
		 * 
		 */
		System.setProperty("webdriver.chrome.driver", "D:\\July_Aug_Oct\\Batch_Jul_Aug_Oct\\src\\ThirdPartyJars\\chromedriver.exe");
		ChromeDriver chrome= new ChromeDriver();
		chrome.get("//http://www.smartbmicalculator.com/");
		
		
		chrome.findElement(By.linkText("Inbox (35)")).click();
		chrome.findElement(By.partialLinkText("Inbox ")).click();
	}
}
