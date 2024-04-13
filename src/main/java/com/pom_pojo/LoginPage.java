package com.pom_pojo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	public static WebDriver LPdriver;  //  >>> NULL DRIVER
	
	
	
	
	public LoginPage(WebDriver driver) {
		this.LPdriver = driver;
		PageFactory.initElements(LPdriver, this);
	}

	@FindBy(xpath = (("//input[@name='username']")))
	private WebElement pomUsername;
	
	@FindBy(xpath= ("//input[@type='password']"))
	private WebElement pomPassword;
	
	@FindBy(id = ("login"))
	private WebElement pomLogin;

	public WebElement getPomUsername() {
		return pomUsername;
	}

	public WebElement getPomPassword() {
		return pomPassword;
	}

	public WebElement getPomLogin() {
		return pomLogin;
	}






	
	
	
	
	

}
