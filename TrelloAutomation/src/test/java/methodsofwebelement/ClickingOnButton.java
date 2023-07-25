package methodsofwebelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickingOnButton {
public static void main(String[] args) throws Throwable {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	WebElement facebookLogin = driver.findElement(By.name("login"));
	facebookLogin.click();
	Thread.sleep(2000);
	driver.manage().window().minimize();
	driver.quit();
	
}
}
