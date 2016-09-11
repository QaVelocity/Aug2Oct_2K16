package day11_10Sep;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadPropFile {

	public static void main(String[] args) throws IOException {
		
		Properties p = new Properties();
		File f = new File("D:\\July_Aug_Oct\\DemoSele\\src\\test\\resources\\conf.properties");
		FileInputStream fis = new FileInputStream(f);
		
		p.load(fis);
		
		Object object = p.get("Url");
		
		String property = System.getProperty("user.dir");
		
		System.out.println(property);
	}
	
}
