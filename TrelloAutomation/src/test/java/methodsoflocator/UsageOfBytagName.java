package methodsoflocator;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfBytagName {
	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.shoppersstack.com/");
//		Thread.sleep(10000);
		/*shoppersstack login
--------------------------
<button 
id="loginBtn" (not possible)---its possible with try and catch block..synchronization concept 
name="loginBtn" (not possible)
class="navbar_Loginbutton__8r9bE"(not possible)
>Login</button> (with tagName its possible to click on login button)
------------------------------------
*/
		for(;;) {
		
		try {
			WebElement  loginButton = driver.findElement(By.id("loginBtn"));
			loginButton.click();
			break;
		} catch (NoSuchElementException e) {
			Thread.sleep(2000);
		}
		}
//		driver.findElement(By.tagName("button")).click();
		//Thread.sleep(3000);
		//driver.quit();
	}

}
