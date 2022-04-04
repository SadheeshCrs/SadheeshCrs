package org.kom;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AdactinBase {
	
	
	public WebDriver launchBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\eclipse-workspace\\Practice\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		return driver;
	}
		public void launchUrl(WebDriver driver, String url) {
			driver.get(url);
	}
		public void type(WebElement element, String data) {
			element.sendKeys(data);
		}
		
		public String getDataFromExcel(String xlLoc,String shName,int rNo,int cNo) throws IOException {
			String strCvalue = null;
			File locate = new File (xlLoc);
			FileInputStream identify = new FileInputStream(locate);
			Workbook w = new XSSFWorkbook(identify);
			Sheet f = w.getSheet(shName);
			Row row = f.getRow(rNo);
			Cell cell = row.getCell(cNo);
			
			int type = cell.getCellType();
			
			
			if (type==1) {
				 strCvalue = cell.getStringCellValue();
				
			} else if(type==0){
				
				if(DateUtil.isCellDateFormatted(cell)) {
					
					Date date = cell.getDateCellValue();
					SimpleDateFormat s  =new SimpleDateFormat("dd/MM/yyyy");
					strCvalue = s.format(date);
						
				}else {
				double d = cell.getNumericCellValue();
				long l = (long)d;
				strCvalue = String.valueOf(l);
				}
		}
			return strCvalue;
			
}
		public void btnClick(WebElement element) {
			element.click();
		}
		public void dropAndDown(WebElement element, String data) {
			Select sel = new Select(element);
			sel.selectByVisibleText(data);
		}
		
		public void dropAndIndex(WebElement element , int no) {
			Select sel1 = new Select (element);
			sel1.selectByIndex(no);
			

		}
}
		