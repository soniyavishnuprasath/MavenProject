package methodsofwebdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfGetWindowHandle {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.cowin.gov.in/");
		//capture the current window id which is under driver control
		String currentWindowId = driver.getWindowHandle();
		System.out.println("currentWindowId = "+currentWindowId);
		driver.quit();
	}

}
