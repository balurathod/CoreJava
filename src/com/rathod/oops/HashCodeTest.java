package com.rathod.oops;

public class HashCodeTest {
    int        employeeId;
    String     name;
    Department dept;

    // other methods would be in here 

    @Override
    public int hashCode() {
        int hash = 1;
        hash = hash * 17 + employeeId;
        System.out.println("hash = "+hash);
        //hash = hash * 31 + name.hashCode();
       // System.out.println("name.hashCode() = "+hash);
        hash = hash * 13 + (dept == null ? 0 : dept.hashCode());
        System.out.println("hash 3rd= "+hash);
        return hash;
    }
    public static void main(String[] args){
    	HashCodeTest ht = new HashCodeTest();
    	ht.hashCode();
    }
    
    
}

//===op===
//hash = 17
//hash 3rd= 221

