package com.rathod.genericCollection;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Test class to test sorting of Employee object on different parameters.
 * each test method will test each Comparator implementation.
 * @author http://javarevisited.blogpot.com
 */
public class CustmSortingUsingComparatorForEmployeeTest {
  
 
    @Test
    public void testEmployeeSorting(){
    	CustmSortingUsingComparatorForEmployee e1 = new CustmSortingUsingComparatorForEmployee(1, "A", 1000, 32, new Date(2011, 10, 1));
    	CustmSortingUsingComparatorForEmployee e2 = new CustmSortingUsingComparatorForEmployee(2, "AB", 1300, 22, new Date(2012, 10, 1));
    	CustmSortingUsingComparatorForEmployee e3 = new CustmSortingUsingComparatorForEmployee(3, "B", 10, 42, new Date(2010, 11, 3));
    	CustmSortingUsingComparatorForEmployee e4 = new CustmSortingUsingComparatorForEmployee(4, "CD", 100, 23, new Date(2011, 10, 1));
    	CustmSortingUsingComparatorForEmployee e5 = new CustmSortingUsingComparatorForEmployee(5, "AAA", 1200, 26, new Date(2011, 10, 1));
      
        List<CustmSortingUsingComparatorForEmployee> listOfEmployees = new ArrayList<CustmSortingUsingComparatorForEmployee>();
        listOfEmployees.add(e1);
        listOfEmployees.add(e2);
        listOfEmployees.add(e3);
        listOfEmployees.add(e4);
        listOfEmployees.add(e5);
        System.out.println("Unsorted List : " + listOfEmployees);
      
        Collections.sort(listOfEmployees);      //Sorting by natural order
        assertEquals(e1, listOfEmployees.get(0));
        assertEquals(e5, listOfEmployees.get(4));
      
        Collections.sort(listOfEmployees, CustmSortingUsingComparatorForEmployee.NameComparator);
        assertEquals(e1, listOfEmployees.get(0));
        assertEquals(e4, listOfEmployees.get(4));
      
        Collections.sort(listOfEmployees, CustmSortingUsingComparatorForEmployee.AgeComparator);
        assertEquals(e2, listOfEmployees.get(0));
        assertEquals(e3, listOfEmployees.get(4));
      
        Collections.sort(listOfEmployees, CustmSortingUsingComparatorForEmployee.SalaryComparator);
        assertEquals(e3, listOfEmployees.get(0));
        assertEquals(e2, listOfEmployees.get(4));
      
        Collections.sort(listOfEmployees, CustmSortingUsingComparatorForEmployee.DOJComparator);
        assertEquals(e3, listOfEmployees.get(0));
        assertEquals(e2, listOfEmployees.get(4));
    }
}


//Read more: https://javarevisited.blogspot.com/2014/01/java-comparator-example-for-custom.html#ixzz5drkvWdUD