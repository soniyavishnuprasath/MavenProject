package datadriventesting;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class LearningTheCellTypeInWorkbook {
public static void main(String[] args) throws Throwable {
	FileInputStream fis = new FileInputStream("./src/test/resources/facebookdob.xlsx");
	Workbook workbook = WorkbookFactory.create(fis);
	Sheet sheet = workbook.getSheet("doblist1");
	CellType cellType = sheet.getRow(1).getCell(1).getCellType();
	System.out.println(cellType);
	if(String.valueOf(cellType).equals("STRING"))
		System.out.println("boolean true,its a string type cell");
	else
		System.out.println("boolean false,its a numberic type cell");
	workbook.close();
}
}
