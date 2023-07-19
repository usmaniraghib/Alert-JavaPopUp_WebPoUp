package com.raghib.selenium;

/*
 * REFERENCE:-
 * https://www.youtube.com/watch?v=g5HyaG3RABg
 * 
 */

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SimpleAlert_JavaScriptAlert {

	public static void main(String[] args) throws InterruptedException {
		//System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/div[2]/form/div[1]/div[2]/div[2]/div[2]/div/input[2]")).click();
		Thread.sleep(2000);
		
		Alert alert = driver.switchTo().alert();
		System.out.println("JAVA POP UP MESSAGE : "+alert.getText());
		//alert.sendKeys("Hi");
		alert.accept();	 //Accept = ok done yes
		//alert.dismiss();		
		driver.quit();
	}
}
