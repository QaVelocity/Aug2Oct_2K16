package day06_21Aug.inheritance;

public class StarterClass {

	public static void main(String[] args) {
		
		int a ; // variable declare
		a= 7; // variable define/assign
		
		Student sam; // variable declare
		//sam = new Student();
		sam = new Student("Sam", "IT");
		
		Student shirish;
		shirish = new Student("shirish", "ECE", 89);
		System.out.println(shirish.toString());
		shirish = new Student("shirish", "CSEs", 8);
		System.out.println(shirish.toString());
		
		System.out.println("Sam is Topper ? " + sam.isTopper());
		System.out.println("Shirish is Topper ? " + shirish.isTopper());
	}
}
