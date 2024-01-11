package com.rathod.collection;
//avlbl in java.lang pkg
class HDTV implements Comparable<HDTV> {
	private int size;
	private String brand;
 
	public HDTV(int size, String brand) {
		this.size = size;
		this.brand = brand;
	}
 
	public int getSize() {
		return size;
	}
 
	public void setSize(int size) {
		this.size = size;
	}
 
	public String getBrand() {
		return brand;
	}
 
	public void setBrand(String brand) {
		this.brand = brand;
	}
 
	@Override
	public int compareTo(HDTV tv) {
 
		if (this.getSize() > tv.getSize())
			return 1;
		else if (this.getSize() < tv.getSize())
			return -1;
		else
			return 0;
	}
}
	 
public class ComparableTest {
	public static void main(String[] args) {
		HDTV tv1 = new HDTV(55, "Samsung");
		HDTV tv2 = new HDTV(60, "Sony");
 
		if (tv1.compareTo(tv2) > 0) {
			System.out.println(tv1.getBrand() + " is better.");
		} else {
			System.out.println(tv2.getBrand() + " is better.");
		}
	}
}


/*
 *  *==== Comparable=====															
1) Comparable provides single sorting sequence. In other words, we can sort the collection on the basis of single element such as id or name or price etc.
i.e Sorting logic must be in same class whose objects are being sorted. Hence this is called natural ordering of objects
2) Comparable affects the original class i.e. actual class is modified.
3) Comparable provides compareTo() method to sort elements.
4) Comparable is found in java.lang package.
5) We can sort the list elements of Comparable type by Collections.sort(List) method.
 * 
 */