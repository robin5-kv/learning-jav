package com.fileoperations;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Sele21Read {

	public static void main(String[] args) throws IOException
	{
		String location = "/home/xenovex/eclipse-workspace/learning jav/filee nam.txt";
		FileReader fr= new FileReader(location);
		BufferedReader Bff =new BufferedReader(fr);
		String d=	Bff.readLine();
		//System.out.println(d);
		//String alllines;
//To print Mutiple lines in the Txt then
		while ((d = Bff.readLine())!=null)
		{
			System.out.println(d);
		}
		
	
	}

}
