package com.rathod.serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
//Question 5) What will happen if one of the members in the class doesn't implement Serializable interface?
//One of the easy question about Serialization process in Java. If you try to serialize an object of a class which implements Serializable, but the object includes a reference to an non- Serializable class then a ‘NotSerializableException’ will be thrown at runtime and this is why I always put a SerializableAlert (comment section in my code) , one of the code comment best practices, to instruct developer to remember this fact while adding a new field in a Serializable class.

public class SerializeDemo {

	public static void main(String[] args) {
		Employee e = new Employee();
		e.name = "Balu Rathod";
		e.address = "c/o B D Buchade at post Marunji Hinjewadi Pune";
		e.SSN = 11122333;
		e.number = 101;

		try {
			FileOutputStream fileOut = new FileOutputStream(
					"D:/Workspace/CoreJava/src/com/rathod/serialization/employee.ser");
			ObjectOutputStream out = new ObjectOutputStream(fileOut);
			out.writeObject(e);
			out.close();
			fileOut.close();
			System.out
					.printf("Serialized data is saved in D:/Workspace/CoreJava/src/com/rathod/serialization/employee.ser");
		} catch (IOException i) {
			i.printStackTrace();
		}
	}
}
/*
 * Question 6) If a class is Serializable but its super class in not, what will
 * be the state of the instance variables inherited from super class after
 * deserialization? Java serialization process only continues in object
 * hierarchy till the class is Serializable i.e. implements Serializable
 * interface in Java and values of the instance variables inherited from super
 * class will be initialized by calling constructor of Non-Serializable Super
 * class during deserialization process. Once the constructor chaining will
 * started it wouldn't be possible to stop that , hence even if classes higher
 * in hierarchy implements Serializable interface , there constructor will be
 * executed. As you see from the statement this Serialization interview question
 * looks very tricky and tough but if you are familiar with key concepts its not
 * that difficult.
 * 
 * 
 * 
 * Question 7) Can you Customize Serialization process or can you override
 * default Serialization process in Java? The answer is yes you can. We all know
 * that for serializing an object ObjectOutputStream.writeObject
 * (saveThisobject) is invoked and for reading object
 * ObjectInputStream.readObject() is invoked but there is one more thing which
 * Java Virtual Machine provides you is to define these two method in your
 * class. If you define these two methods in your class then JVM will invoke
 * these two methods instead of applying default serialization mechanism. You
 * can customize behavior of object serialization and deserialization here by
 * doing any kind of pre or post processing task. Important point to note is
 * making these methods private to avoid being inherited, overridden or
 * overloaded. Since only Java Virtual Machine can call private method integrity
 * of your class will remain and Java Serialization will work as normal. In my
 * opinion this is one of the best question one can ask in any Java
 * Serialization interview, a good follow-up question is why should you provide
 * custom serialized form for your object?
 * 
 * 
 * 
 * Question 8) Suppose super class of a new class implement Serializable
 * interface, how can you avoid new class to being serialized? One of the tricky
 * interview question in Serialization in Java. If Super Class of a Class
 * already implements Serializable interface in Java then its already
 * Serializable in Java, since you can not unimplemented an interface its not
 * really possible to make it Non Serializable class but yes there is a way to
 * avoid serialization of new class. To avoid Java serialization you need to
 * implement writeObject() and readObject() method in your Class and need to
 * throw NotSerializableException from those method. This is another benefit of
 * customizing java serialization process as described in above Serialization
 * interview question and normally it asked as follow-up question as interview
 * progresses.
 * 
 * 
 * 
 * Question 9) Which methods are used during Serialization and DeSerialization
 * process in Java? This is very common interview question in Serialization
 * basically interviewer is trying to know; Whether you are familiar with usage
 * of readObject(), writeObject(), readExternal() and writeExternal() or not.
 * Java Serialization is done by java.io.ObjectOutputStream class. That class is
 * a filter stream which is wrapped around a lower-level byte stream to handle
 * the serialization mechanism. To store any object via serialization mechanism
 * we call ObjectOutputStream.writeObject(saveThisobject) and to deserialize
 * that object we call ObjectInputStream.readObject() method. Call to
 * writeObject() method trigger serialization process in java. one important
 * thing to note about readObject() method is that it is used to read bytes from
 * the persistence and to create object from those bytes and its return an
 * Object which needs to be type cast to correct type.
 * 
 * 
 * 
 * Question 10) Suppose you have a class which you serialized it and stored in
 * persistence and later modified that class to add a new field. What will
 * happen if you deserialize the object already serialized? It depends on
 * whether class has its own serialVersionUID or not. As we know from above
 * question that if we don't provide serialVersionUID in our code java compiler
 * will generate it and normally it’s equal to hashCode of object. by adding any
 * new field there is chance that new serialVersionUID generated for that class
 * version is not the same of already serialized object and in this case Java
 * Serialization API will throw java.io.InvalidClassException and this is the
 * reason its recommended to have your own serialVersionUID in code and make
 * sure to keep it same always for a single class.
 * 
 * 
 * 
 * 11) What are the compatible changes and incompatible changes in Java
 * Serialization Mechanism? The real challenge lies with change in class
 * structure by adding any field, method or removing any field or method is that
 * with already serialized object. As per Java Serialization specification
 * adding any field or method comes under compatible change and changing class
 * hierarchy or UN-implementing Serializable interfaces some under non
 * compatible changes. For complete list of compatible and non compatible
 * changes I would advise reading Java serialization specification.
 * 
 * 
 * 
 * 12) Can we transfer a Serialized object vie network? Yes you can transfer a
 * Serialized object via network because Java serialized object remains in form
 * of bytes which can be transmitter via network. You can also store serialized
 * object in Disk or database as Blob.
 * 
 * 
 * 
 * 13) Which kind of variables is not serialized during Java Serialization? This
 * question asked sometime differently but the purpose is same whether Java
 * developer knows specifics about static and transient variable or not. Since
 * static variables belong to the class and not to an object they are not the
 * part of the state of object so they are not saved during Java Serialization
 * process. As Java Serialization only persist state of object and not object
 * itself. Transient variables are also not included in java serialization
 * process and are not the part of the object’s serialized state. After this
 * question sometime interviewer ask a follow-up if you don't store values of
 * these variables then what would be value of these variable once you
 * deserialize and recreate those object? This is for you guys to think about .
 */