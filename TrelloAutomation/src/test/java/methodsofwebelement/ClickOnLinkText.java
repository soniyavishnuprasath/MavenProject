package methodsofwebelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickOnLinkText {
	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		//find the forgot password link and click on it
		//finding using linkText
		WebElement forgotLink = driver.findElement(By.linkText("Forgotten password?"));
		forgotLink.click();
		Thread.sleep(3000);
		driver.manage().window().minimize();
		driver.quit();
	}

}
