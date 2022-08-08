package com.sd;

import org.openqa.selenium.WebDriver;

import com.basic_class.Base_class;
import com.sdp.Page_object_manager;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Stepdefniction extends Base_class {
	
	
	public static WebDriver driver;
	public static Page_object_manager pom = new Page_object_manager();
	
	
	
	
	@Given("^user Launch The Application$")
	public void user_Launch_The_Application() throws Throwable {
		getUrl("http://automationpractice.com/index.php")
	   
	}

	@When("^user Enter The  User name field$")
	public void user_Enter_The_User_name_field() throws Throwable {
	    input(pom.getLp().getSigin(), "Nandhagopal23@gmail");
	}

	@When("^user Enter The Password Field$")
	public void user_Enter_The_Password_Field() throws Throwable {
	   input(pom.getLp().getSigin(),"KQM3CZ");
	}

	@Then("^user Click The Login Button And It navigate To Hotel Selection Page$")
	public void user_Click_The_Login_Button_And_It_navigate_To_Hotel_Selection_Page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^user Enter The Hotel Location$")
	public void user_Enter_The_Hotel_Location() throws Throwable {
	   input(pom.getCa().getClick(),"login");
	}

	@When("^user Select The Hotel$")
	public void user_Select_The_Hotel() throws Throwable {
        input(pom.getD().getNext(),"driver");
	}

	@When("^user Select The Room Type$")
	public void user_Select_The_Room_Type() throws Throwable {
	   input(pom.getP().getCard(),"image");
	}

	@When("^user Select The Number of Rooms Required$")
	public void user_Select_The_Number_of_Rooms_Required() throws Throwable {
	   input(pom.getA().getCheck(),"value");
	}

	@When("^user Select The Check In Date$")
	public void user_Select_The_Check_In_Date() throws Throwable {
	   input(pom.getF().getKing(),"king");
	}

	@When("^user Select The Check Out Data$")
	public void user_Select_The_Check_Out_Data() throws Throwable {
	    input(pom.getI().getList(),"list");
	}

	@When("^user Select The Number of Adults per Room$")
	public void user_Select_The_Number_of_Adults_per_Room() throws Throwable {
	   input(pom.getC().getPink(),"password");
	}

	@When("^user Select The Number of Children per Room$")
	public void user_Select_The_Number_of_Children_per_Room() throws Throwable {
	   input(pom.getO().getReach(),"reach");
	}

	@Then("^user Click The Search Button And It Navigate To Select Hotel Page$")
	public void user_Click_The_Search_Button_And_It_Navigate_To_Select_Hotel_Page() throws Throwable {
	   input(pom.getR().getSound(),"sound");
	}

	@When("^user Click The Radio Button$")
	public void user_Click_The_Radio_Button() throws Throwable {
	    input(pom.getR().getSound(),"sound");
	}

	@Then("^user Click The Condition Button And It Navigate To Back A Hotel Page$")
	public void user_Click_The_Condition_Button_And_It_Navigate_To_Back_A_Hotel_Page() throws Throwable {
	    input(pom.getS().getMuttai(),"backwire");
	}

	@When("^user Enter The FirstNamr In The FirstName Field$")
	public void user_Enter_The_FirstNamr_In_The_FirstName_Field() throws Throwable {
	  
	}

	@When("^Enter The LastName In The LastName Field$")
	public void enter_The_LastName_In_The_LastName_Field() throws Throwable {
	   input(pom.getA().getCheck(),"nandha");
	}

	@When("^user Enter The Billing Address In The Billing Address Field$")
	public void user_Enter_The_Billing_Address_In_The_Billing_Address_Field() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^user Enter The Credit card Number In The Credit card Number Field$")
	public void user_Enter_The_Credit_card_Number_In_The_Credit_card_Number_Field() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^user enter The Credit card Type In The Credit card Type Field$")
	public void user_enter_The_Credit_card_Type_In_The_Credit_card_Type_Field() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^user Select  The Expire Month And Year In the Expert Date Field$")
	public void user_Select_The_Expire_Month_And_Year_In_the_Expert_Date_Field() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^user Enter The Cvv Book In The Cvv Number Field$")
	public void user_Enter_The_Cvv_Book_In_The_Cvv_Number_Field() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^user  Enter The Book Now Button And It Navigate To The Booking Confirmation Page$")
	public void user_Enter_The_Book_Now_Button_And_It_Navigate_To_The_Booking_Confirmation_Page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}
	
}


	
	

