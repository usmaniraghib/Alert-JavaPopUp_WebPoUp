package com.raghib.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaPopUpAlert {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\SELENIUM\\browser-driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.tizag.com/javascriptT/javascriptalert.php");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='button']")).click();
		Thread.sleep(2000);
		System.out.println("JAVA POP UP MESSAGE : "+driver.switchTo().alert().getText());
		//driver.switchTo().alert().sendKeys("Hi");
		driver.switchTo().alert().accept();	 //Accept = ok done yes
		//driver.switchTo().alert().dismiss();		
		driver.quit();
	}
}
