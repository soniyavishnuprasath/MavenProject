package methodsofwebelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ObsuredElement {
	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		Thread.sleep(3000);
		//identify the customer service option
		WebElement customerService = driver.findElement(By.xpath("//a[text()=\"Today's Deals\"]/following-sibling::a[contains(.,'Customer Service')]"));
		//customerService.click();
		//ElementClickInterceptedException
		// When we try to click on the target element unknown element will in between we call
		//it has Obscured Element.
		//handle the Obscured Element.
		WebElement obsuredElement = driver.findElement(By.xpath("//span[contains(.,\"Don't Change\")]/preceding-sibling::input"));
		obsuredElement.click();
		Thread.sleep(5000);
		customerService.click();
		Thread.sleep(3000);
		driver.manage().window().minimize();
		driver.quit();

	}

}
