package methodsoflocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfByxPath_01 {
	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://shop-global.malaicha.com/login");
		/*<button>Register</button> no id,no name,no className,tagName is duplicated,no linkText,no partialLinkText
		cssSelector needs attribute -no attribute here
		using xpath by complete main tagText
		//tagName[text()='completeTagText'] */
		driver.findElement(By.xpath("//button[text()='Register']")).click();
		Thread.sleep(3000);
		driver.quit();
	}

}
