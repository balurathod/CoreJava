package com.rathod.oops;
class Color {

    private String color;

    public Color(String c){
        this.color = c;
    }

    //getters and setters for the fields should go here........
}

class ColoredCircle implements Cloneable {

    private int centerX;
    private int centerY;
	private Color color;

	public ColoredCircle(int x, int y, Color c){
	    this.centerX = x;	
		this.centerY = y;
		this.color = c;
	}

   /* public Object clone() {
        try {
            return (ColoredCircle)super.clone();
        }
        catch (CloneNotSupportedException e) {
            // This should never happen
        }
    }*/

    //getters and setters for the fields should go here........
}

public class CloneMain {

    public static void main(String [] args) {

		Color c = new Color("RED");
        ColoredCircle c1 = new ColoredCircle(200,200,c);
      //  ColoredCircle c2 = c1.clone();
    }
}
