package com.orangeHRM.qa.testbase;

import java.io.File;
import java.io.FileInputStream;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.orangeHRM.qa.util.Utils;

public class TestBase {
	public static Properties prop=new Properties();
	public static WebDriver driver;
	
	public TestBase() {
		
		try {
			File f = new File(
					"C:\\Users\\prash\\eclipse-workspace3\\OrangeHRMAutomation\\src\\main\\resources\\com\\orangeHRM\\qa\\config\\config.properties");

			FileInputStream fis = new FileInputStream(f);
			prop.load(fis);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void initialization() {

		
		System.setProperty("webdriver.chromedriver.driver","C:\\Users\\prash\\eclipse-workspace3\\OrangeHRMAutomation\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(prop.getProperty("url"));
		driver.manage().timeouts().pageLoadTimeout(Utils.page_load_timeout, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(Utils.implicit_wait, TimeUnit.SECONDS);

	}
}
