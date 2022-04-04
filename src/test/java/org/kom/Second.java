package org.kom;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Second {
	
	public static void main(String[] args) throws IOException {
		
		File locate = new File ("C:\\Users\\USER\\eclipse-workspace\\Practice\\Excel1\\Sad.xlsx");
		
		FileInputStream identify = new FileInputStream(locate);
		
		Workbook w = new XSSFWorkbook(identify);
		
		Sheet f = w.getSheet("Initial2");
		
		for (int i = 0; i < f.getPhysicalNumberOfRows(); i++) {
			Row r = f.getRow(i);
			for (int j = 0; j < r.getPhysicalNumberOfCells(); j++) {
				Cell c = r.getCell(j);
				System.out.print(c+"\t"+"\t");
				
				
			}
			
			System.out.println();
			
		}
		
		
		
	}

}
