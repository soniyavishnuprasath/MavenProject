package methodsofwebelement;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckLeftAndRightAlignmentOftwoTextField {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Rectangle emailRect = driver.findElement(By.id("email")).getRect();
		Rectangle passwordRect = driver.findElement(By.id("passContainer")).getRect();
		System.out.println(emailRect.getX());
		System.out.println(emailRect.getWidth());
		int usernameEndX=emailRect.getX()+emailRect.getWidth();
		System.out.println(passwordRect.getX());
		System.out.println(passwordRect.getWidth());
		int passwordEndX=passwordRect.getX()+passwordRect.getWidth();
		if(emailRect.getX()==passwordRect.getX())
			System.out.println("pass : left alignment of username textfield and password textfield is found correct and its verfied ");
		else
			System.out.println("fail : left alignment of username textfield and password textfield is found incorrect and its verfied");
		if(usernameEndX==passwordEndX)
			System.out.println("pass : right alignment of username textfield and password textfield is found correct and its verfied");
		else
			System.out.println("fail : right alignment of username textfield and password textfield is found correct and its verfied");
		driver.manage().window().minimize();
		driver.quit();
	}

}
