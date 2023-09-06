package com.raghib.selenium.alert;

/**
 * REFERENCE:-
 * https://www.youtube.com/watch?v=g5HyaG3RABg
 * 
 */

import java.time.Duration;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.raghib.selenium.BaseClass;

public class SimpleAlert_JavaScriptAlert extends BaseClass {

	public static WebDriver driver;
	public static String browserName = "chrome";
	public static String browserVersion = "116";
	
	public static String url = "https://mail.rediff.com/cgi-bin/login.cgi";
	
	public static void main(String[] args) throws InterruptedException {
		// Chrome Browser
		driver = BaseClass.getDriver(browserName, browserVersion);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.get(url);
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/div[2]/form/div[1]/div[2]/div[2]/div[2]/div/input[2]")).click();
		Thread.sleep(2000);
		
		Alert alert = driver.switchTo().alert();
		System.out.println("JAVA POP UP MESSAGE : "+alert.getText());
		//alert.sendKeys("Hi");
		alert.accept();	 //Accept = ok done yes
		//alert.dismiss();		
		//BaseClass.quitDriver();
	}
}
