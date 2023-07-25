package datadriventesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CompareTheUIDropDownWithTestCase {
	public static void main(String[] args) throws Throwable {
		List<String> actualDayList=new ArrayList<String>();
		List<String> actualMonthList=new ArrayList<String>();
		List<String> actualYearList=new ArrayList<String>();
		List<String> expectedDayList=new ArrayList<String>();
		List<String> expectedMonthList=new ArrayList<String>();
		List<String> expectedYearList=new ArrayList<String>();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));
		driver.get("https://www.facebook.com/signup");
		List<WebElement> allDropDown = driver.findElements(By.tagName("select"));
		for (WebElement dropdown : allDropDown) {
			if(dropdown.isDisplayed())
			{
				Select dropdownSelect = new Select(dropdown);
				List<WebElement> alloptions = dropdownSelect.getOptions();
				for (WebElement option : alloptions) {
					if(dropdown.getAttribute("title").equals("Day"))
					{
						actualDayList.add(option.getText());
					}else if(dropdown.getAttribute("title").equals("Month"))
					{
						actualMonthList.add(option.getText());
					}else if(dropdown.getAttribute("title").equals("Year"))
					{
						actualYearList.add(option.getText());
					}
				}
			}
		}
		driver.manage().window().minimize();
		driver.quit();
		//fectching data from excel sheet
		FileInputStream fis = new FileInputStream("./src/test/resources/facebookdob.xlsx");
		Workbook workbook = WorkbookFactory.create(fis);
		Sheet sheet = workbook.getSheet("doblist1");
		int firstRowIndex = sheet.getFirstRowNum();
		int lastRowIndex = sheet.getLastRowNum();
		for(int i=firstRowIndex;i<=lastRowIndex;i++)
		{
			int firstCellIndex=(int)sheet.getRow(i).getFirstCellNum();
			int lastIncrementalIndex=(int)sheet.getRow(i).getLastCellNum();
			for(int j=firstCellIndex+1;j<lastIncrementalIndex;j++)
			{
				CellType cellType = sheet.getRow(i).getCell(j).getCellType();
				if(String.valueOf(cellType).equals("STRING"))
				{
					expectedMonthList.add(sheet.getRow(i).getCell(j).getStringCellValue());
				}else if(String.valueOf(cellType).equals("NUMERIC"))
				{
					if(lastIncrementalIndex==32)
					{
						expectedDayList.add(String.valueOf((long)sheet.getRow(i).getCell(j).getNumericCellValue()));
					}else if(lastIncrementalIndex==120)
					{
						expectedYearList.add(String.valueOf((long)sheet.getRow(i).getCell(j).getNumericCellValue()));
					}
				}
			}
		}
		workbook.close();
		System.out.println(actualDayList);
		System.out.println(expectedDayList);
		if(actualDayList.equals(expectedDayList))
			System.out.println("pass : the dropdown day list box optins and spelling is correct and itd verified");
		else
			System.out.println("Fail : the dropdown day list box optins and spelling is incorrect and itd verified");
		System.out.println(actualMonthList);
		System.out.println(expectedMonthList);
		if(actualMonthList.equals(expectedMonthList))
			System.out.println("pass : the dropdown month list box optins and spelling is correct and itd verified");
		else
			System.out.println("Fail : the dropdown month list box optins and spelling is incorrect and itd verified");
		System.out.println(actualYearList);
		System.out.println(expectedYearList);
		if(actualYearList.equals(expectedYearList))
			System.out.println("pass : the dropdown year list box optins and spelling is correct and itd verified");
		else
			System.out.println("Fail : the dropdown year list box optins and spelling is incorrect and itd verified");
	
	}

}
