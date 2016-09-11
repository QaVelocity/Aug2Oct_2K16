package day06_21Aug.abstarction.firstpck;

public class Familly extends DummyA {

	public Familly(String name) {
		super(name);
		setNickName("Samyy");
	}
	
	@Override
	protected void setNickName(String nickName) {
		
		super.setNickName("Samyy");
	}
	
	
	@Override
	public String getNickName() {
		// TODO Auto-generated method stub
		return super.getNickName();
	}
}
