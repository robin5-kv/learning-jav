package com.excel.operations;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.xssf.usermodel.*;

public class Excelcolor {

	public static void main(String[] args) throws IOException {

		XSSFWorkbook wb = new XSSFWorkbook();
		XSSFSheet sh = wb.createSheet("Robin");
		XSSFRow row = sh.createRow(0);
		
		//Set Background color
		XSSFCellStyle style = wb.createCellStyle();
		style.setFillBackgroundColor(IndexedColors.DARK_GREEN.getIndex());
		style.setFillPattern(FillPatternType.BIG_SPOTS);
		XSSFCell cell = row.createCell(1);
		cell.setCellValue("jack");
		cell.setCellStyle(style);
		// Foreground
		style = wb.createCellStyle();
		style.setFillForegroundColor(IndexedColors.BLUE_GREY.getIndex());
		style.setFillPattern(FillPatternType.BRICKS);
		
		row.createCell(2);
		cell.setCellValue("Vibin");
		cell.setCellStyle(style);
		
		FileOutputStream fos =new  FileOutputStream("/home/xenovex/eclipse-workspace/learning jav/excel/robinlearn.xlsx");
		wb.write(fos);
		wb.close();
		fos.close();
		System.out.println("done");
	}

}