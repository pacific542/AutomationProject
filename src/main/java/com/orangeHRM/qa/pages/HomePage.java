package com.orangeHRM.qa.pages;

import org.openqa.selenium.By;


import com.orangeHRM.qa.testbase.TestBase;

public class HomePage extends TestBase {

	By loggedInUser = By.xpath("//*[contains(text(),'user')]");
	By myInfoLink=By.xpath("//*[@href='/web/index.php/pim/viewMyDetails']");
//Changes DOne BY NItu
	public boolean validateUsername() {

		return driver.findElement(By.xpath("//*[contains(text(),'')]")).isDisplayed();

	}
	public MyInfoPage clickOnMyInfo()
	{
		driver.findElement(myInfoLink).click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return new MyInfoPage();
		
	}

}
