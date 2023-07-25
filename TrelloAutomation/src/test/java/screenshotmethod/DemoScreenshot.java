package screenshotmethod;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DemoScreenshot {
	
		@Test 
		public void WebBrowserScreenShot () throws IOException{
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			driver.get("https://www.myntra.com/");
			TakesScreenshot ts=(TakesScreenshot)driver;
			File src = ts.getScreenshotAs(OutputType.FILE);
			File dest=new File("./screenshots/img.png");
			//FileHandler.copy(src, dest);
			FileUtils.copyFile(src, dest);
			driver.manage().window().minimize();
			driver.quit();
		}

}
