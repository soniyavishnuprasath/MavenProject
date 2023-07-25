package methodsofwebdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfNavigateToStringUrl {
	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//pass the main url of the appln
		driver.get("https://www.dassault-aviation.com/en/");
		Thread.sleep(2000);
		//pass the sub URl-url of the same appln but different webpages.
		driver.navigate().to("https://www.dassault-aviation.com/en/passion/");
		Thread.sleep(2000);
		driver.quit();
		
	}

}
