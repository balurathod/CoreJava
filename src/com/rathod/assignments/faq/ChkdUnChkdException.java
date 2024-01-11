package com.rathod.assignments.faq;

public class ChkdUnChkdException {

	public static void main(String[] args) {
		ChkdUnChkdException a = new ChkdUnChkdException();
		ChkdUnChkdException b = new ChkdUnChkdException();
		b = a;
		boolean bul = a.hashCode() == b.hashCode();
		System.out.println(a.hashCode());
		System.out.println(a.hashCode());
		System.out.println(bul);

		boolean bul1 = a.equals(b);
		System.out.println(bul1);
	}

}
