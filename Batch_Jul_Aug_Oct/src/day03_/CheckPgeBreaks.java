package day03_;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CheckPgeBreaks {

	public static void main(String[] args) {
		//  launch the browser
		FirefoxDriver browser =  new FirefoxDriver();
		// navigate to page
		browser.navigate().to("http://newtours.demoaut.com/");
		
		//check for appearance of userName
		WebElement userNameTextBox = browser.findElement(By.name("userName"));
		boolean displayed = userNameTextBox.isDisplayed();
		
		System.out.println("dispaly value" + displayed);
	}
}
