package com.rathod.oops;
import java.util.*;

public class TestTimerTask 
{
  	public static void main(String args[]) 
	{
      		Timer tmr = new Timer();
      		tmr.schedule(new MyTask(), 1000, 2000);
   	}
 }

	class MyTask extends TimerTask 
	{
	
  		        public MyTask()
		         {
    			super();
  		         }

  		public void run() 
		 {
    		System.out.println("Remember to walk Bailey");
  		}
	}
/* 
Vedisoft : Java - Module 1 "Desktop Technologies"


Vedisoft
Plot No. 173, Zone II, M.P. Nagar,
Bhopal.
Phone : 0755 - 6541546
Email : contact@vedisoft.com
Web : www.vedisoft.com
*/