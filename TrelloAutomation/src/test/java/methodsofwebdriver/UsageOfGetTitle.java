package methodsofwebdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfGetTitle {
public static void main(String[] args) {
	//instantiate the browser specific class
	WebDriver driver=new ChromeDriver();
	//pass the main URL (protocol +domain Name) of the application
	driver.get("https://www.facebook.com/");
	//fetching the title of the web page and printing it
	String webPageTitle = driver.getTitle();
	System.out.println("webPageTitle = "+webPageTitle);
}
}
