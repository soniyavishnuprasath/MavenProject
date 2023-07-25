package methodsofwebdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfSwitchToWindow {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://mod.gov.in/");
	driver.switchTo().newWindow(WindowType.WINDOW).get("https://www.facebook.com/");
	for(String wid:driver.getWindowHandles())
	{
		//to control particular window
		String url=driver.switchTo().window(wid).getCurrentUrl();
		if(url.equals("https://mod.gov.in/"))
		{
			driver.manage().window().minimize();
		}
		else if(url.equals("https://www.facebook.com/"))
		{
			driver.close();
		}
	}
}
}
