package com.rathod.oops;
//Hiding and Overriding Methods In Java
//Now in section Inheritance mainly in Hiding And Overriding Methods 
//Can we predict the output of the following program? 

class HidePoint {
int x = 0, y = 0;
void move(int dx, int dy)
	{
		x += dx;
		y += dy;
	}
int getX() { return x; }
int getY() { return y; }
int color;
}

class HideRealPoint extends HidePoint {
		float x = 0.0f, y = 0.0f;
		void move(int dx, int dy) 
			{
			   move((float)dx, (float)dy);
			}
		void move(float dx, float dy) 
			{
				x += dx;
				y += dy;
			}
		int getX() { return (int)Math.floor(x); }
		int getY() { return (int)Math.floor(y); }
}

public class HidingOverridingExample {

	public static void main(String[] args) {
		HideRealPoint rp = new HideRealPoint();
		HidePoint p = rp;
		rp.move(1.71828f, 4.14159f);
		p.move(1, -1);
		show(p.x, p.y);
		show(rp.x, rp.y);
		show(p.getX(), p.getY());
		show(rp.getX(), rp.getY());
}
static void show(int x, int y) {
System.out.println("(" + x + ", " + y + ")");
}
static void show(float x, float y) {
System.out.println("(" + x + ", " + y + ")");
}
}
/*

It Prints:
(0, 0)
(2.7182798, 3.14159)
(2, 3)
(2, 3)
Here the overriding methods getX and getY in class RealPoint have the same return types as the methods of class Point that they override, so this code can be successfully compiled. 
The first line of output illustrates the fact that an instance of RealPoint actually contains the two integer fields declared in class Point; it is just that their names are hidden from code that occurs within the declaration of class RealPoint (and those of any subclasses it might have). When a reference to an instance of class RealPoint in a variable of type Point is used to access the field x, the integer field x declared in class Point is accessed. The fact that its value is zero indicates that the method invocation p.move(1, -1) did not invoke the method move of class Point; instead, it invoked the overriding method move of class RealPoint. 
The second line of output shows that the field access rp.x refers to the field x declared in class RealPoint. This field is of type float, and this second line of output accordingly displays floating-point values. Incidentally, this also illustrates the fact that the method name show is overloaded; the types of the arguments in the method invocation dictate which of the two definitions will be invoked. 
The last two lines of output show that the method invocations p.getX() and rp.getX() each invoke the getX method declared in class RealPoint. Indeed, there is no way to invoke the getX method of class Point for an instance of class RealPoint from outside the body of RealPoint, no matter what the type of the variable we may use to hold the reference to the object. Thus, we see that fields and methods behave differently: hiding is different from overriding. 

*/
