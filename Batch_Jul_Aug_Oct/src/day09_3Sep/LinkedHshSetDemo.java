package day09_3Sep;

import java.util.LinkedHashSet;
import java.util.Set;

import org.openqa.selenium.WebDriver;

public class LinkedHshSetDemo {

	@SuppressWarnings("null")
	public static void main(String[] args) {
		LinkedHashSet<String> lhsSet =  new LinkedHashSet<String>();
		lhsSet.add("Hello");
		lhsSet.add("Apple");
		lhsSet.add("Hello");
		lhsSet.add("0011234");
		System.out.println(lhsSet.toString());
		
		
		
		lhsSet.size();
		String s = "";
		s.length();
		String a[] =  new String[9];
		int length = a.length;
		
		WebDriver browser = null;
		Set<String> windowHandles = browser.getWindowHandles();
	}	
}
