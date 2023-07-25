package methodsofwebelement;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClearTextFieldUsingKeysEnum {
	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		WebElement emailTextField = driver.findElement(By.id("email"));
		emailTextField.sendKeys("soniya");
		Thread.sleep(2000);
		emailTextField.sendKeys(Keys.CONTROL+"a");
		Thread.sleep(2000);
		emailTextField.sendKeys(Keys.BACK_SPACE);
		Thread.sleep(2000);
		driver.manage().window().minimize();
		driver.quit();
	}

}
