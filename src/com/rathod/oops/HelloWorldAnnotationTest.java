package com.rathod.oops;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
public class HelloWorldAnnotationTest
{
	public static void main( String[] args ) throws Exception
	{
	//access the class annotation
	Class<HelloWorld> clazz = HelloWorld.class;
	System.out.println( clazz.getAnnotation( GreetsTheWorld.class ) );

	//access the constructor annotation
	Constructor<HelloWorld> constructor = clazz.getConstructor((Class[]) null);
	System.out.println(constructor.getAnnotation(GreetsTheWorld.class));

	//access the method annotation
	Method method = clazz.getMethod( "sayHi" );
	System.out.println(method.getAnnotation(GreetsTheWorld.class));

	//access the field annotation
	Field field = clazz.getField("greetingState");
	System.out.println(field.getAnnotation(GreetsTheWorld.class));
	}
}