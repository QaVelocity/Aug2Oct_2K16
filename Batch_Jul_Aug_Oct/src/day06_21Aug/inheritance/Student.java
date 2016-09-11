package day06_21Aug.inheritance;

public class Student {

	String name;
	String stream;
	int marks;	
	boolean grade;
		
	Student(){
		name = "Your Name";
		stream = "ur stream";
		marks = -123;
	}
	Student(String nme, String strm){
		name = nme;
		stream = strm;
	}
	
	Student(String nme, String strm,int mrks){
		name = nme;
		stream = strm;
		marks = mrks;
	}
	
	boolean isTopper(){
		if(marks > 80){
			return true;
		}
		return false;
	}
	
	String getName (){
		return name;
	}
	void setName(String name){
		this.name = name;
	}
	
	public String getStream() {
		return stream;
	}
	public void setStream(String stream) {
		this.stream = stream;
	}
	
	@Override
	public String toString() {
		String format = String.format("name=%s,stream=%s,marks=%d,grade="+grade, name,stream,marks);
		String sm = ("name="+name+",stream="+stream+",marks="+marks+",grade="+grade);
		
		return format;
	}
			
}
