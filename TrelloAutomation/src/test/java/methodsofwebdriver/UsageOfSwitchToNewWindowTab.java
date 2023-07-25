package methodsofwebdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfSwitchToNewWindowTab {
	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.nationalgeographic.com/");
		Thread.sleep(3000);
		driver.switchTo().newWindow(WindowType.TAB).get("https://www.amazon.in/");
		driver.manage().window().minimize();
		driver.close();
		//post condition to terminate the browser control windows and browser api 
		driver.quit();
	}

}
