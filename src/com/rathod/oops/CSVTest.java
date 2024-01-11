package com.rathod.oops;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class CSVTest {
	public void imprimeArchivo() {
		String arreglo[][] = {{"Hello","Hi"},{"Tata","Bye Bye"}};
		String fileName = "D:/FCL/castfeed/prompt.csv";
		try {
			FileWriter writer = new FileWriter(fileName);
			for (int i = 0; i < arreglo.length; i++) {
				for (int j = 0; j < arreglo[i].length; j++) {
				writer.append(arreglo[i][j]);
					if (j < arreglo[j].length - 1) {
						writer.append(',');
					} else {
						writer.append('\n');
					}
				}
			}
		} catch (IOException e) {
		e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		CSVTest csv = new CSVTest();
		csv.imprimeArchivo();
		
String outputFile = "users.csv";
		
		// before we open the file check to see if it already exists
		boolean alreadyExists = new File(outputFile).exists();
			
		try {
			// use FileWriter constructor that specifies open for appending
			CsvWriter csvOutput = new CSVWriter(new FileWriter(outputFile, true), ',');
			
			// if the file didn't already exist then we need to write out the header line
			if (!alreadyExists)
			{
				csvOutput.write("id");
				csvOutput.write("name");
				csvOutput.endRecord();
			}
			// else assume that the file already has the correct header line
			
			// write out a few records
			csvOutput.write("1");
			csvOutput.write("Bruce");
			csvOutput.endRecord();
			
			csvOutput.write("2");
			csvOutput.write("John");
			csvOutput.endRecord();
			
			csvOutput.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
