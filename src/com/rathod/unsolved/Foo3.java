package com.rathod.unsolved;
import java.io.*;
public class Foo3 implements Serializable
{
	public int x,y;
	public Foo3(int x, int y)
		{
		    this.x=x;
			this.y=y;
		}
	private void writeObject(ObjectOutputStream s) throws IOException
	      {
		       s.writeInt(x);
			   s.writeInt(y);
		  } 
    
	private void readObject(ObjectInputStream s) throws IOException,ClassNotFoundException
		{   
		    //code here .....
            x=s.readInt(); 
			y=s.readInt();
	     } 
		
}

/*
code of line 13 will allow this class to correctly serialize & deserialize
What is serialization & deserialization?


//99
-->An obj serialize on one JVM can b successfully deserialize on diff JVM.
-->The values in field with  d transient modifier will NOT suervive
*/