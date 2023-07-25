package methodsoflocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfRandomXpath {
	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://shop-global.malaicha.com/");
		//xpath by complete attribute value (id as attribute )
		//driver.findElement(By.xpath("//button[@id='my-acc-btn']")).click();
		//xpath by complete attribute value (class as attribute)
		//driver.findElement(By.xpath("//button[@class='transparent']")).click();
		//xpath by partial attribute value id as attribute
		//driver.findElement(By.xpath("//button[contains(@id,'my-acc')]")).click();
		//xpath by complete main tagText
		driver.findElement(By.xpath("//button[contains(.,'Register')]")).click();
		Thread.sleep(3000);
		driver.manage().window().minimize();
		driver.quit();
	}

}
