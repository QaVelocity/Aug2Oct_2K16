package Framework2_0.Framework2_0.testCases;

import java.io.IOException;

import Framework2_0.Framework2_0.Constants;
import Framework2_0.Framework2_0.GenericKeyword;

public class Testcase {

	GenericKeyword gc = new GenericKeyword();
	public String login() throws IOException{
		
		gc.openBrowser("chrome", "http://newtours.demoaut.com/");
		gc.typeText("username_textBox", "email@gmail.com");
		gc.typeText("password_textBox", "password");
		
		return Constants.Keyword_PASS;
	}
	
}
