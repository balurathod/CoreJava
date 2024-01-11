package com.rathod.oops;

public class AbstractClassImpl extends AbstractClassTest {
	
	public AbstractClassImpl(){
		super(3, "passing str to abs class");
	}
	public AbstractClassImpl(int what,String ste){
		super(what,ste);
	}
	@Override
	void mtd() {
		System.out.println("Abs class implnt mtd");		
	}
	
	public static void main(String args[]){
		
		AbstractClassTest abs = new AbstractClassImpl();
		abs.mtd();
	}
}
