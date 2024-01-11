package com.rathod.assignments.faq;

public class ByteArrayToString {
	public static void convertByteArrayToString() {		 
        byte[] byteArray = new byte[] {78,73, 67,69};
        String value = new String(byteArray);
        System.out.println(value); 
    }
 
    public static void main(String[] args) {
        ByteArrayToString.convertByteArrayToString();
    } 
}
