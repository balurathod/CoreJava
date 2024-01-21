package com.rathod.assignments.faq;

import com.rathod.JavaFeaturesVersionwise.java8.InterfaceWithDefaultStaticMtd;
import com.rathod.JavaFeaturesVersionwise.java8.InterfaceWithDefaultStaticMtds;

public class MainMethodEx implements InterfaceWithDefaultStaticMtd, InterfaceWithDefaultStaticMtds  {

	public MainMethodEx(){
		System.out.println("constr");
	}
	public static void main(String[] args) {
		System.out.println("Hello");
		MainMethodEx mme = new MainMethodEx();
		mme.print();
	}
	@Override
	public void print() {
		// TODO Auto-generated method stub
		InterfaceWithDefaultStaticMtds.super.print();
	}
	

	public void blowHorn() {
		// Call A Default Method Of An Interface In A Class
		InterfaceWithDefaultStaticMtd.super.print();
		//Call A Static Method Of An Interface In A Class
		InterfaceWithDefaultStaticMtd.blowHorn();
		
		// Call A Default Method Of An Interface In A Class
		InterfaceWithDefaultStaticMtds.super.print();
		//Call A Static Method Of An Interface In A Class
		InterfaceWithDefaultStaticMtds.blowHorn();

	}

}
