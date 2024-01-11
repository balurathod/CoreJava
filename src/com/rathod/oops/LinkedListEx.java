package com.rathod.oops;

import java.util.LinkedList;
import java.util.Scanner;

class LinkEx{
	int info;
	 LinkEx ex;
	
	public LinkEx() {}
	public int getInfo() {
		return info;
	}
	public void setInfo(int info) {
		this.info = info;
	}
	public LinkEx getEx() {
		return ex;
	}
	public void setEx(LinkEx ex) {
		this.ex = ex;
	}
	
	
public static void add(){
	System.out.println("Enter the value for node u want to addd :");
	LinkEx ex1=null;
	int info;
	Scanner scanner=new Scanner(System.in);
	info=scanner.nextInt();
	ex1=createANode(info);
	System.out.println("The node created and info is: "+ex1.getInfo()+"and address of next node is :"+ex1.getEx());
	
}
static LinkEx createANode(int info2) {
	LinkEx nextNode=new LinkEx();
	LinkEx prevNode=new LinkEx();
	LinkEx curNode=new LinkEx();
	curNode.setInfo(info2);
	curNode.setEx(curNode);
	prevNode=curNode;
	//System.out.println(curNode.getInfo()+ ":::::::"+curNode.getEx());
	prevNode.setInfo(curNode.getInfo());
	prevNode.setEx(curNode.getEx());
	//System.out.println(prevNode.getInfo()+ ":::::::"+prevNode.getEx());
	//nextNode.setEx(null);
	curNode.setEx(null);
	//System.out.println("curNode address : "+curNode.getEx());
	
	return prevNode;
}
}
public class LinkedListEx {
public static void main(String[] args) {
	System.out.println("create first node");
	
	LinkEx.add();
LinkEx.add();
	//LinkEx.add();*/
	//LinkEx.createANode(1);

	
}
}
