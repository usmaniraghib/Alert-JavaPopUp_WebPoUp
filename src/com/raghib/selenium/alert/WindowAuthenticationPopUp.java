package com.raghib.selenium.alert;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.raghib.selenium.BaseClass;

//UDEMY - SECTION-38
/*C:\Raghib_Data\Study\TESTING\New folder_2\1-B_SELANIUM\0.1Udemy - Selenium WebDriver with Java -Basics to Advanced+Frameworks\38.File Uploading (AUTO IT) & Downloading with Selenium\140XDPHH */

public class WindowAuthenticationPopUp extends BaseClass {

	public static WebDriver driver;
	public static String browserName = "chrome";
	public static String browserVersion = "116";
	
	public static String url = "http://admin:admin@the-internet.herokuapp.com/";
	
	public static void main(String[] args) throws InterruptedException {
		// Chrome Browser
		driver = BaseClass.getDriver(browserName, browserVersion);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.get(url);
		
		Thread.sleep(10000);
		driver.findElement(By.xpath("//a[contains(text(),'Basic Auth')]")).click();
		Thread.sleep(10000);
		//BaseClass.quitDriver();
	}
}
