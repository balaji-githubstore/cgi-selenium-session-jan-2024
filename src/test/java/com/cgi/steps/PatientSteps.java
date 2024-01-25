package com.cgi.steps;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebDriver;

import com.cgi.base.AutomationWrapper;
import com.cgi.pages.LoginPage;
import com.cgi.pages.MainPage;
import com.cgi.pages.SearchOrAddPatientPage;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PatientSteps {
	
	private AutomationWrapper wrapper;
	private MainPage main;
	private SearchOrAddPatientPage sp;

	public PatientSteps(AutomationWrapper wrapper) {
		this.wrapper = wrapper;
		initPageObjects();
	}

	public void initPageObjects() {
		main = new MainPage(wrapper.driver);
		sp=new SearchOrAddPatientPage(wrapper.driver);
	}

	@When("I click on patient menu")
	public void i_click_on_patient_menu() {
	    main.clickOnPatientMenu();
	}
	@When("I click on new-search menu")
	public void i_click_on_new_search_menu() {
	    main.clickOnNewSearchMenu();
	}
	@When("I enter firstname as {string}")
	public void i_enter_firstname_as(String firstName) throws InterruptedException {
	    sp.enterFirstName(firstName);
	    Thread.sleep(5000);
	}
	
	@When("I fill the add patient form")
	public void i_fill_the_add_patient_form(DataTable dataTable) {
		
		System.out.println(dataTable);
		
		List<Map<String, String>> ls= dataTable.asMaps();
		System.out.println(ls.get(0));
		
		System.out.println(ls.get(0).get("firstname"));
		sp.enterFirstName(ls.get(0).get("firstname"));
		sp.enterLastName(ls.get(0).get("lastname"));
		
	}
	@When("I click on create new patient")
	public void i_click_on_create_new_patient() {
	   
	}
	@When("I click on confirm create new patient")
	public void i_click_on_confirm_create_new_patient() {
	  
	}
	@When("I handle the alert box")
	public void i_handle_the_alert_box() {
	   
	}
	@When("I close the birthday popup")
	public void i_close_the_birthday_popup() {
	    
	}
	@Then("I should get the added patient profile {string}")
	public void i_should_get_the_added_patient_profile(String expectedPatientProfile) {

	}

}
