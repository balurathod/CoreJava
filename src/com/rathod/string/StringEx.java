package com.rathod.string;

public class StringEx {

	public static void main(String[] args) {
		String str = new String();
		String str1 = new String("Hello");
		String str2 = "Hello";
		String str3 = "This is an example of string";
		System.out.println(str.toString());
		System.out.println(str1);
		System.out.println(str2);

		System.out.println(str3.charAt(2));
		System.out.println(str1.codePointAt(3));
		System.out.println(str2.compareTo(str1));

		System.out.println(str.concat(str1));
		System.out.println(str1.contains(str3));
		System.out.println(str2.contentEquals("l"));

		System.out.println(str3.length());
		System.out.println(str.hashCode());
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		System.out.println(str3.hashCode());
		System.out.println(str3.replace("This", "That"));
		System.out.println(str3.trim());
		System.out.println(str2.getClass());

		System.out.println(str.concat(str1));
		System.out.println(str1.contains(str3));
		System.out.println(str2.contentEquals("l"));

		if (str1 == str2)
			System.out.println("True");
		else if (str1.equals(str2))
			System.out.println("Equals True");
		else
			System.out.println("False");
	}
}
