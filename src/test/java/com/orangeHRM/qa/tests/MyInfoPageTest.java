package com.orangeHRM.qa.tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.orangeHRM.qa.pages.HomePage;
import com.orangeHRM.qa.pages.LoginPage;
import com.orangeHRM.qa.pages.MyInfoPage;
import com.orangeHRM.qa.testbase.TestBase;

public class MyInfoPageTest extends TestBase{
	public static LoginPage loginPage;
	public static HomePage homePage;
	public static  MyInfoPage myInfoPage;
	@BeforeMethod
	public void setup()
	{
		initialization();
		loginPage=new LoginPage();
		homePage=loginPage.loginIntoApplication();
		myInfoPage=homePage.clickOnMyInfo();
		
		
	}

	@Test(enabled = false)
	public void validateUserIsAbleToSeePersonalDetails()
	{
		Assert.assertTrue(myInfoPage.validatePersonalDetailsHeading());
	}
	@Test
	public void validateUserCanEditPersonalDetails()
	{
		myInfoPage.editPersonalDetails();
	}
	
	
	@AfterMethod
	public void kill()
	{
		driver.quit();
	}
}
