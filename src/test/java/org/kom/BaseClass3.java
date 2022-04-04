package org.kom;

import java.awt.AWTException;
import java.awt.Robot;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class BaseClass3 {
	private WebDriver driver;

	public WebDriver launchBrowser() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\USER\\eclipse-workspace\\Practice\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		return driver;

	}
	public void launchUrl(WebDriver driver, String url) {
		driver.get(url);
	}
	
	public void type(WebElement element, String data) {
		element.sendKeys(data);
	}
	
	public void btnClick(WebElement element) {
		element.click();
	}
	
	public String getPageUrl(WebDriver driver) {
		String currentUrl = driver.getCurrentUrl();
		return currentUrl;
	}
	
	public String getTitle (WebDriver driver) {
		String title = driver.getTitle();
		return title;
	}
	
	public  Class<? extends WebDriver>getClass (WebDriver driver) {
		Class<? extends WebDriver> class1 = driver.getClass();
		return class1;
	}
	
	public String getPagesource (WebDriver driver) {
		String pageSource = driver.getPageSource();
		return pageSource;
	}
	
	public Set<String> getAllwindow(WebDriver driver ) {
		Set<String> windowHandles = driver.getWindowHandles();
		return windowHandles;
	}
	
	public String getParentwindow(WebDriver driver) {
		String windowHandle = driver.getWindowHandle();
		return windowHandle;
		
	}
	
	public WebElement tagName (WebDriver driver, String data ) {
		WebElement findElement = driver.findElement(By.tagName(data));
		return findElement;
		
	}
	
	public String getAttribute (WebElement e , String AttributeName) {
		String attribute = e.getAttribute(AttributeName);
		return attribute;
	}
	
	public String getAttributeValue (WebElement s , String attributevalue) {
		String attribute1 = s.getAttribute(attributevalue);
		return attribute1;
		
	}
	
	public Object getOptions (WebElement element) {
		Object screenshotAs = element.getScreenshotAs(null);
		return screenshotAs;	
	}
	
	public boolean isSelected (WebElement s ) {
		boolean displayed = s.isDisplayed();
		return displayed;
	}
	
	public boolean isDisplayed (WebElement s) {
		boolean b = s.isDisplayed();
		return b;
	}
	
	public boolean isEnabled (WebElement s) {
		boolean c = s.isEnabled();
		return c;
	}
	
	public void dragAndDrop(WebElement e, WebElement d) {
		Actions a = new Actions (driver);
		a.dragAndDrop(e,d).perform();
	}
	
	public void moveToElement (WebElement element) {
		Actions a = new Actions (driver);
		a.moveToElement(element);
	}
	
	public void doubleClick (WebElement element) {
		Actions a = new Actions (driver);
		a.doubleClick(element);
	}
		public void contextClick(WebElement element) {
		Actions a = new Actions (driver);
		a.contextClick(element);
	}
		public void robot (WebElement e) throws AWTException{
			Robot r =new Robot();
			r.keyPress();
		}
			
			
	
	public void jdInsert(String data,WebElement element) {
		JavascriptExecutor jd = (JavascriptExecutor)driver;
		jd.executeScript("arguments[0].setAttribute('value','"+data+"')",element );
	}
	
	public void jdClick(WebElement element) {
		JavascriptExecutor jk = (JavascriptExecutor)driver;
		jk.executeScript("arguments[0].click()", element);
	}
	
	public void jdDown(WebElement element) {
		JavascriptExecutor jl = (JavascriptExecutor)driver;
		jl.executeScript("arguments[0].setScrollIntoView(true)", element);
	}
	
	public void dropAndDown(WebElement element, String data) {
		Select sel = new Select(element);
		sel.selectByVisibleText(data);
	}
	
		
		
		
	
	
	
	

		
	}
	
	
	
	

}
