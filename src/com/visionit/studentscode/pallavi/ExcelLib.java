package com.visionit.studentscode.pallavi.fw.product.CsCart.reusables;

import java.io.FileInputStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelLib
{
	static Workbook book;
	static Sheet sheet;
	static Row row;
	static Cell cell;
	static String value;
	public static String excelRead(String sheetname, int rownum,int cellnum)
	{
		String path = PropertyFile.getProperty("ExcelFilePath");
		try 
		{
			book=WorkbookFactory.create(new FileInputStream(path));
			sheet=book.getSheet(sheetname);
			row=sheet.getRow(rownum);
			cell=row.getCell(cellnum);
			value = cell.toString();
		} 
		catch (Exception e)
		{
			// TODO Auto-generated catch block.
			e.printStackTrace();
		}
		return value; 
	}
	public static void excelwrite(String sheetname, int rownum,int cellnum,String result)
	{
		String path = PropertyFile.getProperty("ExcelFilePath");
		try 
		{
		book=WorkbookFactory.create(new FileInputStream(path));
		sheet=book.getSheet(sheetname);
		row=sheet.getRow(rownum);
		cell=row.createCell(cellnum);
		cell.setCellValue(result);
		book.write(new FileOutputStream(path));
		} 
		catch (Exception e)
		{
		// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
