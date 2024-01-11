package com.rathod.multiThreading;

public class MsLunch {
	    private long c1 = 0;
	    private long c2 = 0;
	    private Object lock1 = new Object();
	    private Object lock2 = new Object();

	    public void inc1() {
	        synchronized(lock1) {
	            c1++;
	        }
	    }

	    public void inc2() {
	        synchronized(lock2) {
	            c2++;
	        }
	    }
	}
/*
 * Synchronized statements are also useful for improving concurrency with fine-grained synchronization. Suppose, for example, class MsLunch has two instance fields, c1 and c2, that are never used together. All updates of these fields must be synchronized, but there's no reason to prevent an update of c1 from being interleaved with an update of c2 — and doing so reduces concurrency by creating unnecessary blocking. Instead of using synchronized methods or otherwise using the lock associated with this, we create two objects solely to provide locks. 
 * Use this idiom with extreme care. You must be absolutely sure that it really is safe to interleave access of the affected fields. 
 * 
 * */
 */