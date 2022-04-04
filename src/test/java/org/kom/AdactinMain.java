package org.kom;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class AdactinMain {
	public static void main(String[] args) throws IOException, InterruptedException {
		
		AdactinBase v = new AdactinBase();
		
		WebDriver driver = v.launchBrowser();
		
		v.launchUrl(driver,"https://adactinhotelapp.com/");
		
		Thread.sleep(4000);
		
		WebElement usrName = driver.findElement(By.id("username"));
		v.type(usrName, v.getDataFromExcel("C:\\Users\\USER\\eclipse-workspace\\Practice\\Excel1\\Adactinuser&pass.xlsx",
				"Trail1", 0, 0));
		
		Thread.sleep(3000);
		
		WebElement usrPass = driver.findElement(By.id("password"));
		v.type(usrPass, v.getDataFromExcel("C:\\Users\\USER\\eclipse-workspace\\Practice\\Excel1\\Adactinuser&pass.xlsx", 
				"Trail1", 1, 0));
		
		WebElement btnLog = driver.findElement(By.id("login"));
		v.btnClick(btnLog);
		
	
	
		WebElement s1 = driver.findElement(By.id("location"));
		v.dropAndDown(s1, "Sydney");
		
		
		
		WebElement s2 = driver.findElement(By.id("hotels"));
		v.dropAndDown(s2, "Hotel Sunshine");
		
		
		WebElement s3 = driver.findElement(By.id("room_type"));
		v.dropAndIndex(s3, 2);
		
		
		WebElement s4 = driver.findElement(By.id("room_nos"));
		v.dropAndIndex(s4, 4);
		WebElement s5 = driver.findElement(By.id("datepick_in"));
		v.type(s5, v.getDataFromExcel("C:\\Users\\USER\\eclipse-workspace\\Practice\\Excel1\\Adactinuser&pass.xlsx", 
				"Trail2", 0, 0));
		WebElement s6 = driver.findElement(By.id("datepick_out"));
		v.type(s6, v.getDataFromExcel("C:\\Users\\USER\\eclipse-workspace\\Practice\\Excel1\\Adactinuser&pass.xlsx", 
				"Trail2", 1, 0));
		WebElement s7 = driver.findElement(By.id("adult_room"));
		v.dropAndIndex(s7, 1);
		WebElement s8 = driver.findElement(By.id("child_room"));
		v.dropAndIndex(s8, 1);
		WebElement s9 = driver.findElement(By.id("Submit"));
		v.btnClick(s9);
		
		WebElement s10 = driver.findElement(By.id("radiobutton_0"));
		v.btnClick(s10);
		WebElement s11 = driver.findElement(By.id("continue"));
		v.btnClick(s11);
		
		Thread.sleep(5000);
		
		WebElement s12 = driver.findElement(By.id("first_name"));
		v.type(s12, v.getDataFromExcel("C:\\Users\\USER\\eclipse-workspace\\Practice\\Excel1\\Adactinuser&pass.xlsx",
				"Trail1", 0, 0));
		
		WebElement s13 = driver.findElement(By.id("last_name"));
		v.type(s13, v.getDataFromExcel("C:\\Users\\USER\\eclipse-workspace\\Practice\\Excel1\\Adactinuser&pass.xlsx",
				"Trail1", 1,0 ));
		
		WebElement s14 = driver.findElement(By.id("address"));
		v.type(s14, v.getDataFromExcel("C:\\Users\\USER\\eclipse-workspace\\Practice\\Excel1\\Adactinuser&pass.xlsx",
				"Trail1", 2, 0));
		
		WebElement s15 = driver.findElement(By.id("cc_num"));
		v.type(s15, v.getDataFromExcel("C:\\Users\\USER\\eclipse-workspace\\Practice\\Excel1\\Adactinuser&pass.xlsx",
				"Trail1", 3, 0));
		
		WebElement s16 = driver.findElement(By.id("cc_type"));
		v.dropAndIndex(s16, 1);
		WebElement s17 = driver.findElement(By.id("cc_exp_month"));
		v.dropAndIndex(s17, 5);
		
		WebElement s18 = driver.findElement(By.id("cc_exp_year"));
		v.dropAndIndex(s18,11);
		
		WebElement s19 = driver.findElement(By.id("cc_cvv"));
		v.type(s19, v.getDataFromExcel("C:\\Users\\USER\\eclipse-workspace\\Practice\\Excel1\\Adactinuser&pass.xlsx",
				"Trail1", 4, 0));
		
		
		WebElement s20 = driver.findElement(By.id("book_now"));
		v.btnClick(s20);
		
		
		
		
		
		
		
		
		
		
	}
	

}
