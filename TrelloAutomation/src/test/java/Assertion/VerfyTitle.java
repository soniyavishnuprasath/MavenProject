package Assertion;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class VerfyTitle {
@Test
public void title()
{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://www.google.com/");
	String actualTitle = driver.getTitle();
	String expectedTitle="google";
	/*if(actualTitle.equals(expectedTitle))
		System.out.println("Pass : title is matching and its verified");
	else
		System.out.println("Fail : title is not matching and its verified");
		for both the cases it will show pass test case in test report
		so to overcome this problem we are moving to assertion*/
	
	/*Assert.assertEquals(actualTitle, expectedTitle);
	 * in this hard assert if the test case is fail it will not execute the remaining lines 
	 * in the same method ,jvm will break the execution
	 * to overcome this issues we have to use Soft Assert*/
	SoftAssert ass=new SoftAssert();
	ass.assertEquals(actualTitle, expectedTitle);
	driver.manage().window().minimize();
	driver.quit();
	ass.assertAll();
}
}
