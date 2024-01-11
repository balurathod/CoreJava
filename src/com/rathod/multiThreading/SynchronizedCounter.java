package com.rathod.multiThreading;

import java.util.List;

public class SynchronizedCounter {
    private int c = 0;
	private int nameCount;
	private List nameList;

    public synchronized void increment() {
        c++;
    	System.out.println("Valu of C inc "+c);
    }

    public synchronized void decrement() {
        c--;
    	System.out.println("Valu of C dcr "+c);

    }

    public synchronized int value() {
    	System.out.println("Valu of C int s"+c);
        return c;
    }
    
    public static void main(String args[]) {
    	SynchronizedCounter sc = new SynchronizedCounter();
    	sc.decrement();
    	sc.increment();    	
    }
    
    public void addName(String name) {
        synchronized(this) {
            String lastName = name;
            nameCount++;
        }
        nameList.add(name);
    }


}

/*
 *If count is an instance of SynchronizedCounter, then making these methods synchronized has two effects: 
•	First, it is not possible for two invocations of synchronized methods on the same object to interleave. When one thread is executing a synchronized method for an object, all other threads that invoke synchronized methods for the same object block (suspend execution) until the first thread is done with the object. 
•	Second, when a synchronized method exits, it automatically establishes a happens-before relationship with any subsequent invocation of a synchronized method for the same object. This guarantees that changes to the state of the object are visible to all threads. 
 
 In this example, the addName method needs to synchronize changes to lastName and nameCount, but also needs to avoid synchronizing invocations of other objects' methods. (Invoking other objects' methods from synchronized code can create problems that are described in the section on Liveness.) Without synchronized statements, there would have to be a separate, unsynchronized method for the sole purpose of invoking nameList.add. 
 * 
*/