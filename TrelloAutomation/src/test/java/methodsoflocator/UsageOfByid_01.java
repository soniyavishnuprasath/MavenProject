package methodsoflocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfByid_01 {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement emailId = driver.findElement(By.id("email"));
		emailId.sendKeys("soni.neverfear@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("a2b@basundhi");
		driver.findElement(By.name("login")).click();
		
	}

}
