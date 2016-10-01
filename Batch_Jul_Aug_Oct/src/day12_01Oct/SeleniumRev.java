package day12_01Oct;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.MarionetteDriver;

public class SeleniumRev {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "F:\\Lavanya\\Code\\Aug2Oct_2K16-master\\Batch_Jul_Aug_Oct\\src\\ThirdPartyJars\\geckodriver.exe");
		WebDriver browser = new MarionetteDriver();
		//WebDriver browser =  new FirefoxDriver();
		browser.navigate().to("http://www.seleniumhq.org/download/");
	}
}
