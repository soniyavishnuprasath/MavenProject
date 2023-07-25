package methodsoflocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfPartialLinkText {
	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.nbtindia.gov.in/");
		//in <a> tag unbreakable space is there so moving to partialLinkText
		driver.findElement(By.partialLinkText("CATALOGUES")).click();
		Thread.sleep(3000);
		driver.quit();
		
	}

}
