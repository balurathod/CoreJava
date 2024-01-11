package com.rathod.assignments.hackerRank;

/* IMPORTANT: Multiple classes and nested static classes are supported */

  //uncomment this if you want to read input.
// imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;

// import for Scanner and other utility classes
import java.util.*;


// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

class FavouriteSong {
    public static void main(String args[] ) throws Exception {
        /* Sample code to perform I/O:
         * Use either of these methods for input
         
        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();                // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT
 */
        //Scanner
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();                 // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

        

        // Write your code here5
        // Scanner sc = new Scanner(System.in);
        // int name = Integer.parseInt(sc.nextLine()); 
        Map<Integer, Integer> singerCount = new HashMap<>();

        String[] singers = s.nextLine().split("");
        for(String singersStr:  singers) {
            int singer = Integer.parseInt(singersStr);
            singerCount.put(singer, singerCount.getOrDefault(singer, 0) + 1);
        }

        int maxCount = 0;
        for(int counts: singerCount.values()) {
            maxCount = Math.max(maxCount, counts);
        }

        int favouriteSingersCount = 0;
        for(int counts: singerCount.values()) {
            if(maxCount == counts){
                favouriteSingersCount++;
            }
        }
    System.out.println("favourite Singers Count " + favouriteSingersCount);
    }
}
