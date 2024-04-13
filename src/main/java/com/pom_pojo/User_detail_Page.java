package com.pom_pojo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class User_detail_Page {
	
	
	public static WebDriver UDPdriver;
	
	
	
	@FindBy(xpath = "//input[@name='first_name']")
	private WebElement firstName;
	
	@FindBy(xpath = "//input[@name='last_name']")
	private WebElement lastName;
	
	@FindBy(xpath = "//textarea[@name='address']")
	private WebElement address;
	
	@FindBy(id = "cc_num")
	private WebElement card_no;
	
	@FindBy(xpath = "//select[@id='cc_type']")
	private WebElement cardtype;
	
	@FindBy(id = "cc_exp_month")
	private WebElement expirymonth;
	
	@FindBy(xpath = "//select[@name='cc_exp_year']")
	private WebElement expiryyear;
	
	@FindBy(id = "cc_cvv")
	private WebElement cvvNo;
	
	@FindBy(xpath = "//input[@name='book_now']")
	private WebElement booknow;
	
	@FindBy(id = "my_itinerary")
	private WebElement myItenerary;

	

	

	public User_detail_Page(WebDriver driver) {
		this.UDPdriver = driver;
		PageFactory.initElements(UDPdriver, this);
	}

	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCard_no() {
		return card_no;
	}

	public WebElement getCardtype() {
		return cardtype;
	}

	public WebElement getExpirymonth() {
		return expirymonth;
	}

	public WebElement getExpiryyear() {
		return expiryyear;
	}

	public WebElement getCvvNo() {
		return cvvNo;
	}

	public WebElement getBooknow() {
		return booknow;
	}

	public WebElement getMyItenerary() {
		return myItenerary;
	}

	
	
	
	}
	
	
	


