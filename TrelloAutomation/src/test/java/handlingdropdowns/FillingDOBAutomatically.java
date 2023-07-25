package handlingdropdowns;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FillingDOBAutomatically {
public static void main(String[] args) throws Throwable {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));
	driver.get("https://www.facebook.com/signup");
	//identify all the dropdown in webpage
	List<WebElement> allDropdowns = driver.findElements(By.tagName("select"));
	int dropdownCount = allDropdowns.size();
	System.out.println(dropdownCount);
	for(WebElement dropdown:allDropdowns)
	{
		if(dropdown.isDisplayed())
		{
			Select dropdownSelect=new Select(dropdown);
			if(dropdown.getAttribute("title").equals("Day"))
			{
				//selecting the dropdown by index (index starts from zero)
				dropdownSelect.selectByIndex(6);
			}
			else if(dropdown.getAttribute("title").equals("Month"))
			{
				//selecting the dropdown by index
				//dropdownSelect.selectByIndex(8);
				//selecting the dropdown by visible text
				dropdownSelect.selectByVisibleText("Sep");
			}
			else if(dropdown.getAttribute("title").equals("Year"))
			{
				//selecting the dropdown by value
				dropdownSelect.selectByValue("1989");
			}
		}
	}
	Thread.sleep(5000);
	driver.manage().window().minimize();
	driver.quit();
}
}
