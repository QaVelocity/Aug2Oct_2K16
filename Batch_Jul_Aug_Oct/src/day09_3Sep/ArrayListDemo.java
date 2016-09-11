package day09_3Sep;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListDemo {
	
	public static void main(String[] args) {
	
		ArrayList<String> arrList =  new ArrayList<String>();
		arrList.add("Hello");
		arrList.add("Apple");
		arrList.add("Hello");
		arrList.add("0011234");
		
		/*for(int ind = 0; ind < arrList.size();ind++){
			System.out.println(arrList.get(ind));
		}*/
		
		// :: For Each
		/*for(String temp : arrList){
			System.out.println(temp);
		}*/
		
		
		Iterator<String> iterator = arrList.iterator();
	//	boolean hasNext = ;
		
		/*while(iterator.hasNext()==true){
			String next = iterator.next();
			System.out.println(next);
		}*/
		
		ListIterator<String> listIterator = arrList.listIterator();
		while(listIterator.hasNext()){
			String next = listIterator.next();
			System.out.println(next);
		}
		
		while(iterator.hasNext()){
			String next = iterator.next();
			System.out.println(next);
		}
		
		while(iterator.hasNext()!=false){
			
		}
		
		System.out.println(arrList.toString());
		
		//System.out.println(arrList.get(1));
	}
	
}
