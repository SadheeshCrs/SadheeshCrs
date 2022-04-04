package org.kom;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ChangeValue1 {
	
	public static void main(String[] args) throws IOException {
		
		File loc = new File ("C:\\Users\\USER\\eclipse-workspace\\Practice\\Excel1\\Change value.xlsx");
		
		FileInputStream loc1 = new FileInputStream(loc);
		Workbook w = new XSSFWorkbook(loc1);
		Sheet s = w.getSheet("Data");
		Row r = s.getRow(2);
		Cell c = r.getCell(1);
		
		String value = c.getStringCellValue();
		
		if(value.equals("C++")) {
			c.setCellValue("Selenium");
		}
		
		FileOutputStream valueChange = new FileOutputStream(loc);
		w.write(valueChange);
		
		System.out.println("Done");
		
		
	}

}
