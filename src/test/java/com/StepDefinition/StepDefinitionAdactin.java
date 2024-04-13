package com.StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.RunnerAdactin.RunnerTest;
import com.baseclass.AdactinBaseclass;
import com.pom_pojo.LoginPage;
import com.pom_pojo.Search_Hote_PAGE;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinitionAdactin extends AdactinBaseclass {

	/*
	
	// public static WebDriver driver = RunnerTest.driver;
	public static WebDriver driver = AdactinBaseclass.driver;
	LoginPage LP = new LoginPage(driver);
	
	

	@Given("^user Launch the Adactin Application$")
	public void user_Launch_the_Adactin_Application() throws Throwable {
		// driver.get("https://adactinhotelapp.com/");
		urlLaunch("https://adactinhotelapp.com/");
	}

	@When("^user enter the Username in Username field$")
	public void user_enter_the_Username_in_Username_field() throws Throwable {
		// WebElement username =
		// driver.findElement(By.xpath("//input[@name='username']"));
		// username.sendKeys("mohammedfazil");
		// elementSendkeys(username, "mohammedfazil");
		elementSendkeys(LP.getPomUsername(), "mohammedfazil");

	}

	@Then("^user enter the passworrd in password field$")
	public void user_enter_the_passworrd_in_password_field() throws Throwable {
		// WebElement password =
		// driver.findElement(By.xpath("//input[@type='password']"));
		// password.sendKeys("fazil12345");
		// elementSendkeys(password,"fazil12345");
		elementSendkeys(LP.getPomPassword(), "fazil12345");
	}

	@And("^user click the login in button$")
	public void user_click_the_login_in_button() throws Throwable {
		// WebElement Login = driver.findElement(By.id("login"));
		// Login.click();
		// elementClick(Login);
		elementClick(LP.getPomLogin());
	}

	@When("^user enter the \"([^\"]*)\" in Username field$")
	public void user_enter_the_in_Username_field(String usrname) throws Throwable {
		WebElement username = driver.findElement(By.xpath("//input[@name='username']"));
		// username.sendKeys(usrname);
		elementSendkeys(username, usrname);
	}

	@Then("^user enter the \"([^\"]*)\" in password field$")
	public void user_enter_the_in_password_field(String pswd) throws Throwable {
		WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
		// password.sendKeys(pswd);
		elementSendkeys(password, pswd);
	}
	
	*/

}
