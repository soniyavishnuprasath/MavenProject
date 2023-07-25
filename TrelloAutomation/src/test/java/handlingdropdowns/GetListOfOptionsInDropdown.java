package handlingdropdowns;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GetListOfOptionsInDropdown {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));
	driver.get("https://www.facebook.com/signup");
	//IDENTIFY ALL THE OPTIONS IN THE dropdown
	List<WebElement> allDropdown = driver.findElements(By.tagName("select"));
	//printing the number of dropdowns in the webpage
	System.out.println(allDropdown.size());
	for (WebElement dropdown : allDropdown) {
		//select only visible dropdowns in the webpage
		if(dropdown.isDisplayed())
		{
			Select dropdownSelect=new Select(dropdown);
			List<WebElement> allOptions = dropdownSelect.getOptions();
			System.out.println(allOptions.size());
			for (WebElement  options: allOptions) {
				System.out.println(options.getText());
			}
		}
	}
	driver.manage().window().minimize();
	driver.quit();
}
}
