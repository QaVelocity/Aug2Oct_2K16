package day12_01Oct;

public class SampleRuntimeExcpetion {
	public static void main(String[] args) {
		new A2().methodA();
	}
}

class A2{
	
	void methodA(){
		
			System.out.println("before methodA");
			try{
				new X2().methodX();
			}catch(MyRuntimeException e){
				e.printStackTrace();
			}
			System.out.println("after methodA");		
	}
}

class X2{
	
	void methodX() {
		System.out.println("before methodX");
		new Z2().methodZ();
		System.out.println("after methodX");
	}
}

class Z2{
	
	void methodZ()  {
		
			System.out.println("before methodZ");	
			int a = 9;
			if(a<10){
				//throw new MyCompileTimeException();
				throw new MyRuntimeException("The Value of varaible is less than  10");
			}
			System.out.println("a:" + a);
			System.out.println("after methodZ");
		
	}
}