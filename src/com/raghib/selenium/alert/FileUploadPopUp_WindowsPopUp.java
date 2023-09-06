package com.raghib.selenium.alert;

/**
 * REFERENCE:-
 * https://www.youtube.com/watch?v=g5HyaG3RABg
 * 
 */

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.raghib.selenium.BaseClass;

public class FileUploadPopUp_WindowsPopUp extends BaseClass {

	public static WebDriver driver;
	public static String browserName = "chrome";
	public static String browserVersion = "116";
	
	public static String url = "https://html.com/input-type-file/";
	
	public static void main(String[] args) throws InterruptedException {
		// Chrome Browser
		driver = BaseClass.getDriver(browserName, browserVersion);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.get(url);
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='fileupload']")).sendKeys(System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
		//BaseClass.quitDriver();
	}
}
