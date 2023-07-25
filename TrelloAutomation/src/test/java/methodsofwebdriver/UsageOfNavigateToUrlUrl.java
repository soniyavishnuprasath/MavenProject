package methodsofwebdriver;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfNavigateToUrlUrl {
	public static void main(String[] args) throws MalformedURLException, Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//pass the main url of the appln
		driver.get("https://www.dassault-aviation.com/en/");
		URL mainUrl=new URL("https://www.dassault-aviation.com/en/");
		//build the group page URL
		URL groupPageUrl=new URL(mainUrl,"group/");
		//build the defense page url
		URL defensePageUrl=new URL(mainUrl,"defense/");
		//build the civil page url
		URL civilPageUrl=new URL(mainUrl,"civil/");
		//build the space page url
		URL spacePageUrl=new URL(mainUrl,"space/");
		//build the passion page url
		URL passionPageUrl=new URL(mainUrl,"passion/");
		Thread.sleep(2000);
		driver.navigate().to(groupPageUrl);
		Thread.sleep(2000);
		driver.navigate().to(defensePageUrl);
		Thread.sleep(2000);
		driver.navigate().to(civilPageUrl);
		Thread.sleep(2000);
		driver.navigate().to(spacePageUrl);
		Thread.sleep(2000);
		driver.navigate().to(passionPageUrl);
		Thread.sleep(2000);
		driver.quit();
		
	}

}
