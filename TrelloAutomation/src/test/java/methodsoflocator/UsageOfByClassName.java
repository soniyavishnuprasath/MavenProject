package methodsoflocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfByClassName {
	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://shop-global.malaicha.com/");
		driver.findElement(By.className("transparent")).click();
		Thread.sleep(3000);
		driver.manage().window().minimize();
		driver.quit();
		
	}

}
