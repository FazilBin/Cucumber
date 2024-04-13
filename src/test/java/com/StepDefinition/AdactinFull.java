package com.StepDefinition;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.RunnerAdactin.RunnerTest;
import com.baseclass.AdactinBaseclass;
import com.pom_pojo.LoginPage;
import com.pom_pojo.Search_Hote_PAGE;
import com.pom_pojo.User_detail_Page;
import com.sdpAdactin.PageObjectManager;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AdactinFull extends AdactinBaseclass {
	public static WebDriver driver = RunnerTest.driver;
	public static Select select;

//	LoginPage LP = new LoginPage(driver);
// Search_Hote_PAGE SH = new Search_Hote_PAGE(driver);
//	User_detail_Page UDP = new User_detail_Page(driver);

	PageObjectManager pom = new PageObjectManager(driver);
//	User_detail_Page UDP = new User_detail_Page(driver);

	@Given("^user Launch the Adactin Application$")
	public void user_Launch_the_Adactin_Application() throws Throwable {
		driver.get("https://adactinhotelapp.com/");
	}

	@When("^user enter the Username in Username field$")
	public void user_enter_the_Username_in_Username_field() throws Throwable {
//		WebElement username = driver.findElement(By.xpath("//input[@name='username']"));
//		username.sendKeys("mohammedfazil"); 
//		LP.getPomUsername().sendKeys("mohammedfazil");
		// pom.getLP().getPomPassword().sendKeys("mohammedfazil");
		elementSendkeys(pom.getLP().getPomUsername(), "mohammedfazil");

	}

	@Then("^user enter the passworrd in password field$")
	public void user_enter_the_passworrd_in_password_field() throws Throwable {
//		WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
//		password.sendKeys("fazil12345");
//		LP.getPomPassword().sendKeys("fazil12345");
		elementSendkeys(pom.getLP().getPomPassword(), "fazil12345");
	}

	@And("^user click the login in button$")
	public void user_click_the_login_in_button() throws Throwable {
//		WebElement Login = driver.findElement(By.id("login"));
//		Login.click();
		// LP.getPomLogin().click();
		elementClick(pom.getLP().getPomLogin());
	}

	@When("^user select the location in Location Field$")
	public void user_select_the_location_in_Location_Field() throws Throwable {
		// WebElement locations =
		// driver.findElement(By.xpath("//select[@name='location']"));
		// select = new Select(locations);
		// select = new Select(SH.getLocation());
		select = new Select(pom.getSH().getLocation());
		List<WebElement> options = select.getOptions();
		for (WebElement locationOptions : options) { // FOR Each
			System.out.println("Location Options " + locationOptions.getText());
		}
		select.selectByValue("Paris");

	}

	@Then("^user select the hotel in hotel Field$")
	public void user_select_the_hotel_in_hotel_Field() throws Throwable {
//		WebElement hol = driver.findElement(By.id("hotels"));
//		select = new Select(hol);
//		select = new Select(SH.getHotel());
		select = new Select(pom.getSH().getHotel());
		select.selectByValue("Hotel Hervey");
	}

	@Then("^user select the roomtype in roomtype Field$")
	public void user_select_the_roomtype_in_roomtype_Field() throws Throwable {
//		WebElement roomtyp = driver.findElement(By.id("room_type"));
//		select = new Select(roomtyp);
//		select = new Select(SH.getRoomtype());
		select = new Select(pom.getSH().getRoomtype());

		select.selectByValue("Deluxe");
	}

	@Then("^user select the NoOfRooms in NoOfRooms Field$")
	public void user_select_the_NoOfRooms_in_NoOfRooms_Field() throws Throwable {
//		WebElement room = driver.findElement(By.id("room_nos"));
//		select = new Select(room);
//		select = new Select(SH.getRoomCount());
		select = new Select(pom.getSH().getRoomCount());
		select.selectByValue("4");
	}

	@Then("^user select the CheckinDate in CheckinDate Field$")
	public void user_select_the_CheckinDate_in_CheckinDate_Field() throws Throwable {
//		WebElement ckin = driver.findElement(By.xpath("//input[@name='datepick_in']"));
//		ckin.clear();
//		ckin.sendKeys("05/02/2024");
//		SH.getCKIN().clear();
//		SH.getCKIN().sendKeys("05/02/2024");
		pom.getSH().getCKIN().clear();
		elementSendkeys(pom.getSH().getCKIN(), "05/02/2024");

	}

	@Then("^user select the CheckOutDate in CheckOutDate Field$")
	public void user_select_the_CheckOutDate_in_CheckOutDate_Field() throws Throwable {
//		WebElement ckout = driver.findElement(By.xpath("//input[@name='datepick_out']"));
//		ckout.clear();
//		ckout.sendKeys("09/02/2024");

//		SH.getCKOUT().clear();
//		SH.getCKOUT().sendKeys("09/02/2024");

		pom.getSH().getCKOUT().clear();
		elementSendkeys(pom.getSH().getCKOUT(), "09/02/2024");

	}

	@Then("^user select the AdultsRoom in AdultsRoom Field$")
	public void user_select_the_AdultsRoom_in_AdultsRoom_Field() throws Throwable {
//		WebElement adroom = driver.findElement(By.xpath("//select[@name='adult_room']"));
//		select = new Select(adroom);
		// select = new Select(SH.getAdultCount());
		select = new Select(pom.getSH().getAdultCount());
		select.selectByVisibleText("4 - Four");

	}

	@Then("^user select the ChildrenRoom in ChildrenRoom Field$")
	public void user_select_the_ChildrenRoom_in_ChildrenRoom_Field() throws Throwable {
//		WebElement chlroom = driver.findElement(By.xpath("//select[@name='child_room']"));
//		select = new Select(chlroom);
//		select = new Select(SH.getChildCount());
		select = new Select(pom.getSH().getChildCount());
		select.selectByVisibleText("2 - Two");

	}

	@Then("^user click the Search button in searchhotel page and its navigate to select hotel$")
	public void user_click_the_Search_button_in_searchhotel_page_and_its_navigate_to_select_hotel() throws Throwable {
//		WebElement Searchbutton = driver.findElement(By.id("Submit"));
//		Searchbutton.click();
		// SH.getSHsearch().click();
		elementClick(pom.getSH().getSHsearch());

	}

	@When("^user select the hotel in  select Hotel Field$")
	public void user_select_the_hotel_in_select_Hotel_Field() throws Throwable {
//		WebElement selHotel = driver.findElement(By.xpath("//input[@type='radio']"));
//		selHotel.click();
//		SH.getSelect_hotel().click();
		elementClick(pom.getSH().getSelect_hotel());

	}

	@When("^user click the continue  button in search hotelpage$")
	public void user_click_the_continue_button_in_search_hotelpage() throws Throwable {

//		WebElement HotelCont = driver.findElement(By.id("continue"));
//		HotelCont.click();
//		SH.getSelHotContinue().click();
		elementClick(pom.getSH().getSelHotContinue());

	}

	@When("^user enter the firstname in firstname field$")
	public void user_enter_the_firstname_in_firstname_field() throws Throwable {
//		driver.findElement(By.xpath("//input[@name='first_name']")).sendKeys("mohammed");
//		UDP.getFirstName().sendKeys("mohammed");
		elementSendkeys(pom.getUDp().getFirstName(), "mohammed");
	}

	@Then("^user enter the lastname in lastname field$")
	public void user_enter_the_lastname_in_lastname_field() throws Throwable {
//		driver.findElement(By.xpath("//input[@name='last_name']")).sendKeys("fazil");
//		UDP.getLastName().sendKeys("fazil");
		elementSendkeys(pom.getUDp().getLastName(), "fazil");
	}

	@Then("^user enter the address in billing address  field$")
	public void user_enter_the_address_in_billing_address_field() throws Throwable {
//		driver.findElement(By.xpath("//textarea[@name='address']")).sendKeys("No:38, kadharbai street, Ranganthapuram");
//		UDP.getAddress().sendKeys("No:38, kadharbai street, Ranganthapuram");
		elementSendkeys(pom.getUDp().getAddress(), "No:38, kadharbai street, Ranganthapuram");
	}

	@Then("^user enter the card no in crCard  field$")
	public void user_enter_the_card_no_in_crCard_field() throws Throwable {
//		driver.findElement(By.id("cc_num")).sendKeys("1234567891234567");
//		UDP.getCard_no().sendKeys("1234567891234567");
		elementSendkeys(pom.getUDp().getCard_no(), "1234567891234567");
	}

	@Then("^user select the cardtype in  crCard type Field$")
	public void user_select_the_cardtype_in_crCard_type_Field() throws Throwable {
//		WebElement cardtype = driver.findElement(By.xpath("//select[@id='cc_type']"));
//		select = new Select(cardtype);
//		select = new Select(UDP.getCardtype());
		select = new Select(pom.getUDp().getCardtype());
		select.selectByValue("AMEX");

	}

	@Then("^user select the month in ExpiryDate Field$")
	public void user_select_the_month_in_ExpiryDate_Field() throws Throwable {
//		WebElement expmonth = driver.findElement(By.id("cc_exp_month"));
//		select = new Select(expmonth);
//		select = new Select(UDP.getExpirymonth());
		select = new Select(pom.getUDp().getExpirymonth());
		select.selectByVisibleText("September");
	}

	@Then("^user select the year in ExpiryDate Field$")
	public void user_select_the_year_in_ExpiryDate_Field() throws Throwable {
//		WebElement expyr = driver.findElement(By.xpath("//select[@name='cc_exp_year']"));
//		select = new Select(expyr);
//		select = new Select(UDP.getExpiryyear());
		select = new Select(pom.getUDp().getExpiryyear());
		select.selectByValue("2025");

	}

	@Then("^user enter the  Cvv no in cvv field$")
	public void user_enter_the_Cvv_no_in_cvv_field() throws Throwable {
//		driver.findElement(By.id("cc_cvv")).sendKeys("123");
//		UDP.getCvvNo().sendKeys("123");
		elementSendkeys(pom.getUDp().getCvvNo(), "123");
	}

	@Then("^user click the booknow  button in book hotelpage and its navigate to booking cofirmation page$")
	public void user_click_the_booknow_button_in_book_hotelpage_and_its_navigate_to_booking_cofirmation_page()
			throws Throwable {
//		driver.findElement(By.xpath("//input[@name='book_now']")).click();
//		UDP.getBooknow().click();
		elementClick(pom.getUDp().getBooknow());
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@And("^user click the itenerary button in booking confirmation page$")
	public void user_click_the_itenerary_button_in_booking_confirmation_page() throws Throwable {
//		driver.findElement(By.id("my_itinerary")).click();
//		UDP.getMyItenerary().click();
		elementClick(pom.getUDp().getMyItenerary());
	}

}
