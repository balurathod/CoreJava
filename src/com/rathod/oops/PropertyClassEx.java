package com.rathod.oops;
import java.util.*;  
import java.io.*; 
public class PropertyClassEx {
	public static void main(String[] args)throws Exception{  
		
	    FileReader reader=new FileReader("D:/FCL/castfeed/userPass.properties");  
	  //Properties class to read properties file
	    Properties p=new Properties();  
	    p.load(reader);  
	      
	    System.out.println(p.getProperty("user"));  
	    System.out.println(p.getProperty("password"));	    
	   	    
	    //Properties class to create properties file
	    p.setProperty("name","Balu Rathod");  
	    p.setProperty("email","rathodbalu@gmail.com");  	      
	    p.store(new FileWriter("info.properties"),"Java Properties Example"); 
	    
	    
	    //Properties class to system all properties file
	    Properties p1=System.getProperties();  
	    Set set=p1.entrySet();  
	      
	    Iterator itr=set.iterator();  
	    while(itr.hasNext()){  
	    Map.Entry entry=(Map.Entry)itr.next();  
	    System.out.println(entry.getKey()+" = "+entry.getValue());  
	    }  
	
	}  
	}  

/*output
 * 
 * system  
oracle  
java.runtime.name = Java(TM) SE Runtime Environment
sun.boot.library.path = C:\Program Files\Java\jre6\bin
java.vm.version = 14.0-b16
java.vm.vendor = Sun Microsystems Inc.
java.vendor.url = http://java.sun.com/
path.separator = ;
java.vm.name = Java HotSpot(TM) Client VM
file.encoding.pkg = sun.io
sun.java.launcher = SUN_STANDARD
user.country = US
sun.os.patch.level = Service Pack 1
java.vm.specification.name = Java Virtual Machine Specification
user.dir = D:\FCL\castfeed
java.runtime.version = 1.6.0_14-b08
java.awt.graphicsenv = sun.awt.Win32GraphicsEnvironment
java.endorsed.dirs = C:\Program Files\Java\jre6\lib\endorsed
os.arch = x86
java.io.tmpdir = C:\Users\BALU~1.RAT\AppData\Local\Temp\
line.separator = 

java.vm.specification.vendor = Sun Microsystems Inc.
user.variant = 
os.name = Windows 7
sun.jnu.encoding = Cp1252
java.library.path = C:\Program Files\Java\jre6\bin;.;C:\Windows\Sun\Java\bin;C:\Windows\system32;C:\Windows;C:/Program Files/Java/jre6/bin/client;C:/Program Files/Java/jre6/bin;C:/Program Files/Java/jre6/lib/i386;C:\Program Files\CA\SC\CAWIN\;C:\Windows\system32;C:\Windows;C:\Windows\System32\Wbem;C:\Windows\System32\WindowsPowerShell\v1.0\;C:\PROGRA~1\CA\SC\CAM\bin;C:\Program Files\CA\SC\Csam\SockAdapter\bin;C:\Program Files\CA\DSM\bin;C:\Program Files\CA\SC\CBB\;D:\Program Files\TortoiseSVN Client 1.7.11\bin;C:\Program Files\TortoiseSVN\bin;C:\Users\balu.rathod\.vmwebclient\Java\bin;D:\Program Files\Apache-ant-1.8.1\apache-ant-1.8.1\bin;C:\Program Files\Java\jdk1.6.0_14\bin
java.specification.name = Java Platform API Specification
java.class.version = 50.0
sun.management.compiler = HotSpot Client Compiler
os.version = 6.1
user.home = C:\Users\balu.rathod
user.timezone = 
java.awt.printerjob = sun.awt.windows.WPrinterJob
file.encoding = Cp1252
java.specification.version = 1.6
java.class.path = D:\FCL\castfeed\bin
user.name = balu.rathod
java.vm.specification.version = 1.0
java.home = C:\Program Files\Java\jre6
sun.arch.data.model = 32
user.language = en
java.specification.vendor = Sun Microsystems Inc.
awt.toolkit = sun.awt.windows.WToolkit
java.vm.info = mixed mode
java.version = 1.6.0_14
java.ext.dirs = C:\Program Files\Java\jre6\lib\ext;C:\Windows\Sun\Java\lib\ext
sun.boot.class.path = C:\Program Files\Java\jre6\lib\resources.jar;C:\Program Files\Java\jre6\lib\rt.jar;C:\Program Files\Java\jre6\lib\sunrsasign.jar;C:\Program Files\Java\jre6\lib\jsse.jar;C:\Program Files\Java\jre6\lib\jce.jar;C:\Program Files\Java\jre6\lib\charsets.jar;C:\Program Files\Java\jre6\classes
java.vendor = Sun Microsystems Inc.
file.separator = \
java.vendor.url.bug = http://java.sun.com/cgi-bin/bugreport.cgi
sun.io.unicode.encoding = UnicodeLittle
sun.cpu.endian = little
sun.desktop = windows
sun.cpu.isalist = pentium_pro+mmx pentium_pro pentium+mmx pentium i486 i386 i86

 */
