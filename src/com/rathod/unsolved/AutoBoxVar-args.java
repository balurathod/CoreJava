//RULE of JAVA5-Preexisting code should funcn d way it use to , 
//V-args can make ovrloding little tricky.

class AutoBoxVar-args 
{
	    static void go(int  x , int y)
		{
	        System.out.println(" int int  ");
	    }
		static void go(byte... x)
		{
	        System.out.println(" byte...... ");
	    }
	public static void main(String[] args) 
	{
		
		byte  b = 5;
		go(b,b);           //which go vl  b invoked.
			
	}
}

/*


o/p--> int int

Bcoz....

RULE of JAVA5

-->Preexisting code should funcn d way it use to ,so since widening capblty 
alrady existed ,A method i.e.-invokd via widng sholdnt lose out to a newly 
cratd metd,that  relise on boxing.


bcz 1c again evn tho each invokcn vl reqr some sort of convrcn ,
The Complr vl choos d oldr style bfor it chooses d newr style  kipng existing.

       -->Widening BEATS boxing
	   -->Widening BEATS var-args


	   does boxing beats var-args?no...

*/