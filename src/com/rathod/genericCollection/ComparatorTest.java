package com.rathod.genericCollection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
//avlbl in java.util pkg
class SizeComparator implements Comparator<HDTV> {
	@Override
	public int compare(HDTV tv1, HDTV tv2) {
		int tv1Size = tv1.getSize();
		int tv2Size = tv2.getSize();
 
		if (tv1Size > tv2Size) {
			return 1;
		} else if (tv1Size < tv2Size) {
			return -1;
		} else {
			return 0;
		}
	}
}
public class ComparatorTest {
	public static void main(String[] args) {
		HDTV tv1 = new HDTV(55, "Samsung");
		HDTV tv2 = new HDTV(60, "Sony");
		HDTV tv3 = new HDTV(42, "Panasonic");
 
		ArrayList<HDTV> al = new ArrayList<HDTV>();
		al.add(tv1);
		al.add(tv2);
		al.add(tv3);
 
		Collections.sort(al, new SizeComparator());
		for (HDTV a : al) {
			System.out.println(a.getBrand());
		}
	}
}


/*
			=====Comparator=======
			
1) Comparator provides multiple sorting sequence. In other words, we can sort the collection on the basis of multiple elements such as id, name and price etc.
i.e Sorting logic is in separate class. Hence we can write different sorting based on different attributes of objects to be sorted. E.g. Sorting using id,name etc.
2) Comparator doesn't affect the original class i.e. actual class is not modified.
3) Comparator provides compare() method to sort elements.
4) Comparator is found in java.util package.
6) We can sort the list elements of Comparator type by Collections.sort(List,Comparator) method.
 * 
 */