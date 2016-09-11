package day06_21Aug.abstarction.firstpck;

public class Student1First {

	String name;
	String stream;
	boolean feesSubmitted;
	String phoneNumber;
	
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
	boolean isFeesSubmitted() {
		return feesSubmitted;
	}
	public void setFeesSubmitted(boolean feesSubmitted) {
		this.feesSubmitted = feesSubmitted;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
}
