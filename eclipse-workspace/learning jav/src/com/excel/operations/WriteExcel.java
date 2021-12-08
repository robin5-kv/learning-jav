package com.excel.operations;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;

import org.apache.poi.xssf.usermodel.*;

public class WriteExcel {

	public static void main(String[] args) throws IOException {
		XSSFWorkbook Workbook = new XSSFWorkbook();

		XSSFSheet sh = Workbook.createSheet("robin");
		Object data[][] = { { "Sno", "name", "position" }, { 1, "robin", "Tester" }, { 2, "Vibin", "CMA" },
				{ 3, "Merly", "HouseWife" } };
// for loop
		int rows = data.length;
		int col = data[0].length;
		System.out.println("the number of rows" + rows);
		System.out.println("the number of colol" + col);

		for (int r = 0; r < rows; r++) {

			XSSFRow row = sh.createRow(r);
			for (int c = 0; c < col; c++) {
				XSSFCell cell = row.createCell(c);
				Object val = data[r][c];
				if (val instanceof String)
					cell.setCellValue((String) val);
				if (val instanceof Integer)
					cell.setCellValue((Integer) val);
				if (val instanceof Boolean)
					cell.setCellValue((Boolean) val);

			}

		}
		String path = "/home/xenovex/eclipse-workspace/learning jav/excel/robinlearn.xlsx";
		FileOutputStream fos = new FileOutputStream(path);
		Workbook.write(fos);
		System.out.println("Excel created");
		Workbook.close();
		fos.close();

	}

}
