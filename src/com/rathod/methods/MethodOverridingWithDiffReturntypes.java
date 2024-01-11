package com.rathod.methods;

import java.io.FileNotFoundException;
import java.io.IOException;

class Animal {
//	public String AnimalMtd() {
//		System.out.println("Animal class mtd");
//		return "";
//	}
	
	public Object AnimalMtd() throws Exception  {
		System.out.println("Animal class mtd");
		return "";
	}
}

public class MethodOverridingWithDiffReturntypes extends Animal {
 
	public Integer AnimalMtd() throws IOException  {
		System.out.println("Child class mtd");
		return 1;
	}
	
	public static void main(String[] args) throws Exception {
		Animal a = new MethodOverridingWithDiffReturntypes();
		a.AnimalMtd();
		
		Animal a1 = new Animal();
		a1.AnimalMtd();
	}

}
