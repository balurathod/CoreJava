package com.rathod.oops;
//Multiple inheritance via interface
public class InterfacesImpl implements InterfaceA, InterfaceB, InterfaceC {
	
	public void doSomething() {
        System.out.println("doSomething implementation of concrete class");
    }
	public static void main(String[] args) {
		InterfaceA objA = new InterfacesImpl();
        InterfaceB objB = new InterfacesImpl();
        InterfaceC objC = new InterfacesImpl();
         
        //all the method calls below are going to same concrete implementation
        objA.doSomething();
        objB.doSomething();
        objC.doSomething();
	}

}
