package org.kom;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Pattern;

import org.apache.poi.hssf.record.cf.PatternFormatting;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.omg.Messaging.SyncScopeHelper;

public class Fourth {
	public static void main(String[] args) throws IOException {
		
		File locate = new File ("C:\\Users\\USER\\eclipse-workspace\\Practice\\Excel1\\Third.xlsx");
		
		FileInputStream identify = new FileInputStream(locate);
		
		Workbook w = new XSSFWorkbook(identify);
		
		Sheet f = w.getSheet("Data");
		
		for (int i = 0; i < f.getPhysicalNumberOfRows(); i++) {
			Row row = f.getRow(i);
			for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
				Cell cell = row.getCell(j);
				
				int type = cell.getCellType();
				
				if (type==1) {
					String value = cell.getStringCellValue();
					System.out.println(value);
					
				} else if(type==0){
					
					if(DateUtil.isCellDateFormatted(cell)) {
						
						Date date = cell.getDateCellValue();
						SimpleDateFormat s  =new SimpleDateFormat("dd/MM/yyyy");
						String format = s.format(date);
						System.out.println(format);
						
						
					}else {
					double d = cell.getNumericCellValue();
					long l = (long)d;
					String of = String.valueOf(l);
					System.out.println(of);
					
				} 
		}

	}
	}
}
}


		
	


