package com.rathod.unsolved;
class  MakeFile
{
	public static void main(String[] args) 
	{
		try
		{
			File directory=new File("d");  //create obj d
			File file=new File(directory,"f");  //create obj f
			if (!file.exist())
			{
				file.createNewFile();
			}
		}
		catch (IOException e)
		{
            e.printStackTrace();
		}
	}
}
/*
An exception is thrown at a runtime...

96

When comparing java.io.BufferedWriter to java.io.FileWriter,which capability
exist as a method in only one of the two?
Ans-->Writing a line separator to the stream
*/