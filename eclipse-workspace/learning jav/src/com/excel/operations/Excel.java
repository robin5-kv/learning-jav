package com.excel.operations;

import java.io.IOException;

public class Excel extends Excelutils {

	public static void main(String[] args) throws IOException 
	{
		Excel ecl =new Excel();
		ecl.readexcel("/home/xenovex/eclipse-workspace/learning jav/excel/robinlearn.xlsx");
		ecl.rowcount(-1);
		ecl.cellcount(0, 0);
	}

}
