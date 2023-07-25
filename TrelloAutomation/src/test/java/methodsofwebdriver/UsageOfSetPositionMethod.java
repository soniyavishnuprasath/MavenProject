package methodsofwebdriver;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfSetPositionMethod {
public static void main(String[] args) throws Throwable {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.cowin.gov.in/");
	driver.switchTo().newWindow(WindowType.WINDOW).get("https://www.nationalgeographic.com/");
	//create dimension object ,import it from selenium library
	Dimension targetWindowSize=new Dimension(400,600);
	driver.manage().window().setSize(targetWindowSize);
	Thread.sleep(2000);
	//create point object to set the position of the window screen
	Point targetWindowPosition=new Point(160,200);
	driver.manage().window().setPosition(targetWindowPosition);
	Thread.sleep(2000);
	driver.quit();
		
}
}
