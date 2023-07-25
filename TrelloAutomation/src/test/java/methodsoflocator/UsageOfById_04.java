package methodsoflocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfById_04 {
	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://shop-global.malaicha.com/");
		driver.findElement(By.id("my-acc-btn")).click();
		Thread.sleep(2000);
		driver.manage().window().minimize();
		driver.quit();
		
		
		
	}

}
