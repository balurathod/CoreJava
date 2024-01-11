package com.rathod.java7;

public class Nio2Test {

}


/*
 * 
 * More new I/O APIs for the Java platform (NIO.2)
 
A new set of I/O APIs and features were introduced in Java 1.4 under the java.nio package. This addition was called the New I/O APIs, also known as NIO. Naming something New is always short-sighted because it will not remain new forever. When the next version comes along, what should the new version be called, the NEW NEW I/O? Java 1.7 offers a rich set of new features and I/O capabilities, called NIO.2 (New I/O version 2?). Here are the key highlights of NIO.2.
 
a) Package
 
The most important package to look for is java.nio.file. This package contains many practical file utilities, new file I/O related classes and interfaces.
 
b) The java.nio.file.Path interface
 
Path is probably the new class that developers will use most often. The file referred by the path does not need to exist. The file referred to does not need to exist. For all practical purposes, you can think of replacing java.io.File with java. io.Path.
 
Old Way

File file = new File(“hello.txt”);
System.out.println(“File exists() == ” + file.exists());
 
New Way

Path path = FileSystems.getDefault().getPath(“hello.txt”);
System.out.println(“Path exists() == ” + Files.exists(path));
 
c) The java.nio.file.Files class

The Files class offers over 50 utility methods for File related operations which many developers would have wanted to be a part of earlier Java releases. Here are some methods to give you a sense of the range of methods offered. • copy() – copy a file, with options like REPLACE_EXISTING, NOFOLLOW_LINKS public static Path copy(Path source, Path target, CopyOption… options);
 
• move() – move or rename a file public static Path move(Path source, Path target, CopyOption… options);
 
• newInputStream() – create input stream public static InputStream newInputStream(Path path, OpenOption… options);
 
• readAllBytes() – similar to the Apache IOUtils.readFile-ToByteArray public static byte[] readAllBytes(Path path) throws IOException;
 
• createSymbolicLink() – creates a symbolic link, if supported by the file system public static Path createSymbolicLink(Path link, Path target, FileAttribute<?>… attrs) throws IOException
 
 
d) WatchService API
 
WatchService API is a new feature introduced in Java 1.7. It provides an API that lets you “listen” to a certain type of file system events. Your code gets called automatically when those events occur. Examples of event types are captured by StandardWatchEventKinds class.
 
• ENTRY_CREATE:an entry is created or renamed in the directory
• ENTRY_DELETE:an entry is created or renamed out of the directory
• ENTRY_MODIFY:a directory entry is modified
 
Example

Here’s a full example of how to watch a directory and print any newly created files.

//the 'logs' directory
Path path = FileSystems.getDefault().getPath(“logs.txt”);
System.out.println(“Path exists() == ” + Files.exists(path));

//Create a Watch service from the file system 
WatchService watcher = FileSystem.getDefault().newWatchService();


//Tell me when new entry is created in the logs directry
 WatchKey wk = path.register(watcher,StandardWatchEventKind.ENTRY_CREATE);
 
 //now we wait to be callBack
 for(;;){
 	//take() blocks untill somethings hpns	
 	 * 
 	WatchKey key = watcher.take();
 	
 	
 	//see if this is what you were looking for
 	 if(key.equals(watchkey))
 		//process each event
 		for(WatcherEvent event : key.pollsEvents())
 			//simply print the path created
 			 s.o.p(path+": new file created "+event.context());
 		}
 	  }	
 //reset the key to continue receving events.
  key.reset();
 }
 	
 	
 	
 	
 	
 


Run the above program. Then create a file ‘new.txt’ in the directory ‘logs’. The program will print:
logs: new file created new.txt
 
Note about WatchService implementation
 
The implementation will take advantage of native support for file change notification when supported by the native file system, but will resort to polling otherwise.
 
IDE Support
 
Java 7 support is now available in NetBeans and IntelliJ. Eclipse does not support Java 7 yet. The upcoming release of Eclipse 3.7 will not have support for Java 7 either, but support will be added in 3.7 SR1, expected September 2011 (table 2).

 
Conclusion
 
Java 7 offers many small language enhancements and features. However, I did not find any feature as compelling as Regex enhancement in Java 1.4 or Generics, Auto-boxing or Enum enhancement in Java 1.5. I find the try-with-resources enhancement particularly useful and am looking forward to using it. I also look forward to using new features from the NIO.2 library. Overall, I am glad that something was released this year as opposed to releasing a monolith of changes next year.
 */