package com.raghib.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

//UDEMY - SECTION-38
/*C:\Raghib_Data\Study\TESTING\New folder_2\1-B_SELANIUM\0.1Udemy - Selenium WebDriver with Java -Basics to Advanced+Frameworks\38.File Uploading (AUTO IT) & Downloading with Selenium\140XDPHH */

public class WindowAuthenticationPopUp {
	public static void main(String[] args) throws InterruptedException {
		//System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://admin:admin@the-internet.herokuapp.com/");
		driver.manage().window().maximize();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//a[contains(text(),'Basic Auth')]")).click();
		Thread.sleep(10000);
		driver.quit();
	}
}
