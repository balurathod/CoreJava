package com.rathod.oops;

import java.util.Scanner;

class Node{
	int info;
	Node node;
	public Node(){}
	public Node(int info, Node node) {
		super();
		this.info = info;
		this.node = node;
	}
	public int getInfo() {
		return info;
	}
	public void setInfo(int info) {
		this.info = info;
	}
	public Node getNode() {
		return node;
	}
	public void setNode(Node node) {
		this.node = node;
	}
	
}

public class NewLinkListEx {
	public static Node createNode(){
		System.out.println("Enter the node value");
		Scanner scanner=new Scanner(System.in);
		int info = scanner.nextInt();
		Node head=new Node(info,null);
		return head;
	}
	
	public static Node createNodeAtBegin(Node node){
		
		
		return null;
	}
public static void main(String args[]){
	Scanner ch=new Scanner(System.in);
	System.out.println("Enter value ::::Y OR N");
	String ch1=ch.nextLine();
	
	char ch2=ch1.charAt(0);
		
		if(ch2=='n'){
			System.out.println("program is exiting!!!!!!");
			System.exit(0);
		}
		else{
			Node node=new Node();
			node=createNode();
			System.out.println("node value : "+node.getInfo());
			System.out.println("node address:"+node.getNode());
			createNodeAtBegin(node);
		}
	}
}

