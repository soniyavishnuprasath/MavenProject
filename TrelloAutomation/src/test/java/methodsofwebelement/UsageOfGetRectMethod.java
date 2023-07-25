package methodsofwebelement;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfGetRectMethod {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.actitime.com/");
	//identify the username text field 
	Rectangle userNameRect = driver.findElement(By.id("username")).getRect();
	//get the starting point of the username text field
	int usernameStartX = userNameRect.getX();
	//finding the width of an username text field
	int usernameWidth = userNameRect.getWidth();
	//finding the end point of an user name text field
	int usernameEndX=usernameStartX+usernameWidth;
	System.out.println("usernameStartX = "+usernameStartX);
	System.out.println("usernameWidth = "+usernameWidth);
	System.out.println("usernameEndX = "+usernameEndX);
	//identify the password text field
	Rectangle passwordRect =driver.findElement(By.name("pwd")).getRect();
	//get the starting point of the password text field
		int passwordStartX = passwordRect.getX();
		//finding the width of an password text field
		int passwordWidth = passwordRect.getWidth();
		//finding the end point of an user name text field
		int passwordEndX=passwordStartX+passwordWidth;
		System.out.println("passwordStartX = "+passwordStartX);
		System.out.println("usernameWidth = "+passwordWidth);
		System.out.println("passwordEndX = "+passwordEndX);
		
	driver.manage().window().minimize();
	driver.quit();
}
}
