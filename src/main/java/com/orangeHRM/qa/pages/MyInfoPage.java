package com.orangeHRM.qa.pages;

import org.openqa.selenium.By;

import com.orangeHRM.qa.testbase.TestBase;

public class MyInfoPage extends TestBase {
	By personalDetailsHeading = By.xpath("//div[@class='orangehrm-edit-employee-content']/div/h6");
	By firstName = By.name("firstName");
	By middleName = By.name("middleName");
	By lastName = By.name("lastName");
	By employeeID = By.xpath("//*[contains(text(),'Employee Id')]/parent::div/following-sibling::div/input");
	By otherID = By.xpath("//*[contains(text(),'Other Id')]/parent::div/following-sibling::div/input");
	By driverLicenseNumber = By
			.xpath("//label[contains(text(),\"Driver's License Number\")]/parent::div/following-sibling::div/input");
	By saveBtn = By.xpath("//*[@class='oxd-form-actions']/p/following-sibling::button[contains(@type,'submit')]");

	public boolean validatePersonalDetailsHeading() {

		return driver.findElement(personalDetailsHeading).isDisplayed();

	}

	public void editPersonalDetails() {
		driver.findElement(firstName).clear();
		driver.findElement(lastName).clear();
		driver.findElement(middleName).clear();
		driver.findElement(employeeID).clear();
		driver.findElement(otherID).clear();
		driver.findElement(driverLicenseNumber).sendKeys("1234");
		driver.findElement(firstName).sendKeys("prashant");
		driver.findElement(lastName).sendKeys("yadav");
		driver.findElement(middleName).sendKeys("shankar");
		driver.findElement(employeeID).sendKeys("601");
		driver.findElement(otherID).sendKeys("4024");
		driver.findElement(driverLicenseNumber).sendKeys("1234");
		driver.findElement(saveBtn).click();
	}

}
