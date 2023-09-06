package com.raghib.selenium.alert;

/** REFERENCE:-
 * https://www.youtube.com/watch?v=-YisTWnCItM
 */

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.raghib.selenium.BaseClass;

public class ConfirmationAlert_JavaScriptAlert extends BaseClass {

	public static WebDriver driver;
	public static String browserName = "chrome";
	public static String browserVersion = "116";
	
	public static String url = "https://the-internet.herokuapp.com/javascript_alerts";
	
	public static void main(String[] args) throws InterruptedException {
		// Chrome Browser
		driver = BaseClass.getDriver(browserName, browserVersion);		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.get(url);
		
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[2]/button")).click();
		
		Alert alert = driver.switchTo().alert();
		String text = alert.getText();
		System.out.println("Message : "+text);
		alert.dismiss();
		if(driver.getPageSource().contains("You clicked: Cancel")) {
			System.out.println("You successfully clicked an alert!");			
		} else {
			System.out.println("You failed to clicked an alert!");
		}
		
		//BaseClass.quitDriver();
	}
}
