package datadriventesting;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FirstAndLAstCellLimitationInRow {
public static void main(String[] args) throws Throwable {
	FileInputStream fis = new FileInputStream("./src/test/resources/facebookdob.xlsx");
	Workbook workbook = WorkbookFactory.create(fis);
	Sheet sheet = workbook.getSheet("doblist1");
	short firstCellindex = sheet.getRow(0).getFirstCellNum();
	System.out.println(firstCellindex);
	short lastCellIndex = sheet.getRow(0).getLastCellNum();
	System.out.println(lastCellIndex);
	workbook.close();
	
}
}
