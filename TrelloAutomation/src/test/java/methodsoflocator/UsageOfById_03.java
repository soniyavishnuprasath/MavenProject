package methodsoflocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfById_03 {
	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/");
		//find the login button and click it
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(2000);
		driver.quit();
	}

}
