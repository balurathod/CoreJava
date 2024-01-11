package com.rathod.java6;

public class PluggableAnnotation {

}
/*
 * Pluggable Annotation Processing API

2.1) Introduction to Annotation

Annotations have been there in the Java World from Java 5.0. Java Annotations are a result of the JSR 175 which aimed in providing a Meta-Data Facility to the Java Programming Language. It can be greatly used by the Build-time Tools and Run-time Environments to do a bunch of useful tasks like Code Generation, Validation and other valuable stuffs. Java 6 has introduced a new JSR called JSR 269, which is the Pluggable Annotation Processing API. With this API, now it is possible for the Application Developers to write a Customized Annotation Processor which can be plugged-in to the code to operate on the set of Annotations that appear in a Source File.
Let us see in the subsequent sections how to write a Java File which will make use of Custom Annotations along with a Custom Annotation Processor to process them.

2.2) Writing Custom Annotations

This section provides two Custom Annotations which will be used by a Sample Java File and a Custom Annotation Processor. One is the Class Level Annotation and the other is the Method Level Annotation. Following is the listing for both the Annotation Declarations. See how the Targets for the Annotations ClassLevelAnnotation.java and MethodLevelAnnotation.java are set to ElementType.TYPE and ElementType.METHOD respectively.
ClassLevelAnnotation.java

1
package net.javabeat.articles.java6.newfeatures.customannotations;
2
 
3
import java.lang.annotation.*;
4
 
5
@Target(value = {ElementType.TYPE})
6
public @interface ClassLevelAnnotation {
7
}
MethodLevelAnnotation.java

1
package net.javabeat.articles.java6.newfeatures.customannotations;
2
 
3
import java.lang.annotation.*;
4
 
5
@Target(value = {ElementType.METHOD})
6
public @interface MethodLevelAnnotation {
7
}
AnnotatedJavaFile.java

1
package net.javabeat.articles.java6.newfeatures.customannotations;
2
 
3
@ClassLevelAnnotation()
4
public class AnnotatedJavaFile {
5
 
6
    @MethodLevelAnnotation
7
    public void annotatedMethod(){
8
    }
9
}
The above is a Sample Java File that makes use of the Class Level and the Method Level Annotations. Note that @ClassLevelAnnotation is applied at the Class Level and the @MethodLevelAnnotation is applied at the method Level. This is because both the Annotation Types have been defined to be tagged to these respective Elements only with the help of @Target Annotation.

2.3) Writing a Simple Custom Annotation Processor

TestAnnotationProcessor.java

1
package net.javabeat.articles.java6.newfeatures.customannotations;
2
 
3
import java.util.*;
4
import javax.annotation.processing.*;
5
import javax.lang.model.*;
6
import javax.lang.model.element.*;
7
 
8
@SupportedAnnotationTypes(value= {"*"})
9
@SupportedSourceVersion(SourceVersion.RELEASE_6)
10
 
11
public class TestAnnotationProcessor extends AbstractProcessor  {
12
 
13
    @Override
14
    public boolean process(
15
        Set<?> extends TypeElement> annotations, RoundEnvironment roundEnv){
16
 
17
        for (TypeElement element : annotations){
18
            System.out.println(element.getQualifiedName());
19
        }
20
        return true;
21
    }
22
}
Let us discuss the core points in writing a Custom Annotation Processor in Java 6. The first notable thing is that Test Annotation Processor class extends AbstractProcessor class which encapsulates an Abstract Annotation Processor. We have to inform what Annotation Types our Test Annotation Processor Supports. This is manifested through the Class-Level Annotation called @SupportedAnnotationTypes(). A value of “*” indicates that all types of Annotations will be processed by this Annotation Processor. Which version of Source Files this Annotation Processor supports is mentioned through @SupportedSourceVersion Annotation.
The javac compiler of Mustang has an option called ‘-processor’ where we can specify the Name of the Annotation Processor along with a Set of Java Source Files containing the Annotations. For example, in our case, the command syntax would be something like the following,

1
javac -processor
2
    net.javabeat.articles.java6.newfeatures.customannotations.TestAnnotationProcessor
3
        AnnotatedJavaFile.java
The above command tells that the name of the Annotation Processor is net.javabeat.articles.java6.newfeatures.customannotations.TestAnnotationProcessor and it is going to process the AnnotatedJavaFile.java. As soon as this command is issued in the console, the TestAnnotationProcessor.process() method will be called by passing the Set of Annotations that are found in the Source Files along with the Annotation Processing Information as represented by RoundEnvironment. This TestAnnotationProcessor just list the various Annotations present in the Sample Java File (AnnotatedJavaFile.java) by iterating over it.
Following is the output of the above program

1
net.javabeat.articles.java6.newfeatures.customannotations.ClassLevelAnnotation
2
net.javabeat.articles.java6.newfeatures.customannotations.MethodLevelAnnotation
3) Streaming API for XML
3.1) Introduction

Streaming API for XML, simply called StaX, is an API for reading and writing XML Documents. Why need another XML Parsing API when we already have SAX (Simple API for XML Parsing) and DOM (Document Object Model)? Both SAX and DOM parsers have their own advantages and disadvantages and StaX provides a solution for the disadvantages that are found in both SAX and DOM. It is not that StaX replaces SAX and DOM.
SAX, which provides an Event-Driven XML Processing, follows the Push-Parsing Model. What this model means is that in SAX, Applications will register Listeners in the form of Handlers to the Parser and will get notified through Call-back methods. Here the SAX Parser takes the control over Application thread by Pushing Events to the Application. So SAX is a Push-Parsing model. Whereas StaX is a Pull-Parsing model meaning that Application can take the control over parsing the XML Documents by pulling (taking) the Events from the Parser.
The disadvantage of DOM Parser is, it will keep the whole XML Document Tree in memory and certainly this would be problematic if the size of the Document is large. StaX doesn’t follow this type of model and it also has options for Skipping a Portion of a large Document during Reading.
The core StaX API falls into two categories and they are listed below. They are

1 Cursor API
Event Iterator API
Applications can any of these two API for parsing XML Documents. Let us see what these APIs’ are in detail in the following sections.

3.2) Cursor API

The Cursor API is used to traverse over the XML Document. Think of a Cursor as some kind of Pointer pointing at the start of the XML Document and then Forwarding the Document upon properly instructed. The working model of this Cursor API is very simple. When given a XML Document and asked to parse, the Parser will start reading the XML Document, and if any of the Nodes (like Start Element, Attribute, Text, End Element) are found it will stop and will give information about the Nodes to the Processing Application if requested. This cursor is a Forward only Cursor, it can never go backwards. Both Reading and Writing operations is possible in this cursor API.

3.3) Sample Application

Let us consider a sample Application which will read data from and to the XML Document with the help of the Cursor API. Following is the sample XML Document. The below XML File contains a list of Events for a person in his/her Calendar.
myCalendar.xml

1
<calendar>
2
 
3
    <event type = "meeting">
4
        <whom>With my Manager</whom>
5
        <where>At the Conference Hall</where>
6
        <date>June 09 2007</date>
7
        <time>10.30AM</time>
8
    </event>
9
 
10
    <event type = "birthday">
11
        <whom>For my Girl Friend</whom>
12
        <date>01 December</date>
13
    </event>
14
 
15
</calendar>
ReadingUsingCursorApi.java

1
package net.javabeat.articles.java6.newfeatures.stax;
2
 
3
import java.io.*;
4
import javax.xml.stream.*;
5
import javax.xml.stream.events.*;
6
 
7
public class ReadingUsingCurorApi {
8
 
9
    private XMLInputFactory inputFactory = null;
10
    private XMLStreamReader xmlReader = null;
11
 
12
    public ReadingUsingCurorApi() {
13
        inputFactory = XMLInputFactory.newInstance();
14
    }
15
 
16
    public void read() throws Exception{
17
 
18
        xmlReader = inputFactory.createXMLStreamReader(
19
            new FileReader(".\\src\\myCalendar.xml"));
20
 
21
        while (xmlReader.hasNext()){
22
 
23
            Integer eventType = xmlReader.next();
24
            if (eventType.equals(XMLEvent.START_ELEMENT)){
25
                System.out.print(" " + xmlReader.getName() + " ");
26
            }else if (eventType.equals(XMLEvent.CHARACTERS)){
27
                System.out.print(" " + xmlReader.getText() + " ");
28
            }else if (eventType.equals(XMLEvent.ATTRIBUTE)){
29
                System.out.print(" " + xmlReader.getName() + " ");
30
            }else if (eventType.equals(XMLEvent.END_ELEMENT)){
31
                System.out.print(" " + xmlReader.getName() + " ");
32
            }
33
        }
34
        xmlReader.close();
35
    }
36
 
37
    public static void main(String args[]){
38
        try{
39
            ReadingUsingCurorApi obj = new ReadingUsingCurorApi();
40
            obj.read();
41
        }catch(Exception exception){
42
            exception.printStackTrace();
43
        }
44
    }
45
}
XMLInputFactory is the Factory Class for creating Input Stream objects which is represented by XMLStreamReader. An instance of type XMLStreamReader is created by calling XMLInputFactory.createXMLStreamReader() by passing the XML File to be parsed. At this stage, the Parser is ready to read the XML Contents if a combination call to XMLStreamReader.hasNext() and XMLStreamReader.next() is made. The entire Document is traversed in the while loop and the appropriate node’s value is taken by checking the various Element Types.

3.4) Event Iterator API

The Working Model of this Event Iterator API is no more different from the Cursor API. As the Parser starts traversing over the XML Document and if any of the Nodes are found, it will provide this information to the Application that is processing in the form of XML Events. Applications can loop over the entire Document, by requesting for the Next Event. This Event Iterator API is implemented on top of Cursor API.

3.5) Sample Application

Now let us take over a Sample Application using the Event Iterator API which is parsing on the XML Document myCalendar.xml.
ReadingUsingEventIterator.java

1
package net.javabeat.articles.java6.newfeatures.stax;
2
 
3
import java.io.*;
4
import javax.xml.stream.*;
5
import javax.xml.stream.events.*;
6
 
7
public class ReadingUsingEventIteratorApi {
8
 
9
    private XMLInputFactory inputFactory = null;
10
    private XMLEventReader xmlEventReader = null;
11
 
12
    public ReadingUsingEventIteratorApi() {
13
        inputFactory = XMLInputFactory.newInstance();
14
    }
15
 
16
    public void read() throws Exception{
17
 
18
        xmlEventReader = inputFactory.createXMLEventReader(
19
            new FileReader(".\\src\\myCalendar.xml"));
20
 
21
        while (xmlEventReader.hasNext()){
22
 
23
            XMLEvent xmlEvent = xmlEventReader.nextEvent();
24
            if (xmlEvent.isStartElement()){
25
                System.out.print(" " + xmlEvent.asStartElement().getName() + " ");
26
            }else if (xmlEvent.isCharacters()){
27
                System.out.print(" " + xmlEvent.asCharacters().getData() + " ");
28
            }else if (xmlEvent.isEndElement()){
29
                System.out.print(" " + xmlEvent.asEndElement().getName() + " ");
30
            }
31
        }
32
 
33
        xmlEventReader.close();
34
    }
35
 
36
    public static void main(String args[]){
37
        try{
38
            ReadingUsingEventIteratorApi obj = new ReadingUsingEventIteratorApi();
39
            obj.read();
40
        }catch(Exception exception){
41
            exception.printStackTrace();
42
        }
43
    }
44
}
If XMLStreamReader class represents the Reader for stream reading the XML Contents, then XMLEventReader represents the class for reading the XML Document as XML Events (represented by javax.xml.stream.events.XMLEvent). The rest of the reading logic is the same as that of the ReadingUsingCurorApi.java.

4) Conclusion

This article covered the leftover features of the Part I New features of Java 6. Starting with Pluggable Annotation Processing API, it covered what Annotations are, then guided us how to write Custom Annotations and Custom Annotation Processor. Then it traversed over the Cursor API and the Event Iterator API of StaX such as how to read XML Documents along with well-defined samples. Finally through Java API for XML Binding, it details how to map Java and XML Documents with some sample applications.
 */