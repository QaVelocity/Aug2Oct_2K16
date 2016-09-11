package day12_11Sep;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DemoWorkbook {

	
	public static void main(String[] args) throws IOException {
	
		File xlFile = new File("D:\\GitCode\\AUgSep\\Aug2Oct_2K16\\JustChecking.xlsx");
		FileInputStream fis = new FileInputStream(xlFile);
		
		XSSFWorkbook workbook =  new XSSFWorkbook(fis);
		
		XSSFSheet sheet = workbook.getSheet("ObjectRepo");
		//XSSFRow row = sheet.getRow(3);		
		//XSSFCell cell = row.getCell(0);
		//String stringCellValue = cell.getStringCellValue();
		int rownum=1;
		for(rownum=1;rownum<sheet.getLastRowNum()+1;rownum++)
		{
			XSSFRow row= sheet.getRow(rownum);			
			for(int cellnum=0;cellnum<row.getLastCellNum();cellnum++)
			{
				XSSFCell cell=row.getCell(cellnum);
				String stringcell=cell.getStringCellValue();
				System.out.println(stringcell);
			}
		}
		
		fis.close();
		
		XSSFRow createRow = sheet.createRow(11);
		createRow.createCell(0).setCellValue("Hello");
		createRow.createCell(1).setCellValue("123");
		createRow.createCell(4).setCellValue("heell1223");
		
		FileOutputStream out = 
				new FileOutputStream(xlFile);
		workbook.write(out);
		out.close();
		
		
		
	}
}
