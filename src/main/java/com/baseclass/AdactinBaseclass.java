package com.baseclass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.config.WebDriverManagerException;

public class AdactinBaseclass {
	
public static WebDriver driver;   //NULL DRIVER
	

public static  WebDriver browserOpen() {
	WebDriverManager.chromedriver().setup();
	//WebDriver driver = new ChromeDriver();
	driver = new ChromeDriver();
	
//	WebDriverManager.edgedriver().setup();
//	driver = new EdgeDriver();
	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.MILLISECONDS);
	return driver;
}

	public static void urlLaunch(String url) {
			
			driver.get(url);
			
	}
	
	public static void elementSendkeys(WebElement element , String key ) {
element.sendKeys(key);
	}
	
	public static void elementClick(WebElement element) {
element.click();		
	}
	
	public static void urlClose() {
		
driver.close();
	}
	
	

}
