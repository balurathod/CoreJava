package com.rathod.java7;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResource {

	public static void main(String[] args) {
		
		File file = new File("test.txt");
		
		try (BufferedReader br = new BufferedReader(new FileReader(file))){
			
		} catch (FileNotFoundException e) {
			System.out.println("Can't find file"+file.toString());
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Unable find file"+file.toString());
			e.printStackTrace();
		};
	}

}
