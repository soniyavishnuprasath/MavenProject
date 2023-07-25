package ActionsClassMethods;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CompositeActions {
public static void main(String[] args) throws Throwable {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));
	driver.get("https://www.myntra.com/");
	List<WebElement> allMenuOptions = driver.findElements(By.className("desktop-main"));
	Actions actions = new Actions(driver);
	for (WebElement options : allMenuOptions) {
		actions.moveToElement(options).pause(2000).perform();
	}
	Thread.sleep(2000);
	driver.manage().window().minimize();
	driver.quit();
}
}
