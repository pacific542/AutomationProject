package com.orangeHRM.qa.pages;

import org.openqa.selenium.By;

import com.orangeHRM.qa.testbase.TestBase;

public class LoginPage extends TestBase {

	By userName = By.xpath("//*[contains(@name,'username')]");
	By password = By.xpath("//*[contains(@name,'password')]");
	By submitBtn = By.xpath("//*[contains(@type,'submit')]");

	public HomePage loginIntoApplication() {

		driver.findElement(userName).sendKeys(prop.getProperty("username"));
		driver.findElement(password).sendKeys(prop.getProperty("password"));
		driver.findElement(submitBtn).click();
		return new HomePage();
	}

}
