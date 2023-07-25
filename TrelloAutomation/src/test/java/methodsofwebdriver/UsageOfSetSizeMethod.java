package methodsofwebdriver;



import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfSetSizeMethod {
	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		//define the new window of same reference
		driver.switchTo().newWindow(WindowType.WINDOW).get("https://www.cowin.gov.in/");
		Thread.sleep(2000);
		/*set the size of the window ,create  dimension object to define the window target size 
		 * dimension(int width,int height)*/
		Dimension targetWindowSize = new Dimension(200,400);
		//assign the specified dimension to the setSize(targetWindowSize)
		driver.manage().window().setSize(targetWindowSize);
		Thread.sleep(2000);
		driver.quit();
		
	}

}
