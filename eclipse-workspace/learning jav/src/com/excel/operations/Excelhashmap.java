package com.excel.operations;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import javax.swing.RowFilter.Entry;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelhashmap {

	public static void main(String[] args) throws IOException {
		XSSFWorkbook wb= new XSSFWorkbook();
	XSSFSheet sh=	wb.createSheet("Vibin");
	Map<String,String> data=new HashMap<String,String>();
	data.put("SNo", "Roll");
	data.put("102", "Vibin");
	data.put("103", "Robin");
	data.put("104", "pappa");
	data.put("105", "Mummy");
	//Set<java.util.Map.Entry<String, String>> ls= data.entrySet();
	 int row =0;
	 for(Map.Entry entry: data.entrySet()) 
	 {
	XSSFRow ro=	 sh.createRow(row++);
	ro.createCell(0).setCellValue((String)entry.getKey());
	ro.createCell(1).setCellValue((String)entry.getValue());
	
	 }
	FileOutputStream fos =new FileOutputStream("/home/xenovex/eclipse-workspace/learning jav/excel/robinlearn.xlsx");
	wb.write(fos);
	wb.close();
	fos.close();
	System.out.println("created successfully");
	
	}

}
