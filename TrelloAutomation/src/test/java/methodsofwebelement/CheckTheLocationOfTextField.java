package methodsofwebelement;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckTheLocationOfTextField {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.actitime.com/");
	//find the location of username textfield
	Point usernameLocation = driver.findElement(By.id("username")).getLocation();
	System.out.println("usernameLocation = "+usernameLocation);
	Point passwordLocation = driver.findElement(By.name("pwd")).getLocation();
	System.out.println("passwordLocation = "+passwordLocation);
	driver.manage().window().minimize();
	driver.quit();
}
}
