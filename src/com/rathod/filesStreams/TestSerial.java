import java.io.*;

public class TestSerial 
{
	MyInteger i1, i2;

	public TestSerial() 
	{
		i1 = new MyInteger(2);

		try 
		{
			ObjectOutputStream oos = 
			new ObjectOutputStream(new FileOutputStream("tmp.obj"));
			oos.writeObject(i1);
		}
		
		catch (IOException ioe) 
		{
			System.out.println("Error: "+ioe);
		}

		try 
		{
			ObjectInputStream ois =
			new ObjectInputStream(new FileInputStream("tmp.obj"));
			i2 = (MyInteger)ois.readObject();
			System.out.println("value is "+i2.getValue());
		}

		catch (FileNotFoundException fnfe) 
		{
			System.out.println("Error: "+fnfe);
		}

		catch (IOException ioe) 
		{
			System.out.println("Error: "+ioe);
		}
		
		catch (ClassNotFoundException cnfe) 
		{
			System.out.println("Error: "+cnfe);
		}
	}

	public static void main(String args[]) 
	{
		TestSerial se = new TestSerial();
	}
}

class MyInteger implements Serializable
{
	private Integer integer;
   
	public MyInteger(int i) 
	{
		integer = new Integer(i);
	}

	public int getValue() 
	{
		return integer.intValue();
	}
}

