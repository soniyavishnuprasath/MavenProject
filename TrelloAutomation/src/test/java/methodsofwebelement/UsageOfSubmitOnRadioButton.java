package methodsofwebelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfSubmitOnRadioButton {
	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/signup");
		Thread.sleep(2000);
		WebElement maleRadioButton = driver.findElement(By.xpath("//label[text()='Male']/following-sibling::input"));
		maleRadioButton.submit();
		//not clicking also no Exception. need to follow the condition for submit method.
	}

}
