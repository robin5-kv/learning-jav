package com.fileoperations;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

/*File can be stored in fourways in java
 * File writer
 * Buffered Writer
 * path
 * fileouputtstream
 * 
 * 
 * 
 * 
 * 
 * 
 */
public class javaoperations {

	public static void main(String[] args) throws IOException {
		String location = "filee nam.txt";
		String content = "hi learning java content ";
		/*
		 * FileWriter f = new FileWriter(location);
		 * 
		 * sf.write(content); f.close();
		 */
		/FileWriter f = new FileWriter(location);
		BufferedWriter Bf = new BufferedWriter(f);
		Bf.write(content);
		Bf.close();
		FileOutputStream fo =new FileOutputStream(location);
		
		
		
		
	}

}
