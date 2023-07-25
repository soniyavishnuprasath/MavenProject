package methodsofwebdriver;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfGetWindowHandles {
	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.cowin.gov.in/");
		Thread.sleep(3000);
		driver.switchTo().newWindow(WindowType.WINDOW).get("https://www.nationalgeographic.com/");
		Thread.sleep(3000);
		driver.switchTo().newWindow(WindowType.WINDOW).get("https://www.facebook.com/");
		Thread.sleep(3000);
		driver.switchTo().newWindow(WindowType.WINDOW).get("https://mod.gov.in/");
		Thread.sleep(3000);
		Set<String> allWindowIds = driver.getWindowHandles();
		//check for the window count and print it
		int windowIdCount = allWindowIds.size();
		System.out.println("windowIdCount = "+windowIdCount);
		for(String wid:allWindowIds)
		{
		System.out.println(wid);	
		}
		driver.quit();
		
		
		
	}

}
