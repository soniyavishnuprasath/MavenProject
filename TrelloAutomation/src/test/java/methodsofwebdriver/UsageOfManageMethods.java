package methodsofwebdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfManageMethods {
	public static void main(String[] args) throws Throwable {
		//instantiate the browser specific class
		WebDriver driver=new ChromeDriver();
		//pre-condition to maximize the window
		driver.manage().window().maximize();
		//pass the main url of the application
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		//changing the window into fullscreen
		driver.manage().window().fullscreen();
		Thread.sleep(3000);
		//minimize the window
		driver.manage().window().minimize();
		
	}

}
