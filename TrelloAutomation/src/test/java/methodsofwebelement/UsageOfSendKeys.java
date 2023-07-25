package methodsofwebelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfSendKeys {
	public static void main(String[] args) throws Throwable {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/");
		Thread.sleep(3000);
		//identify the user name text field
		WebElement userNameTextField = driver.findElement(By.id("username"));
		userNameTextField.sendKeys("admin");
		Thread.sleep(3000);
		driver.manage().window().minimize();
		driver.quit();
		
	}

}
