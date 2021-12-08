package com.excel.operations;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

//import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.*;

public class Excelutils {
	public String path;
	public XSSFWorkbook wb = null;
	public XSSFSheet sh = null;
	public FileInputStream fis = null;
	public FileOutputStream fos = null;

	public void readexcel(String path) throws IOException {
		this.path = path;
		try {
			fis = new FileInputStream(path);
			wb = new XSSFWorkbook(fis);
			sh = wb.getSheetAt(0);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public int rowcount(int sheetnumber) 
	{
		wb.getSheetAt(sheetnumber);
		int row = sh.getLastRowNum() + 1;
		System.out.println(row);
		return row;

	}

	public int cellcount(int sheetnumber, int rowvalue) {
		wb.getSheetAt(sheetnumber);
		int cell = sh.getRow(rowvalue).getLastCellNum();
		System.out.println(cell);
		return cell;
	}

	
}
