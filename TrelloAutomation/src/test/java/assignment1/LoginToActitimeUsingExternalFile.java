package assignment1;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginToActitimeUsingExternalFile {
public static void main(String[] args) throws IOException {
	FileInputStream fis=new FileInputStream("./src/test/resources/actidata.properties");
	Properties prop=new Properties();
	prop.load(fis);
	String url = prop.getProperty("url");
	String un = prop.getProperty("username");
	String pwd = prop.getProperty("password");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get(url);
	driver.findElement(By.id("username")).sendKeys(un);
	driver.findElement(By.name("pwd")).sendKeys(pwd);
	driver.findElement(By.xpath("//div[.='Login ']")).click();
	driver.manage().window().minimize();
	driver.quit();
	
	
}
}
