package methodsofwebelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DataAppendUsingSendKeys {
public static void main(String[] args) throws Throwable {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.vtiger.com/vtigercrm/");
	Thread.sleep(2000);
	//identify the user name text field
	WebElement userName = driver.findElement(By.id("username"));
	/*userName.sendKeys("selenium"); -- this is appending data to the same text field 
	 * without clearing data,
	 * so we have to use clear() method as a post condition for sendkeys() method*/
	Thread.sleep(2000);
	userName.clear();
	Thread.sleep(2000);
	userName.sendKeys("selenium");
	Thread.sleep(2000);
	driver.manage().window().minimize();
	driver.quit();
}
}
