package org.kom;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ChangeValue {
	
	public static void main(String[] args) throws IOException {
		
		File loc = new File ("C:\\Users\\USER\\eclipse-workspace\\Practice\\Excel1\\write value.xlsx");
		
		Workbook w  =new XSSFWorkbook();
		
		Sheet s  = w.createSheet("Course");
		Row r = s.createRow(2);
		Cell c = r.createCell(3);
		
		c.setCellValue("Selenium");
		
		FileOutputStream loc1 = new FileOutputStream(loc);
		
		w.write(loc1);
		
		
		
		
		
		
	}

}
