package com.sdpAdactin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.pom_pojo.LoginPage;
import com.pom_pojo.Search_Hote_PAGE;
import com.pom_pojo.User_detail_Page;

public class PageObjectManager {

	public static WebDriver sDPdriver;

	// Constructor to initialize the WebDriver
	public PageObjectManager(WebDriver driver) {
		this.sDPdriver = driver;
		PageFactory.initElements(sDPdriver, this);
		
	}

	// PageObject references
	private LoginPage LP;

	private Search_Hote_PAGE SH;
	
	private User_detail_Page UDp;

	// Getter method to return > LoginPage object -- Search_Hote_PAGE object -- ser_detail_Page object
  
	public LoginPage getLP() {
		LP = new LoginPage(sDPdriver);
		return LP;
	}

	public Search_Hote_PAGE getSH() {
		SH = new Search_Hote_PAGE(sDPdriver);
		return SH;
	}

	public User_detail_Page getUDp() {
		UDp = new User_detail_Page(sDPdriver);
		return UDp;
	}

	
}
