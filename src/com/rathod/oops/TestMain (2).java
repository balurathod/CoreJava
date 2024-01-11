package com.core;


import java.util.Date;


final class ImmutableClass

{

private final Integer immutableField1;

private final String immutableField2;

private final Date mutableField;

private ImmutableClass(Integer fld1, String fld2, Date date)

{

this.immutableField1 = fld1;

this.immutableField2 = fld2;

this.mutableField = new Date(date.getTime());

}

public static ImmutableClass createNewInstance(Integer fld1, String fld2, Date date)

{

return new ImmutableClass(fld1, fld2, date);

}

public Integer getImmutableField1() {

return immutableField1;

}


public String getImmutableField2() {

return immutableField2;

}


public Date getMutableField() {

return new Date(mutableField.getTime());

}

 

@Override

public String toString() {

return immutableField1 +" - "+ immutableField2 +" - "+ mutableField;

}

}











class TestMain

{

public static void main(String[] args)

{

ImmutableClass im = ImmutableClass.createNewInstance(100,"test", new Date());

System.out.println(im);

tryModification(im.getImmutableField1(),im.getImmutableField2(),im.getMutableField());

System.out.println(im);

}


private static void tryModification(Integer immutableField1, String immutableField2, Date mutableField)

{

immutableField1 = 10000;

immutableField2 = "test changed";

mutableField.setDate(10);

}
}