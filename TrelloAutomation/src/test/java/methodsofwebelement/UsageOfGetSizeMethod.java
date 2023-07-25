package methodsofwebelement;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfGetSizeMethod {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.actitime.com/");
	WebElement usernameTextField = driver.findElement(By.id("username"));
	Dimension userNameSize = usernameTextField.getSize();
	System.out.println("userNameSize= "+userNameSize);
	int usernameHeight = userNameSize.getHeight();
	System.out.println("usernameHeight = "+usernameHeight);
	int usernameWidth = userNameSize.width;
	System.out.println("usernameWidth = "+usernameWidth);
	driver.manage().window().minimize();
	driver.quit();
	
}
}
