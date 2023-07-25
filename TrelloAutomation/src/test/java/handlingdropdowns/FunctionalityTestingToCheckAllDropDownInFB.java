package handlingdropdowns;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FunctionalityTestingToCheckAllDropDownInFB {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));
	driver.get("https://www.facebook.com/signup");
	List<WebElement> allDropDown = driver.findElements(By.tagName("select"));
	for (WebElement dropdown : allDropDown) {
		if(dropdown.isDisplayed())
		{
			Select dropdownSelect=new Select(dropdown);
			List<WebElement> alloptions = dropdownSelect.getOptions();
			for (WebElement options : alloptions) {
				if(dropdown.getAttribute("title").equals("Day"))
				{
					dropdownSelect.selectByVisibleText(options.getText());
					if(options.isSelected())
					{
						System.out.println(options.getText()+" is selected");
					}else
					{
						System.out.println(options.getText()+" is not selected");
					}
				}else if(dropdown.getAttribute("title").equals("Month"))
				{
					dropdownSelect.selectByVisibleText(options.getText());
					if(options.isSelected())
					{
						System.out.println(options.getText()+" is selected");
					}else
					{
						System.out.println(options.getText()+" is not selected");
					}
					
				}else if(dropdown.getAttribute("title").equals("Year"))
				{
					dropdownSelect.selectByVisibleText(options.getText());
					if(options.isSelected())
					{
						System.out.println(options.getText()+" is selected");
					}else
					{
						System.out.println(options.getText()+" is not selected");
					}
				}
				
			}
		}
	}
	driver.manage().window().minimize();
	driver.quit();
}
}
