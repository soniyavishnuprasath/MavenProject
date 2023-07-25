package methodsofwebelement;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfGetLocation {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	WebElement emailTextField = driver.findElement(By.id("email"));
	Point emailLocation = emailTextField.getLocation();
	System.out.println("emailLocation = "+emailLocation);
	int emailStartX = emailLocation.x;//.x and .getx() both are giving same output.
	System.out.println("emailStartX = "+emailStartX);
	int emailStartY = emailLocation.getY();
	System.out.println("emailStartY = "+emailStartY);
	driver.manage().window().minimize();
	driver.quit();
}
}
