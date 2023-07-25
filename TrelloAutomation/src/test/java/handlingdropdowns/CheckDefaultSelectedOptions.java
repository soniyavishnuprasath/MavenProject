package handlingdropdowns;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CheckDefaultSelectedOptions {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));
	driver.get("https://www.facebook.com/signup");
	WebElement dayDropdown = driver.findElement(By.id("day"));
	Select daySelect=new Select(dayDropdown);
	String defaultday = daySelect.getFirstSelectedOption().getText();
	System.out.println(defaultday);
	String defaultMonth = new Select(driver.findElement(By.id("month"))).getFirstSelectedOption().getText();
	System.out.println(defaultMonth);
	String defaultYear=new Select(driver.findElement(By.id("year"))).getFirstSelectedOption().getText();
	System.out.println(defaultYear);
	driver.manage().window().minimize();
	driver.quit();
}
}
