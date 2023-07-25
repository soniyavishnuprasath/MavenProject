package methodsoflocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfLinkText {
public static void main(String[] args) throws Throwable {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	//find the forgot password link and click it
	driver.findElement(By.linkText("Forgotten password?")).click();
	Thread.sleep(3000);
	driver.quit();
	
}
}
