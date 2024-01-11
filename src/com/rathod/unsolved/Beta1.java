package com.rathod.unsolved;
//16. Click the Exhibit button.
 interface Foo {int bar();  }

 public class Beta
	 {
		 class A implements Foo {

                 public int bar() { return 1; } 


                 public int fubar( Foo foo )
					     { return foo.bar(); }

                 public void testFoo() {

                      class A implements Foo {
                        public int bar() { return 2; }
                            }

             System.out.println( fubar( new A() ) );
      }

  public static void main( String[] argv ) {
      new Beta().testFoo();
    } 
 }


/*
Which three statements are true? (Choose three.)
A. Compilation fails.
B. The code compiles and the output is 2.
C. If lines 16, 17 and 18 were removed, compilation would fail.
D. If lines 24, 25 and 26 were removed, compilation would fail.
E. If lines 16, 17 and 18 were removed, the code would compile and output would be 2.
F. If lines 24, 25 and 26 were removed, the code would compile and  output would be 1.
Answer: BEF
*/