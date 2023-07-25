package methodsofwebdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfGetCurrentUrl {
	public static void main(String[] args) {
		//instantiate the browser specific class
		WebDriver driver=new ChromeDriver();
		//pass the main url of the application
		driver.get("https://www.facebook.com/");
		//capture and print the current url of the application
		String actualCurrentUrl = driver.getCurrentUrl();
		System.out.println("actualCurrentUrl = "+actualCurrentUrl);
	}

}
