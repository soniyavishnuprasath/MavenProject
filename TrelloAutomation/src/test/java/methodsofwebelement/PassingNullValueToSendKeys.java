package methodsofwebelement;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PassingNullValueToSendKeys {
	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/");
		Thread.sleep(2000);
		//we can't pass null value to sendkeys method
		//IllegalArgumentException -java Exception-Runtime-Unchecked Exception
		//driver.findElement(By.id("username")).sendKeys(null);
		Thread.sleep(2000);
	
		
	}

}
