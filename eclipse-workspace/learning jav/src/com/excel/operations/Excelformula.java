package com.excel.operations;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.*;

public class Excelformula {

	public static void main(String[] args) throws IOException {

		String path = "/home/xenovex/eclipse-workspace/learning jav/excel/robinlearnnn.xlsx";
		FileInputStream fis = new FileInputStream(path);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sh = wb.getSheetAt(3);
		int row = sh.getLastRowNum() + 1;
		int col = sh.getRow(0).getLastCellNum();
		System.out.println(row);
		System.out.println(col); 
		
		for (int r = 1; r < row; r++)
		{
			XSSFRow ro= sh.getRow(r);
			
			for (int c = 0; c <col; c++) 
			{
			XSSFCell	cell=ro.getCell(c);
			switch (cell.getCellType()) 
			{
			case STRING: System.out.print(cell.getStringCellValue());break;
			case NUMERIC: System.out.print(cell.getNumericCellValue());break;	
			case BOOLEAN: System.out.print(cell.getBooleanCellValue());break;	
			case FORMULA :System.out.println(cell.getCellFormula());break;
			default:
				break;
			}
			System.out.print("/");
			}
		}
		
		wb.close();
		fis.close();
	}

}
