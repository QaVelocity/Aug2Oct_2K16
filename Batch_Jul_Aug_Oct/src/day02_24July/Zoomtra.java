package day02_24July;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zoomtra {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\July_Aug_Oct\\Batch_Jul_Aug_Oct\\src\\ThirdPartyJars\\chromedriver.exe");
		ChromeDriver chrome= new ChromeDriver();
		chrome.get("http://www.zoomtra.com/");
		WebElement roundTrip = chrome.findElement(By.id("rdbRound"));
		roundTrip.click();
		
		WebElement yatraChckBox = chrome.findElement(By.id("chkYatra"));
		boolean yatraCheck = yatraChckBox.isSelected();
		if(yatraCheck==false)
		{
		yatraChckBox.click();
		}else
		{
			System.out.println("Already Checked");
		}
		
		chrome.findElement(By.xpath("//*[@id='rdbRound']"));
		
		chrome.close();
	}

}
