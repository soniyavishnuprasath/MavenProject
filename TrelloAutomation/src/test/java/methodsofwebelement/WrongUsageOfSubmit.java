package methodsofwebelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WrongUsageOfSubmit {
	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/");
		Thread.sleep(2000);
		//identify the login button
		WebElement loginButton = driver.findElement(By.id("loginButton"));
		//UnsupportedOperationException--java--runtime---unchecked
		/*submit can be called upon the <form> nested element 
		 * it should be input tag or button tag
		 * the attribute type should be submit*/
		loginButton.submit();
		
	}

}
