package methodsoflocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class UsageOfByPartialLinkText {
	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://alvas.org/");
		
		WebElement college = driver.findElement(By.xpath("(//a[contains(.,'Medical Laboratory Technology')])[3]"));
		//scroll it down to the link
//		Thread.sleep(3000);
		  Actions actions = new Actions(driver);
		for(;;) {
			 actions.scrollByAmount(0, 100).pause(3000).build().perform();
			  actions.pause(2000).moveToElement(college).click(college).build().perform();

		}
		  
		 
		
//		Thread.sleep(3000);
//		college.click();
		
		//Thread.sleep(3000);
		//driver.quit();
	}

}
