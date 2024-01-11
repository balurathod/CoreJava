package com.rathod.genericCollection;

public class GenrcClass<T> {
		  private T t;

		  public void add(T t) {
		    this.t = t;
		  }

		  public T get() {
		    return t;
		  }

		  public static void main(String[] args) {
			  GenrcClass<Integer> integerBox = new GenrcClass<Integer>();
			  GenrcClass<String> stringBox = new GenrcClass<String>();
		    
		     integerBox.add(new Integer(10));
		     stringBox.add(new String("Hello World"));

		     System.out.printf("Integer Value :%d\n\n", integerBox.get());
		     System.out.printf("String Value :%s\n", stringBox.get());
		  }
}