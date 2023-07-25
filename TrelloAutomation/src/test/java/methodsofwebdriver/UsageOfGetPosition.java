package methodsofwebdriver;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfGetPosition {
	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.switchTo().newWindow(WindowType.WINDOW).get("https://mod.gov.in/");
		Thread.sleep(2000);
		Dimension targetWindowSize=new Dimension(550,300);
		driver.manage().window().setSize(targetWindowSize);
		Thread.sleep(2000);
		Point targetWindowPotision=new Point(350,500);
		driver.manage().window().setPosition(targetWindowPotision);
		Thread.sleep(2000);
		//capture the window position
		Point windowPosition = driver.manage().window().getPosition();
		System.out.println("windowPosition = "+windowPosition);
		int windowStartX = windowPosition.getX();
		int windowStartY = windowPosition.getY();
		System.out.println("windowStartX = "+windowStartX);
		System.out.println("windowStartY = "+windowStartY);
		Thread.sleep(2000);
		driver.quit();
	}

}
