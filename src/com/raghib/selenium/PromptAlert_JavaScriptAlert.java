package com.raghib.selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import java.time.Duration;

/* REFERENCE:-
 * https://www.youtube.com/watch?v=-YisTWnCItM
 */

public class PromptAlert_JavaScriptAlert {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[3]/button")).click();
		
		Alert alert = driver.switchTo().alert();
		String text = alert.getText();
		System.out.println("Message : "+text);
		alert.sendKeys("Hi Raghib");
		alert.accept();
		if(driver.getPageSource().contains("You entered: Hi Raghib")) {
			System.out.println("You successfully clicked an alert!");			
		} else {
			System.out.println("You failed to clicked an alert!");
		}
		
		driver.quit();
		
	}

}
