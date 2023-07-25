package methodsofwebelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickOnRadioButton {
	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/signup");
		Thread.sleep(2000);
		//identify the radio button
		WebElement maleRadioButton = driver.findElement(By.xpath("//label[text()='Male']/following-sibling::input"));
		WebElement femaleRadioButton = driver.findElement(By.xpath("//label[text()='Female']/following-sibling::input"));
		WebElement customRadioButton = driver.findElement(By.xpath("//label[text()='Custom']/following-sibling::input"));
		//click on male radio button
		maleRadioButton.click();
		Thread.sleep(3000);
		femaleRadioButton.click();
		Thread.sleep(3000);
		customRadioButton.click();
		Thread.sleep(3000);
		driver.manage().window().minimize();
		driver.quit();
	}

}
