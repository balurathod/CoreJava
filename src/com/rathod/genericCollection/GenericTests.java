package com.rathod.genericCollection;
import java.util.*;  
abstract class ShapeEx{  
	abstract void draw();  
}

class RectangleEx extends ShapeEx{  
	void draw(){System.out.println("drawing rectangle");}  
}  

class CircleEx extends ShapeEx{  
	void draw(){System.out.println("drawing circle");}  
}  

public class GenericTests{  
	//creating a method that accepts only child class of Shape  
	public static void drawShapes(List<? extends ShapeEx> lists){  
			for(ShapeEx s:lists){  
			s.draw();//calling method of Shape class by child class instance  
		}  
	}  
	public static void main(String args[]){  
		List<RectangleEx> list1=new ArrayList<RectangleEx>();  
		list1.add(new RectangleEx());  
		  
		List<CircleEx> list2=new ArrayList<CircleEx>();  
		list2.add(new CircleEx());  
		list2.add(new CircleEx());  
		  
		drawShapes(list1);  
		drawShapes(list2);  
	}
}  
