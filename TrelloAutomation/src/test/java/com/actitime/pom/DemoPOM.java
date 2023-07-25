package com.actitime.pom;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoPOM {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://demo.actitime.com/");
	/*
	 * unbtx contains the addr of username textfield after refresh the addr will be
	 * changed ,but we are referring the old addr so we are getting
	 * org.openqa.selenium.StaleElementReferenceException
	 * to overcome this need to use POM(Page Object Model)
	 */
	WebElement untbx = driver.findElement(By.id("username"));
	driver.navigate().refresh();
	untbx.sendKeys("admin");
	driver.quit();
}
}
