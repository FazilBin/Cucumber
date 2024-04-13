package com.pom_pojo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search_Hote_PAGE {

	public static WebDriver SHdriver;

	
	public Search_Hote_PAGE(WebDriver driver) {
		this.SHdriver = driver;
		PageFactory.initElements(SHdriver, this);
		
	}
	
	
	@FindBy(xpath = "//select[@name='location']")
	private WebElement location;

	@FindBy(id = "hotels")
	private WebElement hotel;

	@FindBy(id = "room_type")
	private WebElement roomtype;

	@FindBy(id = "room_nos")
	private WebElement roomCount;

	@FindBy(xpath ="//input[@name='datepick_in']")
	private WebElement CKIN;

	@FindBy(xpath = "//input[@name='datepick_out']")
	private WebElement CKOUT;

	@FindBy(xpath = "//select[@name='adult_room']")
	private WebElement adultCount;

	@FindBy(xpath = "//select[@name='child_room']")
	private WebElement childCount;

	@FindBy(id = "Submit")
	private WebElement SHsearch;
	
	@FindBy(xpath = "//input[@type='radio']")
	private WebElement select_hotel;
	
	
	@FindBy(id = "continue")
	private WebElement selHotContinue;


	

	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotel() {
		return hotel;
	}

	public WebElement getRoomtype() {
		return roomtype;
	}

	public WebElement getRoomCount() {
		return roomCount;
	}

	public WebElement getCKIN() {
		return CKIN;
	}

	public WebElement getCKOUT() {
		return CKOUT;
	}

	public WebElement getAdultCount() {
		return adultCount;
	}

	public WebElement getChildCount() {
		return childCount;
	}

	public WebElement getSHsearch() {
		return SHsearch;
	}

	public WebElement getSelect_hotel() {
		return select_hotel;
	}

	public WebElement getSelHotContinue() {
		return selHotContinue;
	}

	
}
