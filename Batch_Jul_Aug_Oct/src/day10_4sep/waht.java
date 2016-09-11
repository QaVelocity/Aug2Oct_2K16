package day10_4sep;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class waht {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\July_Aug_Oct\\Batch_Jul_Aug_Oct\\src\\ThirdPartyJars\\chromedriver.exe");
		WebDriver wd = new ChromeDriver();
		wd.manage().window().maximize();
		
		//wd.navigate().to("https://www.mkyong.com/java/how-to-read-file-from-java-bufferedreader-example/");
		
		wd.get("https://www.netpnb.com/#");
		
		Set<String> windowHandles = wd.getWindowHandles();
		//System.out.println(windowHandles.toString());
		Iterator<String> winIterator = windowHandles.iterator();
		while(winIterator.hasNext()){
			String next = winIterator.next();
			System.out.println("Current Handle :" + next);
			wd.switchTo().window(next);
			String title = wd.getTitle();
			System.out.println(title);
			
		}
		
		
		System.out.println("---`After Click---");
		
		WebElement homeLoanLink = wd.findElement(By.linkText("Home loan"));
		homeLoanLink.click();
		
	
		windowHandles = wd.getWindowHandles();
		System.out.println(windowHandles.toString());
		for (String curHan : windowHandles) {
			System.out.println("Current Handle :" + curHan);
			wd.switchTo().window(curHan);
			String title = wd.getTitle();
			System.out.println(title);
		
		}
		
		
		//wd.get("https://www.mkyong.com/java/how-to-read-file-from-java-bufferedreader-example/");
		
		/*Alert alert = wd.switchTo().alert();
		alert.dismiss();*/
	}
}
