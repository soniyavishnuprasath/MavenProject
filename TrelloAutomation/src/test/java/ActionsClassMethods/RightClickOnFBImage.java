package ActionsClassMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RightClickOnFBImage {
public static void main(String[] args) throws Throwable {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));
	driver.get("https://www.facebook.com/");
	WebElement facebookImage = driver.findElement(By.cssSelector("img[alt=\"Facebook\"]"));
	Actions actions=new Actions(driver);
	actions.contextClick(facebookImage).perform();
	Thread.sleep(2000);
	//driver.manage().window().minimize();
	driver.quit();
}
}
