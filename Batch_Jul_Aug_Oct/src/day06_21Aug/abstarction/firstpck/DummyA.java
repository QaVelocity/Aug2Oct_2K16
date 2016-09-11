package day06_21Aug.abstarction.firstpck;

public class DummyA {

	String name;
	String nickName;
	
	public DummyA(String name) {
		this.name = name;
		this.nickName = nickName;
	}
	
	public DummyA(String name, String nickn) {
		this.name = name;
		this.nickName = nickn;
	}
	
	private void justFunction(){
		
	}
	
	protected void setNickName(String nickName){
		this.nickName = nickName;
	}
	
	public String getNickName(){
		return nickName;
	}
}
