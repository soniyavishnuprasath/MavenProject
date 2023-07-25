package handlingdropdowns;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DeselectOptions {
public static void main(String[] args) throws Throwable {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("file:///C:/Users/jsoni/OneDrive/Desktop/qspider/selenium/monthdropddown.html");
	WebElement monthDropDown = driver.findElement(By.tagName("select"));
	Select monthSelect = new Select(monthDropDown);
	monthSelect.selectByIndex(0);
	monthSelect.selectByIndex(1);
	monthSelect.selectByIndex(2);
	Thread.sleep(5000);
	//de-select all the month selected
	//monthSelect.deselectAll();
	//de-select jan month in the given list
	//monthSelect.deselectByIndex(0);
	//de.select by value
	//monthSelect.deselectByValue("1");
	//de=select by visible text
	//monthSelect.deselectByVisibleText("Jan");
	List<WebElement> allSelectedOption = monthSelect.getAllSelectedOptions();
	System.out.println(allSelectedOption.size());
	for (WebElement selectedOptions : allSelectedOption) {
		System.out.println(selectedOptions.getText());
	}
	Thread.sleep(5000);
	driver.manage().window().minimize();
	driver.quit();
}
}
