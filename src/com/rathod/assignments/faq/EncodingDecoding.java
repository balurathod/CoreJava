package com.rathod.assignments.faq;

public class EncodingDecoding {

	public String encode(String str) {
	    StringBuilder sb = new StringBuilder();
	    char tmp = str.charAt(0);
	    int count = 1;
	    for (int idx = 1; idx < str.length(); idx++) {
	        char curr = str.charAt(idx);
	        if (curr == tmp) {
	            count++;
	        } else {
	            sb.append(tmp).append(count);
	            count = 1;
	        }
	        tmp = curr;
	    }
	    sb.append(tmp).append(count);
	    return sb.toString();
	}
	
	public String decode(String str) {
	    StringBuilder sb = new StringBuilder();
	    for (int i = 0; i < str.length(); i += 2) {
	        int count = Integer.valueOf("" + str.charAt(i + 1));
	        for (int j = 0; j < count; j++) {
	            sb.append(str.charAt(i));
	        }
	    }
	    return sb.toString();
	}
	
	public static void main(String[] args) {
		EncodingDecoding ec = new EncodingDecoding();
		
		System.out.println(ec.encode("aaabcddyyyyrrttpkmmmm"));
	    System.out.println(ec.decode("a3b1c1d2y4r2t2p1k1m4"));

	}

}
