package handlingdropdowns;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EvaluateDropDownType {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
	driver.get("https://www.facebook.com/signup");
	//identify the month dropdown
	WebElement monthDropdown = driver.findElement(By.id("month"));
	//create a select class obj for webelement reference
	Select monthselect=new Select(monthDropdown);
	if(monthselect.isMultiple())
	{
		System.out.println("boolean true , multi-select dropdown");
	}
	else
	{
		System.out.println("boolean false , single-select dropdown");
	}
	driver.manage().window().minimize();
	driver.quit();
}
}
