package methodsoflocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NoSuchElementExceptionBczWrongAddress {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		 //find the login button
		 //NoSuchElementException - run - unchecked - Selenium
		 //Reason - When we write the wrong address
		 WebElement loginButton = driver.findElement(By.id("u_0_5_dm"));
		 // Interact with the login button - click
		 loginButton.click();

	}

}
