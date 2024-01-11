package com.rathod.assignments.faq;

public class PrintStar {

	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(i+"*");
			}
			System.out.println(); //use to break lines
		}
		for (int i = 5; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				System.out.print('*');
			}
			System.out.println();
		}
		for (int i = 5; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				System.out.print(' ');
			}
			System.out.println('*');
		}
		for (int i = 5; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				System.out.print(' ');
			}
			System.out.println(); //use to break lines
		}
		
		int number = 7;
        int count = number - 1;
        for (int k = 1; k <= number; k++) {
            for (int i = 1; i <= count; i++)
                System.out.print(" ");
            	count--;
            for (int i = 1; i <= 2 * k - 1; i++)
                System.out.print("*");
            	System.out.println();
 
        }
        count = 1;
        for (int k = 1; k <= number-1; k++) {
            for (int i = 1; i <= count; i++)
                System.out.print(" ");
            	count++;
            for (int i = 1; i <= 2 * (number - k) - 1; i++)
                System.out.print("*");
            	System.out.println();
 
        }
        
        int val = 8;
        for (int i = 1; i <= val; i++) {
            for (int j = 1; j <= val - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        
        
        number = 8;
        for (int i = 0; i < number; ++i) {
            for (int j = 0; j <= i; ++j) {
                System.out.print("*");
            }
 
            if (i != number - 1) {
                System.out.print(" ");
            } else {
                System.out.print(" *");
            }
            for (int j = 0; j <= i; ++j) {
                System.out.print("*");
            } 
            System.out.println();
        }
        
        number = 7;
        for (int i = 0; i < number; i++) {
            if (i == 0 || i == 6) {
                for (int j = 0; j < number; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
            if (i >= 1 && i <= 5) {
                for (int j = 0; j < number; j++) {
                    if (j == 0 || j == 6) {
                        System.out.print("*");
                    } else if (j >= 1 && j <= 5) {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
        
        int n = 8;
        for (int i = 0; i < n; ++i) {
            stars(i + 1);
            spaces(n - i - 1);
            stars(n - i + 1);
            spaces(2 * i);
            stars(n - i);
            spaces(n - i - 1);
            stars(i + 1);
 
            System.out.println();
        } 

	}
	private static void stars(int count) {
        for (int i = 0; i < count; ++i)
            System.out.print("*");
    }
 
    private static void spaces(int count) {
        for (int i = 0; i < count; ++i)
            System.out.print(" ");
    }

}
