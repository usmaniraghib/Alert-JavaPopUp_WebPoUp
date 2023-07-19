package com.raghib.selenium;

/*
 * REFERENCE:-
 * https://www.youtube.com/watch?v=g5HyaG3RABg
 * 
 */

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUploadPopUp_WindowsPopUp {

	public static void main(String[] args)throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://html.com/input-type-file/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='fileupload']")).sendKeys(System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
	}
}
