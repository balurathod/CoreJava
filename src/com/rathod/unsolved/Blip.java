package com.rathod.unsolved;
public class Blip {
 protected int blipvert(int x) { return 0; }
 }
 class Vert extends Blip {

protected long blipvert(int x, int y) { return 0; }

 }
/*
A. public int blipvert(int x) { return 0; }
B. private int blipvert(int x) { return 0;  }     due to private
C. private int blipvert(long x) { return 0; }
D. protected long blipvert(int x) { return 0; }   due to diff return type
E. protected int blipvert(long x) { return 0; }
F. protected long blipvert(long x) { return 0; }
G. protected long blipvert(int x, int y) { return 0; }
Answer: A,C,E,F,G



http://www.testkiller.com
http://www.troytec.com
5. // insert code here


*/