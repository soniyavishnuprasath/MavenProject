package methodsofwebelement;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyBoardSimulationBySendKeysMethod {
	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		WebElement emailTextField = driver.findElement(By.id("email"));
		emailTextField.sendKeys("soni.neverfear@gmail.com");
		Thread.sleep(3000);
		//pressing 2times tab button and one time enter button to login
		emailTextField.sendKeys(Keys.TAB,Keys.TAB,Keys.ENTER);
		Thread.sleep(2000);
		driver.manage().window().minimize();
		driver.quit();
	}

}
