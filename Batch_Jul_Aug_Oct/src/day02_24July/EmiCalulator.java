package day02_24July;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EmiCalulator {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\July_Aug_Oct\\Batch_Jul_Aug_Oct\\src\\ThirdPartyJars\\chromedriver.exe");
		
		ChromeDriver browser =  new ChromeDriver();
		
		browser.get("https://www.hdfcbank.com/personal/personal-loan-emi-calculator");
			
		//browser.get("http://www.qavelocity.com/");
		
		//Enter the Loan Amount
		WebElement loanAmount = browser.findElement(By.id("loan-amount"));
		loanAmount.clear();
		loanAmount.sendKeys("500000");
			
		// 	Enter the Interest Rate	
		browser.findElement(By.id("interest-rate")).clear();
		browser.findElement(By.id("interest-rate")).sendKeys("15");
		
		// Enter the Year
		
		WebElement year1= browser.findElement(By.id("year"));
		year1.clear();
		year1.sendKeys("2");
		
		WebElement emi = browser.findElement(By.id("repayment"));
		String emiText = emi.getText();
		System.out.println(emiText);
		
		
		
		
		
	}	
	
}
