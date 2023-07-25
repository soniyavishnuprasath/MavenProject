
package datadriventesting;

import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadExcelFileData {
public static void main(String[] args) throws Throwable {
	//create the file input stream obj for the excel sheet.
	FileInputStream fis = new FileInputStream("./src\\test\\resources\\mydata.xlsx");
	//call the create() from workBook factory of POI library
	Workbook workbook = WorkbookFactory.create(fis);
	//call the getSheet() by specifying the sheet name
	Sheet sheet = workbook.getSheet("myinfo");
	//call the getRow by specifying the row index value
	Row rowvalue = sheet.getRow(1);
	//call the getCell by specifying the cell index value
	Cell cell = rowvalue.getCell(1);
	//String cellvalue = cell.getStringCellValue();
	//System.out.println(cellvalue);
	double cellvalue = cell.getNumericCellValue();
	System.out.println(cellvalue);
	workbook.close();
}
}
