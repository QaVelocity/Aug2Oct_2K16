package day12_01Oct;

import org.openqa.selenium.Alert;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.UnhandledAlertException;

public class ExceptionDem {

	public static void main(String[] args) {
		new A().methodA();
	}
	
}

class A{
	
	void methodA(){
		try{
			System.out.println("before methodA");
			new X().methodX();
			System.out.println("after methodA");
		}catch(ArithmeticException e){
			e.printStackTrace();
		}
		catch(NullPointerException e){
			System.out.println("Found a Null Pointer Excpetion.. :(");
		}
		catch(NoSuchElementException e){
			System.out.println("No element found for Given property.. :(");
		}
		catch(NoSuchWindowException e){
			System.out.println("No element found for Given property.. :(");
		}
		catch(UnhandledAlertException e){
			Alert a = null;
			a.accept();
			System.out.println("No element found for Given property.. :(");
		}catch(MyRuntimeException e){
			e.printStackTrace();
		}
		
		catch(Exception e){
			e.printStackTrace();
		}
	}
}

class X{
	
	void methodX() throws InterruptedException{
		System.out.println("before methodX");
		new Z().methodZ();
		System.out.println("after methodX");
	}
}

class Z{
	
	void methodZ() throws InterruptedException{
		//try{
			System.out.println("before methodZ");
			Integer p= null;
			int a = p/0;
			//int a = 6/0;
			System.out.println("a:" + a);
			System.out.println("after methodZ");
		/*}catch(ArithmeticException e){
			e.printStackTrace();
		}*/
			
			Thread.sleep(9);
	}
}