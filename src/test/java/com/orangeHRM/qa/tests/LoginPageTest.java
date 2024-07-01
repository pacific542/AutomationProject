package com.orangeHRM.qa.tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.orangeHRM.qa.pages.HomePage;
import com.orangeHRM.qa.pages.LoginPage;
import com.orangeHRM.qa.testbase.TestBase;

public class LoginPageTest extends TestBase {
	public LoginPage loginPage = new LoginPage();
	public HomePage homePage;

	

	@BeforeMethod
	public void setup() {
		initialization();
		homePage = loginPage.loginIntoApplication();

	}

	@Test
	public void verifyLogin() {
		System.out.println("change 1");
		Assert.assertTrue(homePage.validateUsername());

	}

	@AfterMethod
	public void kill() {
		driver.quit();
	}
}
