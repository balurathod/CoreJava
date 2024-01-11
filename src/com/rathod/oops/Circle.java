package com.rathod.oops;
//21. Given:
 public abstract class Shape 
	 {
          int x;
          int y;                           //snipet of coding r also ask in exam?
      
	  public abstract void draw();

      public void setAnchor(int x, int y)
		  {
                  this.x = x;
                 this.y = y;
          }
    }

//draw() is define in circle class.

/*and a class Circle that extends and fully implements the Shape class.
Which is correct?
A. Shape s = new Shape();
     s.setAnchor(10,10);
     s.draw();
B. Circle c = new Shape();
     c.setAnchor(10,10);
     c.draw();
C. Shape s = new Circle();
     s.setAnchor(10,10);
     s.draw();
D. Shape s = new Circle();
     s->setAnchor(10,10);
     s->draw();
E. Circle c = new Circle();
    c.Shape.setAnchor(10,10);
    c.Shape.draw();
Answer: C
*/