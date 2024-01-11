package com.rathod.oops;
enum Gender
{
    MALE, FEMALE
}

//4 - Serialization can put a proxy in your stream
/*
Packing and unpacking the proxy
Together, the writeReplace and readResolve methods enable a PersonSeri class to pack a PersonProxy with all of its data (or some core subset of it), put it into a stream and then unwind the packing later when it is deserialized.
 */
class PersonProxy implements java.io.Serializable
{
	public PersonProxy(PersonSeri orig)
	{
	    data = orig.getFirstName() + "," + orig.getLastName() + "," + orig.getAge();
	    if (orig.getSpouse() != null)
	    {
	    	PersonSeri spouse = orig.getSpouse();
	        data = data + "," + spouse.getFirstName() + "," + spouse.getLastName() + ","  
	          + spouse.getAge();
	    }
	}
	
	public String data;
	private Object readResolve()
	    throws java.io.ObjectStreamException
	{
	    String[] pieces = data.split(",");
	    PersonSeri result = new PersonSeri(pieces[0], pieces[1], Integer.parseInt(pieces[2]));
	    if (pieces.length > 3)
	    {
	        result.setSpouse(new PersonSeri(pieces[3], pieces[4], Integer.parseInt
	          (pieces[5])));
	        result.getSpouse().setSpouse(result);
	    }
	    return result;
	}
}

public class PersonSeri implements java.io.Serializable
	{
	 	private String firstName;
	    private String lastName;
	    private int age;
	    private PersonSeri spouse;
	    private Gender gender;
	    
	    public PersonSeri(String fn, String ln, int a)
	    {
	        this.firstName = fn; this.lastName = ln; this.age = a;
	    }
	    public Gender getGender() { return gender; }
	    
	    public String getFirstName() { return firstName; }
	    
	    public String getLastName() { return lastName; }
	    
	    public int getAge() { return age; }
	    
	    public PersonSeri getSpouse() { return spouse; }

	    public void setFirstName(String value) { firstName = value; }
	    
	    public void setLastName(String value) { lastName = value; }
	    
	    public void setGender(Gender value) { gender = value; }
	    
	    public void setAge(int value) { age = value; }
	    
	    public void setSpouse(PersonSeri value) { spouse = value; }

	    private void writeObject(java.io.ObjectOutputStream stream)
        throws java.io.IOException
	    {
	        // "Encrypt"/obscure the sensitive data
	        age = age >> 2;
	        stream.defaultWriteObject();
	    }
//2 - Suppose the sensitive data in the PersonSeri class were the age field; after all, a lady never reveals her age and a gentleman never tells. We can obscure this data by rotating the bits once to the left before serialization, and then rotate them back after deserialization. 
	    private void readObject(java.io.ObjectInputStream stream)
	        throws java.io.IOException, ClassNotFoundException
	    {
	        stream.defaultReadObject();
	
	        // "Decrypt"/de-obscure the sensitive data
	        age = age << 2;
	    }
    
//1 - Serialization allows for refactoring    
	    public String toString()
	    {
	        return "[PersonSeri: firstName=" + firstName + 
	            " lastName=" + lastName +
	            " gender=" + gender +
	            " age=" + age +
	            " spouse=" + getFirstName() +
	            "]";
	    } 
/*3 - If you need to encrypt and sign an entire object, the simplest thing is to put it in a 
	    javax.crypto.SealedObject and/or java.security.SignedObject wrapper. Both are serializable, 
	    so wrapping your object in SealedObject creates a sort of "gift box" around the original object. 
	    You need a symmetric key to do the encryption, and the key must be managed independently. 
	    Likewise, you can use SignedObject for data verification, and again the symmetric key must be 
	    managed independently.
	    

5. Trust, but validate
It would be nice to assume that the data in the serialized stream is always the same data that was written to the stream originally. But, as a former President of the United States once pointed out, it's a safer policy to "trust, but verify."
In the case of serialized objects, this means validating the fields to ensure that they hold legitimate values after deserialization, "just in case." We can do this by implementing the ObjectInputValidation interface and overriding the validateObject() method. If something looks amiss when it is called, we throw an InvalidObjectException.


Short story about serialization

After many years of hard work, Earth's scientists developed a robot who can help them in daily work. But this robot had fewer features than the robots developed by the scientists from planet Mars.

After a meeting between both planets' scientists, it is decided that Mars will send their robots to Earth. But a problem occurred. The cost of sending 100 robots to Earth was $100 million. And it takes around 60 days of traveling.

Finally, Mar's scientists decided to share their secret with Earth's scientists. This secret was about the structure of class/robot. Earth's scientists developed the same structure on Earth itself. Mar's scientists serialized the data of each robot and sent it to earth. Earth's scientists deserialized the data and fed it into each robot accordingly.

This process saved them time in communicating a massive amount of data.

Some of the robots were being used in some defensive work on Mars. So their scientists marked some crucial properties of those robots as transient before sending their data to Earth. Note that the transient property is set to null (in case of reference) or to the default value (in case of the primitive type) when the object gets deserialized.

One more point noticed by Earth's scientists is that Mars's scientists asked them to create some static variables to keep details about the environment. These details are used by some robots. But Mars's scientists don't share these details. Because Earth's environment was different from Mars' environment.

Even though knowing about the robot class structure and having serialized data Earth's scientist were not able to deserialize the data which can make robots working.

Exception in thread "main" java.io.InvalidClassException:
SerializeMe; local class incompatible: stream classdesc
:
Mars's scientists were waiting for the complete payment. Once the payment was done Mars's scientists shared the serialversionUID with Earth's scientists. Earth's scientist set it to robot class and everything started working.


When you want to save an object's state into a file or send it over the network, you need to transform it into a series of bytes. This is called serialization.

Java has a built-in mechanism for that, other options include XML or JSON.

Examples when you need this: Caching objects, making remote method calls, saving an object graph to disk.
*
*/
	}