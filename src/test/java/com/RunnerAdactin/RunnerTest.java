package com.RunnerAdactin;

import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.baseclass.AdactinBaseclass;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import io.github.bonigarcia.wdm.WebDriverManager;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src//test//java//com//FeatureAdactin", glue = "com.StepDefinition"
, tags = ("@Login,@Searchhotel,@selectHotel,@UserDetail")  // while using this we can hide stepdefinitionadactin class
//,tags = ("@Login,@MultipleLLogin")
,plugin = {"html:Report/Cucumber_Report", "pretty", "json:Report/Cucumber.json",  "com.cucumber.listener.ExtentCucumberFormatter:Folder/File.html"}
)


//public class RunnerTest		>>BEFORE BASE CLASS
public class RunnerTest extends AdactinBaseclass {

	public static WebDriver driver;

	@BeforeClass
	public static void BrowserLaunch() {
//		 BEFORE BASE CLASS IMPLEMENTATION
//		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");
//		 driver = new ChromeDriver();
//		 driver.manage().window().maximize();

//		WebDriverManager.chromedriver().setup();      //NEW CONCEPT
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(30, TimeUnit.MILLISECONDS);
	driver =	browserOpen();
		 

	}

	@AfterClass
	public static void BrowserClose() {
//		driver.close();
		// urlClose();

	}

}
