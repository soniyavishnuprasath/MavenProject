package com.actitime.generic;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class UsageOfGenericMethods {
public  String getDataFromProperty(String data) throws IOException
{
	FileInputStream fis=new FileInputStream("./src/test/resources/actitimedata.properties");
	Properties prob=new Properties();
	prob.load(fis);
	String datas = prob.getProperty(data);
	return datas;
}
public  String readDataFromExcel(String sheetname,int row,int cell) throws EncryptedDocumentException, IOException
{
	FileInputStream fis=new FileInputStream("./src/test/resources/mydata.xlsx");
	Workbook wb = WorkbookFactory.create(fis);
	String data = wb.getSheet(sheetname).getRow(row).getCell(cell).getStringCellValue();
	return data;
}
public void writeDataFromExcel(String sheetname,int row,int cell,String data) throws EncryptedDocumentException, IOException
{
	FileInputStream fis=new FileInputStream("./src/test/resources/mydata.xlsx");
	Workbook wb = WorkbookFactory.create(fis);
	wb.getSheet(sheetname).getRow(row).getCell(cell).setCellValue(data);
	FileOutputStream fos=new FileOutputStream("./src/test/resources/mydata.xlsx");
	wb.write(fos);
	
}
}
