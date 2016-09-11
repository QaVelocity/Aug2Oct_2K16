package day05_20Aug;

public class Starter {
	
	public static void main(String[] args) {
		int a;
		a = 5;
		System.out.println(a);
		
		Student ravi;
		ravi = new Student();
		System.out.println("---------RAVI-------");
		System.out.println("isTopper = " + ravi.isTopper());
		System.out.println("---------SAM-------");
		Student sam = new Student(005, "Sam", 89);
		System.out.println("isTopper = " + sam.isTopper());
	}
	
	
}
