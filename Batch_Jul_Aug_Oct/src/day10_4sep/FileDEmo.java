package day10_4sep;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileDEmo {

	public static void main(String[] args) throws IOException {
		System.out.println("Hello\\nHi");
		File file = new File("D:\\MyTest\\test.txt");

		/*
		 * System.out.println("file.isFile() : "+file.isFile());
		 * System.out.println("file.isHidden() : "+file.isHidden());
		 * System.out.println("file.isDirectory() : "+file.isDirectory());
		 */

		// file.createNewFile();
		/*System.out.println("===================");
		int tCount = 0;
		File[] listFiles = file.listFiles();
		for (int itr = 0; itr < listFiles.length; itr++) {
			String name = listFiles[itr].getName();
			System.out.println(name);
			if (name.endsWith(".txt")) {
				tCount++;
			}

		}
		System.out.println("ttal text file=" + tCount);*/

	/*	
		FileWriter fw = new FileWriter(file,true);
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write("Whta");
		bw.newLine();
		bw.flush();
		bw.close();*/
		
		
		
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		String line = br.readLine();
		while(line!=null){
			System.out.println(line);
			//System.out.println(br.readLine());
			line = br.readLine();
		}
		br.close();
		/*System.out.println();
		System.out.println(br.readLine());
		System.out.println(br.readLine());
		System.out.println(br.readLine());
		*/
		/*
		 * FileWriter fw = new FileWriter(file,true); fw.write("Helloo");
		 * fw.write("Hi"); fw.write("Byee");
		 * 
		 * fw.flush(); fw.close();
		 */

	}
}
