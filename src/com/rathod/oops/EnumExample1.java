package com.rathod.oops;
//The java compiler internally creates a static and final class that extends the Enum class as shown in the below example:
public static final class EnumExample1$Season extends Enum  
{  
  private EnumExample1$Season(String s, int i)  
    {  
        super(s, i);  
    }  
  
    public static EnumExample1$Season[] values()  
    {  
        return (EnumExample1$Season[])$VALUES.clone();  
    }  
  
    public static EnumExample1$Season valueOf(String s)  
    {  
        return (EnumExample1$Season)Enum.valueOf(EnumExample1$Season, s);  
    }  
  
    public static final EnumExample1$Season WINTER;  
    public static final EnumExample1$Season SPRING;  
    public static final EnumExample1$Season SUMMER;  
    public static final EnumExample1$Season FALL;  
    private static final EnumExample1$Season $VALUES[];  
  
    static   
    {  
        WINTER = new EnumExample1$Season("WINTER", 0);  
        SPRING = new EnumExample1$Season("SPRING", 1);  
        SUMMER = new EnumExample1$Season("SUMMER", 2);  
        FALL = new EnumExample1$Season("FALL", 3);  
        $VALUES = (new EnumExample1$Season[] {  
            WINTER, SPRING, SUMMER, FALL  
        });  
    }  
  
}  