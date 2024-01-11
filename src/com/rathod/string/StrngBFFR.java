package com.rathod.string;

public class StrngBFFR {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		sb.append("One ");
		sb.append(true);
		sb.append(" " + 'c');
		System.out.println(sb.insert(4, 'h'));
		System.out.println(sb.delete(4, 5));

		sb.append(" " + 6.9).toString();
		System.out.println(sb);
		System.out.println(sb.reverse());

		StringBuilder sbl = new StringBuilder();
		sbl.append("One ");
		sbl.append(true);
		sbl.append(" " + 'c');
		System.out.println(sbl.insert(4, 'h'));
		System.out.println(sbl.delete(4, 5));

		sbl.append(" " + 6.9).toString();
		System.out.println(sbl);
		System.out.println(sbl.reverse());

	}

}
