package ActionsClassMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CompositeAction1 {
	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));
		driver.get("https://www.myntra.com/");
		WebElement mensSection = driver.findElement(By.xpath("//a[@class=\"desktop-main\" and text()='Men']"));
		Actions actions = new Actions(driver);
		actions.moveToElement(mensSection).pause(2000).moveToElement(mensSection, 75, 0).pause(2000).moveToElement(mensSection, 148, 0).pause(2000).moveToElement(mensSection, 245, 0).pause(2000).moveToElement(mensSection, 353, 0).pause(2000).moveToElement(mensSection, 438, 0).build().perform();
		Thread.sleep(2000);
		driver.manage().window().minimize();
		driver.quit();
	}

}
