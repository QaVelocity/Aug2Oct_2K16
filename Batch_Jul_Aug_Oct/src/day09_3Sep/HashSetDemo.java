package day09_3Sep;

import java.util.HashSet;

public class HashSetDemo {

	
	public static void main(String[] args) {
		
		HashSet<String> hsSet =  new HashSet<String>();
		hsSet.add("Hello");
		hsSet.add("Apple");
		hsSet.add("Hello");
		hsSet.add("0011234");
		System.out.println(hsSet.toString());
		
		for (String string : hsSet) {
			
		}
		
	}
}
