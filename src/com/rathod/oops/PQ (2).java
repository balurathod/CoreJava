package com.core;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;
class PQ {
static class PQsort
implements Comparator<Integer> { // inverse sort
public int compare(Integer one, Integer two) {
return two - one; // unboxing
}
}
public static void main(String[] args) {
int[] ia = {1,5,3,7,6,9,8 }; // unordered data
PriorityQueue<Integer> pq1 =new PriorityQueue<Integer>(); // use natural order
for(int x : ia) // load queue
	pq1.offer(x);
for(int x : ia) // review queue
System.out.print(pq1.poll() + " ");
System.out.println("");
PQsort pqs = new PQsort(); // get a Comparator
PriorityQueue<Integer> pq2 =new PriorityQueue<Integer>(10,pqs); // use Comparator
for(int x : ia) // load queue
pq2.offer(x);
/*System.out.println("size " + pq2.size());
System.out.println("peek " + pq2.peek());
System.out.println("size " + pq2.size());
System.out.println("poll " + pq2.poll());
System.out.println("size " + pq2.size());*/
for(int x : ia) // review queue
System.out.print(pq2.poll() + " ");


Map map=new HashMap();
map.put("1", "111");
map.put("2","444");
map.put(null, "");
map.put(null, null);
System.out.println(map.values());



Map map1=new Hashtable();
map1.put("1", "111");
map1.put("2","444");
map1.put("3", "333");
//map1.put(null, null);
System.out.println(map1.values());

Set set=new HashSet();
set.add(1);
set.add(2);
set.add(null);
set.add(null);
System.out.println(set.toString());
}
}