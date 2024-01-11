package com.rathod.assignments.faq;

//The @Override and @Deprecated are marker annotations.
@interface MyAnnotation{}  

@interface MySingleValueAnnotation{  
	int value();  
}  

@interface MySingleValAnnotation{  
	int value() default 0;  
}  

@interface MyMultiValAnnotation{  
	int value1();  
	String value2();  
	String value3();  
}  
