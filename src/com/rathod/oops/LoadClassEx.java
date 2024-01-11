package com.rathod.oops;

import com.core.interfacetest.TestDao;

public class LoadClassEx { 
	protected TestDao getImpl(Class class1){
		TestDao dao=null;
		String classPackage=class1.getPackage().toString().substring(8);
		System.out.println("classPackage: "+classPackage);
		int length=classPackage.length();
		String className=class1.getName().substring(length+1);
		System.out.println("className :"+className);
		String classPackageImpl=classPackage+"Impl";
		System.out.println("classPackageImpl :"+classPackageImpl);
		String classNameImpl=className+"Impl";
		System.out.println("classNameImpl :"+classNameImpl);

		try {
			Class class2=Class.forName(classPackageImpl+"."+classNameImpl);
			dao=(TestDao)class2.newInstance();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (Throwable e) {
			e.printStackTrace();
		} 
		return dao;
			
		
	}
	public static void main(String[] args) {
		LoadClassEx ex=new LoadClassEx();
		
	 TestDao dao=ex.getImpl(TestDao.class);
	 if(dao instanceof TestDao)
	 {
		 System.out.println("completed   ");
	 }
	}
	
}

