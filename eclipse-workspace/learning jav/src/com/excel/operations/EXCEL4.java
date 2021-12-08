package com.excel.operations;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class EXCEL4 {

	public static void main(String[] args) throws IOException {
		
		XSSFWorkbook wb = new XSSFWorkbook();
		XSSFSheet  sh =wb.createSheet("formula");
	XSSFRow row=	sh.createRow(0);
		row.createCell(0).setCellValue(13);
		row.createCell(1).setCellValue(12);
		row.createCell(2).setCellValue(10);
		row.createCell(3).setCellFormula("A1*B1*C1");
		String c="/home/xenovex/eclipse-workspace/learning jav/excel/robinlearnnn.xlsx";
		FileOutputStream fos =new FileOutputStream(c);
		
		wb.write(fos);
		
		fos.close();
		System.out.println("created");
		
		
	}

}
