package Experiments;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import Framework2_0.Framework2_0.GenericKeyword;

public class SampleExep {

	
	public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, InstantiationException {
		String methName = "openBrowser";
		
		//Class cd = GenericKeyword.class;
		Class cd = Class.forName("Framework2_0.Framework2_0.GenericKeyword");
		Method[] methods = cd.getDeclaredMethods();
		Object t = cd.newInstance();
		for (Method method : methods) {
			System.out.println(method.getName());
			
			if(method.getName().equals("openBrowser")){
				method.invoke(t, new String("chrome"), new String("http://newtours.demoaut.com/"));
				System.out.println("--done--");
			}
		}
		
	}
}
