package methodsofwebelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/* conditions for submit method 
 * 1.the tag name should be button or input
 * 2.attribute type should be submit
 * 3.should should be inside form tag*/
public class UsageOfSubmitMethod {
	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.vtiger.com/vtigercrm/");
		Thread.sleep(2000);
		//identify the sign in button
		WebElement signinButton = driver.findElement(By.xpath("//button[text()='Sign in']"));
		signinButton.submit();
		Thread.sleep(8000);
		driver.manage().window().minimize();
		driver.quit();
	}

}
