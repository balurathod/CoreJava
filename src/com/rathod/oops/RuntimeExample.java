package com.rathod.oops;

import java.io.IOException;

public class RuntimeExample {
public static void main(String[] args) throws Exception {
	Runtime runtime=Runtime.getRuntime();
	System.out.println(runtime.availableProcessors());
	System.out.println(runtime.totalMemory());
	System.out.println(runtime.maxMemory());
	System.out.println(runtime.maxMemory()-runtime.totalMemory());
	runtime.exec("notepad");
	
	runtime.exec("calc");
}
}
