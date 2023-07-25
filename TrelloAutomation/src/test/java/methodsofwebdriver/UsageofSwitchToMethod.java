package methodsofwebdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageofSwitchToMethod {
	public static void main(String[] args) throws Throwable {
		//instantiate the browser specific class
		WebDriver driver=new ChromeDriver();
		//pre condition to maximize the window
		driver.manage().window().maximize();
		//pass the main url to the appln
		driver.get("https://www.amazon.in/");
		Thread.sleep(3000);
		//create the new window with the same reference
		driver.switchTo().newWindow(WindowType.WINDOW);
		//pass the url to the new window
		driver.get("https://www.nationalgeographic.com/");
		
		
	}

}
