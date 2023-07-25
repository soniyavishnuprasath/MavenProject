package com.actitime.generic;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginUsingGenericMethod {
public static void main(String[] args) throws IOException {
	UsageOfGenericMethods use=new UsageOfGenericMethods();
	String url = use.getDataFromProperty("url");
	String un = use.getDataFromProperty("username");
	String pwd = use.getDataFromProperty("password");
	System.out.println(url);
	System.out.println(un);
	System.out.println(pwd);
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get(url);
	driver.findElement(By.id("username")).sendKeys(un);
	driver.findElement(By.name("pwd")).sendKeys(pwd);
	driver.findElement(By.xpath("//div[.='Login ']")).click();
	driver.manage().window().minimize();
	driver.quit();
	
}
}
