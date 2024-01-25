package com.cgi.steps;

import org.testng.Assert;

import com.cgi.base.AutomationWrapper;
import com.cgi.pages.LoginPage;
import com.cgi.pages.MainPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Demo1Steps {
	private AutomationWrapper wrapper;
	private LoginPage login;
	private MainPage main;

	public Demo1Steps(AutomationWrapper wrapper) {
		this.wrapper = wrapper;
	}

	@Given("I have browser with OpenEMR application")
	public void i_have_browser_with_open_emr_application() {

		wrapper.launchBrowser();
		initPageObjects();
	}

	public void initPageObjects() {
		login = new LoginPage(wrapper.driver);
		main = new MainPage(wrapper.driver);
	}

	@When("I enter username as {string}")
	public void i_enter_username_as(String username) {
		login.enterUsername(username);
	}

	@When("I enter password as {string}")
	public void i_enter_password_as(String password) {
		login.enterPassword(password);
	}

	@When("I click on login")
	public void i_click_on_login() {
		login.clickOnLogin();
	}

	@Then("I should get access to the portal with title {string}")
	public void i_should_get_access_to_the_portal_with_title(String expectedTitle) {
		Assert.assertEquals(main.getMainPageTitle(), expectedTitle);
	}

	@Then("I should not get access to portal with error as {string}")
	public void i_should_not_get_access_to_portal_with_error_as(String expectedError) {
		Assert.assertEquals(login.getErrorMessage(), expectedError);
	}

}
