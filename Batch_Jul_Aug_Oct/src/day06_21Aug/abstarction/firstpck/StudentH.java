package day06_21Aug.abstarction.firstpck;

public class StudentH {

	int marks;
	String name;
	 public StudentH(String name, int marks) {
		this.marks = marks;
		this.name = name;
	}
	
	String getCategory() {
		return null;
	}
	
	private String calcCateg(int marks) {
		String tCatg = "";
		if(marks < 40){
			tCatg = "poor";
		}
		if(marks > 40 && marks <60){
			tCatg = "below avg";
		}
		if(marks > 60 && marks <70){
			tCatg = "avg";
		}
		if(marks > 70){
			tCatg = "good";
		}
		return tCatg;
	}
}
