package ActionsClassMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UsageOfMoveToElement {
public static void main(String[] args) throws Throwable {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));
	driver.get("https://www.facebook.com/");
	WebElement forgotpasswordlink = driver.findElement(By.linkText("Forgotten password?"));
	Actions actions = new Actions(driver);
	actions.moveToElement(forgotpasswordlink).perform();
	Thread.sleep(3000);
	driver.manage().window().minimize();
	driver.quit();
	}
}
