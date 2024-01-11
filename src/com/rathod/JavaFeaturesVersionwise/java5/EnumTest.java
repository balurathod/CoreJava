package com.rathod.java5;
//====New Way======
public class EnumTest
{
    public static final int SUNDAY = 0;
    public static final int MONDAY = 1;
    public static final int TUESDAY = 2;
    public static final int WEDNESDAY = 3;
    public static final int THURSDAY = 4;
    public static final int FRIDAY = 5;
    public static final int SATURDAY = 6;

    void printAppointment(int day) {
        System.out.println(" Please come on " + day);
    }

    public static void main(String[] args) 
    {
        new EnumTest().printAppointment(WEDNESDAY);
    }
} 
/*
 * Output: Please come on 3
Here, there is no type-safety for enum values because compiler can accept any integer number for ‘int’ variable. We can’t stop somebody from passing outside range values to enum variable. For example, we can call printAppointment() method with value 10 or even -25, compiler won’t complain that this is not valid even though we are expecting a number between 0 and 6.

Another issue is that the value displayed would be a number which is not informative. By seeing that number we do not know which enum value it is referring to, moreover we do not even know that it is an enum because of the number. You can understand this better by seeing the above output.
 * 
 * 
 * 
 * 
 * ====New Way======Type Safe=====
 * public class NewEnumTest 
    {
        public enum Day {
            SUNDAY, MONDAY, TUESDAY, WEDNESDAY, 
            THURSDAY, FRIDAY, SATURDAY
        }

        void printAppointment(Day day) {
            System.out.println(" Please come on " + day);
        }

        public static void main(String[] args) 
        {
            new NewEnumTest().printAppointment(Day.TUESDAY);
        }
    } 
    
    
    
    Here, compiler accepts only those values which are defined in enum ‘Day’ to be passed to printAppointment() method, thus providing compile time type-safety. Also, the output is so informative that we can understand very easily.
    
    
    
*/
