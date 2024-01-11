public class Test4
{

	public static void main(String[] args) 
	{
		Test4 t=new Test4();
		char c=4*4;
		String s="Bead";
		s=t.pearl(s);
		System.out.println(Byte.parseByte(s,c));
	}
	String  pearl(String s)
	{
		return s.substring(0,1);
	}

	}
