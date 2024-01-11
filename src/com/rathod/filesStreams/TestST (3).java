import java.io.*;

public class TestST 
{
	public static void main(String args[]) 
	{
		double width = 1.0;
		double height = 1.0;
		double area;
		
		try 
		{
			StreamTokenizer stk = 
			new StreamTokenizer(new FileReader("rectangle.inp"));
			stk.parseNumbers();
			stk.wordChars(33, 255);
			stk.eolIsSignificant(true);

			while (stk.nextToken() != stk.TT_EOL) 
			{
				if (stk.ttype == stk.TT_NUMBER) 
				{
					width = stk.nval;
				} 
			} 

			while (stk.nextToken() != stk.TT_EOF) 
			{
				if (stk.ttype == stk.TT_NUMBER) 
				{
					height = stk.nval;
				} 
			} 

			area = width * height;
			System.out.println("The area is " + area);
		}
		
		catch (FileNotFoundException fnfe) 
		{
			System.out.println("Error: "+fnfe);    
		}
		
		catch (IOException ioe) 
		{
			System.out.println("Error: "+ioe);
		}
	} 
}

