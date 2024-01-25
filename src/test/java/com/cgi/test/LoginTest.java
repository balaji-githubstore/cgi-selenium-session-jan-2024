package com.cgi.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.cgi.base.AutomationWrapper;
import com.cgi.pages.LoginPage;
import com.cgi.pages.MainPage;
import com.cgi.utils.DataUtils;

public class LoginTest extends AutomationWrapper {	
	
	@Test(dataProvider = "commonDataProvider",dataProviderClass = DataUtils.class,groups = {"login","smoke"})
	public void validLoginTest(String username,String password,String expectedTitle) {
		LoginPage login = new LoginPage(driver);

		login.enterUsername(username);
		login.enterPassword(password);
		login.clickOnLogin();

		// assert the title - OpenEMR
		MainPage main=new MainPage(driver);
		String actualTitle = main.getMainPageTitle();
		Assert.assertEquals(actualTitle, expectedTitle);
	}

	@Test(dataProvider = "commonDataProvider",dataProviderClass = DataUtils.class,groups = {"login"})
	public void invalidLoginTest(String username,String password,String expectedError) {
		LoginPage login = new LoginPage(driver);

		login.enterUsername(username);
		login.enterPassword(password);
		login.clickOnLogin();

		String actualError = login.getErrorMessage();
		Assert.assertEquals(actualError, expectedError);
	}

}
