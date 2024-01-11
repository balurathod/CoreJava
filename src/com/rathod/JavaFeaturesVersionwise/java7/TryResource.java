package com.rathod.java7;
class Temp implements AutoCloseable {

	@Override
	public void close() throws Exception {
		System.out.println("Closing !");
		throw new Exception("ohhh no...");
	}
	
}
public class TryResource {

	public static void main(String[] args) {

		try(Temp tmp = new Temp()) {
			
		}catch(Exception e ){
			e.printStackTrace();
		}
	}
}
