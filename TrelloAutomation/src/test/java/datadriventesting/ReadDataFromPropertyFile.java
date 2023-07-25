package datadriventesting;

import java.io.FileInputStream;
import java.util.Properties;

public class ReadDataFromPropertyFile {
public static void main(String[] args) throws Throwable {
	//create a fileinputstream obj with the file address as an input
	//argument name is relative path of a file
	FileInputStream fis = new FileInputStream("./src/test/resources/actitimedata.properties");
	//create a properties obj of java with empty constructor
	Properties pobj = new Properties();
	//load the inputstream obj into pobj obj
	pobj.load(fis);
	String value = pobj.getProperty("browser");
	System.out.println(value);
	String value1 = pobj.getProperty("url");
	System.out.println(value1);
	String value2 = pobj.getProperty("username");
	System.out.println(value2);
	String value3 = pobj.getProperty("password");
	System.out.println(value3);
}
}
