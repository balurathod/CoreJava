package com.rathod.oops;

import static org.junit.Assert.*;

import java.io.*;
import org.junit.Test;

public class SerTest {

	    @Test public void serializeToDisk()
	    {
	        try
	        {
	        	com.rathod.oop.PersonSeri ted = new com.rathod.oop.PersonSeri("Ted", "Neward", 39);
	        	com.rathod.oop.PersonSeri charl = new com.rathod.oop.PersonSeri("Charlotte",
	                "Neward", 38);

	            ted.setSpouse(charl); charl.setSpouse(ted);

	            FileOutputStream fos = new FileOutputStream("D:/FCL/castfeed/tempdata.ser");
	            ObjectOutputStream oos = new ObjectOutputStream(fos);
	            oos.writeObject(ted);
	            oos.close();
	        }
	        catch (Exception ex)
	        {
	            fail("Exception thrown during test: " + ex.toString());
	        }
	        
	        try
	        {
	            FileInputStream fis = new FileInputStream("D:/FCL/castfeed/tempdata.ser");
	            ObjectInputStream ois = new ObjectInputStream(fis);
	            com.rathod.oop.PersonSeri ted = (com.rathod.oop.PersonSeri) ois.readObject();
	            ois.close();
	            
	            assertEquals(ted.getFirstName(), "Ted");
	            assertEquals(ted.getSpouse().getFirstName(), "Charlotte");

	            // Clean up the file
	            new File("D:/FCL/castfeed/tempdata.ser").delete();
	        }
	        catch (Exception ex)
	        {
	            fail("Exception thrown during test: " + ex.toString());
	        }
	    }
	}