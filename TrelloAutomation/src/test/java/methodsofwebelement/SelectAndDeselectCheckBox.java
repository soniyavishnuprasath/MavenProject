package methodsofwebelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectAndDeselectCheckBox {
	public static void main(String[] args) throws Throwable  {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/");
		Thread.sleep(3000);
		//find the keepLoggedInCheckBox using id
		WebElement checkBox = driver.findElement(By.id("keepLoggedInCheckBox"));
		//select the checkBox by clicking on it
		checkBox.click();
		Thread.sleep(3000);
		//deselect the checkBox by clicking on it
		checkBox.click();
		Thread.sleep(3000);
		driver.manage().window().minimize();
		driver.quit();
	}

}
