package com.rathod.oops;


class CloneTest implements Cloneable{
	int a;
	public void m1(){
		System.out.println("m1");
	}
	/*public Object Myclone(){
		CloneTest ex=null;
		if(ex==null){
			ex=new CloneTest();
			try {
				throw new CloneNotSupportedException();
			} catch (CloneNotSupportedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return ex;
	}*/
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
}

 class CloneEx extends java.lang.Object{	 
public static void main(String[] args) {
	CloneTest test=new CloneTest();
	CloneTest test2;
	try {
		test2 = (CloneTest) test.clone();
	} catch (CloneNotSupportedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}

}
