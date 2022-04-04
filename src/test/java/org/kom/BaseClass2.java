package org.kom;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass2 {
	public static void main(String[] args) {
		BaseClass3 s = new BaseClass3();
		WebDriver driver = s.launchBrowser();
		
		s.launchUrl(driver, "https://www.facebook.com/");
		
		
		WebElement txtUser = driver.findElement(By.id("email"));
		s.type(txtUser, "greens");
		
		WebElement txtPass = driver.findElement(By.id("pass"));
		s.type(txtPass, "tech");
		
		WebElement btnLogin = driver.findElement(By.name("login"));
		s.btnClick(btnLogin);
		
		
		

	}

}
