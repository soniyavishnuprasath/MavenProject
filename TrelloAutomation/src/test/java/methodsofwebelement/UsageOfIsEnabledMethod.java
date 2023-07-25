package methodsofwebelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfIsEnabledMethod {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/signup");	
		WebElement maleRadioButton = driver.findElement(By.xpath("//label[text()='Male']/following-sibling::input"));
		if(maleRadioButton.isEnabled())
		{
			System.out.println("boolean true : pass : passive testing");
			System.out.println("pass : male radio button is enabled and its verfied");
		}
		else
		{
			System.out.println("boolean false : fail : passive testing");
			System.out.println("fail : male radio button is disabled and its verfied");
		}
		driver.manage().window().minimize();
		driver.quit();
	}

}
