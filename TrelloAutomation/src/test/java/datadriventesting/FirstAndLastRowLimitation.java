package datadriventesting;

import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FirstAndLastRowLimitation {
public static void main(String[] args) throws Throwable {
	FileInputStream fis = new FileInputStream("./src/test/resources/facebookdob.xlsx");
	Workbook workbook = WorkbookFactory.create(fis);
	Sheet sheet = workbook.getSheet("doblist1");
	int firstRowindex = sheet.getFirstRowNum();
	int lastRowIndex = sheet.getLastRowNum();
	System.out.println(firstRowindex);
	System.out.println(lastRowIndex);
	workbook.close();
}
}
