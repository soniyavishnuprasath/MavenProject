package datadriventesting;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class PrintTheCellCountInEachRow {
public static void main(String[] args) throws Throwable {
	FileInputStream fis = new FileInputStream("./src/test/resources/facebookdob.xlsx");
	Workbook workbook = WorkbookFactory.create(fis);
	Sheet sheet = workbook.getSheet("doblist1");
	int firstRowIndex=sheet.getFirstRowNum();
	int lastRowIndex=sheet.getLastRowNum();
	for(int i=firstRowIndex;i<=lastRowIndex;i++)
	{
		int firstCellIndex = (int)sheet.getRow(i).getFirstCellNum();
		int lastCellIndex=(int)sheet.getRow(i).getLastCellNum();
		//System.out.println(lastCellIndex);
		for(int j=firstCellIndex+1;j<lastCellIndex;j++)
		{
			CellType cellType = sheet.getRow(i).getCell(j).getCellType();
			if(String.valueOf(cellType).equals("STRING"))
			{
				System.out.println(sheet.getRow(i).getCell(j).getStringCellValue());
			}
			else if(String.valueOf(cellType).equals("NUMERIC"))
			{
				System.out.println((long)sheet.getRow(i).getCell(j).getNumericCellValue());
			}
		}
	}
	workbook.close();
}
}
