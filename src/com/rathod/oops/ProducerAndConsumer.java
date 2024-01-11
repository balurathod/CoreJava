package com.rathod.oops;


class Stack{
	int x;
	boolean flag=false;
	public synchronized void push(int x){
		if(flag){
			System.out.println(flag+"------->push");
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		this.x=x;
		System.out.println("Item pushed in stack :"+x);
		flag=true;
		System.out.println("push ---------->"+flag);
		notify();
		
	}
	public synchronized int pop(){
		if(!flag){
			System.out.println("pop ------->"+flag);
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			} 
				}
		System.out.println("deleted item :"+x);
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		flag=false;
		notify();
		return x;
	}
}


class MyThread implements  Runnable{
	Stack st=null;
	public MyThread(Stack st,String name) {
		this.st=st;
		Thread t2=new Thread();
		t2.start();
	}
	public void run(){
	for(int i=0;i<5;i++){
		st.push(i);
	}
	}
	
}

class Athread implements Runnable{
Stack st = null;
public Athread(Stack st,String name) {
	this.st=st;
	Thread t1=new Thread();
	t1.start();
}
	public void run() {
		for(int i=0;i<5;i++){
			st.pop();
		}
		
	}
	
}



public class ProducerAndConsumer {
public static void main(String[] args) {
	Stack stack=new Stack();
	MyThread myThread=new MyThread(stack,"AThread");
	Athread myRunnable=new Athread(stack,"MyThread");
}
}
