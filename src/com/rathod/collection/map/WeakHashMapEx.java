package com.rathod.collection.map;

import java.util.Map;
import java.util.WeakHashMap;

public class WeakHashMapEx {

	public static void main(String[] args) {
		Map<Order, Integer> orders = new WeakHashMap<Order, Integer>();
		orders.put( new Order(1,"Michel"), 111);//weak ref obj
		orders.put( new Order(2,"Georgie"), 222);
		orders.put( new Order(3,"Sam"), 333);
		System.out.println(orders.size());
		System.out.println(orders.keySet());
		System.out.println(orders.entrySet());
		
		System.gc();
		System.out.println(orders.size());
	}

}
class Order {
	int orderId;
	String OrderDetls;
	public Order(int id, String dtls) {
		id= orderId;
		dtls = OrderDetls;
	}
		
}
