package methodsofwebdriver;



import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfGetSize {
	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.nationalgeographic.com/");
		driver.switchTo().newWindow(WindowType.WINDOW).get("https://www.facebook.com/");
		Dimension targetWindowSize=new Dimension(200,400);
		driver.manage().window().setSize(targetWindowSize);
		Thread.sleep(2000);
		Point targetWindowPosition=new Point(200,150);
		driver.manage().window().setPosition(targetWindowPosition);
		//capture the window size
		Dimension windowSize = driver.manage().window().getSize();
		System.out.println("windowSize = "+windowSize);
		int windowWidth = windowSize.getWidth();
		System.out.println("windowWidth = "+windowWidth);
		int windowHeight = windowSize.getHeight();
		System.out.println("windowHeight = "+windowHeight);
		driver.quit();
	}

}
