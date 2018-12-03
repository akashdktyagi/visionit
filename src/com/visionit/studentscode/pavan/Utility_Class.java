package src.com.visionit.studentscode.pavan;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Utility_Class {

	static  XSSFWorkbook wb;
	static  XSSFSheet sheet;

static String excelPath = "D:\\ExelData\\TestData2.xlsx";

public static Object[][] getData() throws Exception
{
		
		File fin = new File(excelPath);
		FileInputStream fis = new FileInputStream(fin);
		wb = new XSSFWorkbook(fis);
		sheet = wb.getSheet("fbdata");

		int rorcout = sheet.getLastRowNum();

		int cellCount = sheet.getRow(0).getLastCellNum();

		Object[][] data = new Object[rorcout][cellCount];

		for (int i = 0; i < rorcout; i++) {
			
			for (int k = 0; k < cellCount; k++) {
				
				data [i][k] = sheet.getRow(i+1).getCell(k).toString();

			}
		}

		return data;
	}	
}

