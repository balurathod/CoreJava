package com.rathod.oops;
import javax.swing.JButton;
class  CompareReference
{
	public static void main(String[] args) 
	{
		JButton a=new JButton("Exit");
        JButton b=new JButton("Exit");
        JButton c=a;
		System.out.println("Is ref a==b? " + (a == b));//ref never(by default) same.
		System.out.println("Is ref a==c? " + (a == c));//if u assign a=c den they r definatly =
       
		System.out.println(" Ref A & C r meaningfully=  " + (a.equals(c)));
		System.out.println(" Ref A & B r meaningfully=  " + (a.equals(b)));
        
		System.out.println(a instanceof JButton);
		System.out.println(b instanceof JButton);
		System.out.println(c instanceof JButton);

		//System.out.println(a instanceof CompareReference);
		//System.out.println(b instanceof CompareReference);
		//System.out.println(c instanceof CompareReference);
	}
}
