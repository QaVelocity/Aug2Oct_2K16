package day07_27Aug.inht.pc1;

public class Student {

	String name;
	int fee;
	
	public Student (String nme){
		name = nme;
	}
	
	public Student (String nme, int fe){
		name = nme;
		fee = fe;
	}
	
	
	public int Student (String nme, int fe){
		name = nme;
		fee = fe;
		return 0;
	}
	
	protected boolean isEligibleToIsseBook(){
	
		boolean tempRes = false;
		
		if(fee < 40000){
			tempRes =  false;
		}
		if(fee > 40000 && fee <= 80000){
			tempRes= true;
		}
		return tempRes;
	}
}
