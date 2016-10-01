package day12_01Oct;

import org.openqa.selenium.NoSuchElementException;

public class SampleCompileExcpetion {
	public static void main(String[] args) {
		new A1().methodA();
	}
}

class A1{
	
	void methodA(){
		
			System.out.println("before methodA");
			try {
				new X1().methodX();
			} catch (MyCompileTimeLessThan10Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("after methodA");		
	}
}

class X1{
	
	void methodX() throws MyCompileTimeLessThan10Exception {
		System.out.println("before methodX");
		new Z1().methodZ();
		System.out.println("after methodX");
	}
}

class Z1{
	
	void methodZ() throws MyCompileTimeLessThan10Exception {
		
			System.out.println("before methodZ");	
			int a = 9;
			if(a<10){
				//throw new MyCompileTimeException();
				//throw new Exception("How r u");
				//throw new NoSuchElementException("How r u");
				throw new MyCompileTimeLessThan10Exception("The Value of varaible is less than  10");
			}
			System.out.println("a:" + a);
			System.out.println("after methodZ");
		
	}
	
	
	class S{
		
		void find () throws MyCompileTimeLessThan10Exception{
			try{
				int a = 8;
				if(a <10){
					
					throw new MyCompileTimeLessThan10Exception("The Value of varaible is less than  10");
				}
				
			}catch(NoSuchElementException e){
				
			}
		}
	}
}