package day03_;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class juhi {
	public static void main(String[] args) {
		/*FirefoxDriver browser =  new FirefoxDriver();
		browser.navigate().to("https://www.hdfcbank.com/personal/personal-loan-emi-calculator");
		WebElement loanamount = browser.findElement(By.id("loan-amount"));
	loanamount.clear();
	loanamount.sendKeys("50000");
	
WebElement EMI = browser.findElement(By.id("repayment"));
String text = EMI.getText();
System.out.println("actual EMI="+text);*/
	String s= "hello why Lbello llll albello";
	//string g = "";
	String[] split = s.split("ll");
	//System.out.println(split.length);
	int indexOf = s.indexOf("l");
	System.out.println(indexOf);
	//.System.out.println(s.charAt(0));
	
	}
	
}
