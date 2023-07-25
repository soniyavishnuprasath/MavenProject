package ActionsClassMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActitimeLoginByActions {
public static void main(String[] args) throws Throwable {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));
	driver.get("https://demo.actitime.com/");
	WebElement usernameTextField = driver.findElement(By.id("username"));
	WebElement passwordTextField = driver.findElement(By.name("pwd"));
	WebElement loginButton = driver.findElement(By.id("loginButton"));
	Actions actions = new Actions(driver);
	actions.sendKeys(usernameTextField, "admin").pause(2000).sendKeys(passwordTextField, "manager").pause(2000).click(loginButton).build().perform();
	Thread.sleep(5000);
	driver.manage().window().maximize();
	driver.quit();
	
}
}
