package day05_20Aug;

public class Student {

	int rollNo;
	String name;
	String stream;	
	boolean grade;
	int marks;
	
	boolean isTopper(){
		if(marks > 80){
			return true;
		}
		return false;
	}
	
	Student() {
		int rollNo = 001;
		String name = "Sam";
		String stream = "ITE";	
		boolean grade = true;
	}
	
	Student(int rllNo,String nme) {
		rollNo = rllNo;
		name = nme;
	}
	
	Student(int rllNo,String nme, boolean gr) {
		rollNo = rllNo;
		name = nme;
		grade = gr;
	}
	
	Student(int rllNo,String nme, int mrk) {
		rollNo = rllNo;
		name = nme;
		marks = mrk;
	}
	
	
}
