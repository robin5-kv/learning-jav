package com.excel.operations;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.*;

public class Excel1 {

	public static void main(String[] args) throws IOException {

		String excel = "/home/xenovex/eclipse-workspace/learning jav/excel/robinlearn.xlsx";
		FileInputStream fis = new FileInputStream(excel);

		XSSFWorkbook Workbook = new XSSFWorkbook(fis);
		XSSFSheet sh = Workbook.getSheetAt(0);
		// to get row count
		int numrows = sh.getLastRowNum()+1;
		System.out.println("the number of rows in the execel is =" + numrows);
		// to get cell count
		int cellcount = sh.getRow(1).getLastCellNum();
		System.out.println(cellcount);
		
		// to print the data in excel.
		for (int r = 1; r < numrows; r++) {
			XSSFRow row = sh.getRow(r);
			for (int c = 0; c < cellcount; c++) {
				XSSFCell cell = row.getCell(c);
				//System.out.print("----"+cell);
				switch (cell.getCellType()) {
				case STRING :System.out.print(cell.getStringCellValue());break;
				case BOOLEAN :System.out.print(cell.getBooleanCellValue()); break;	
				case NUMERIC :	System.out.print(cell.getNumericCellValue()); break;
				

				default:
					
				}
			}
			System.out.println("----");
		}
	
		Workbook.close();
		fis.close();

	}

	
}
