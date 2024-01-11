package com.rathod.oops;
// The Annotation Type
// The Annotated Class
@GreetsTheWorld("Hello , class!")
public class HelloWorld {

	@GreetsTheWorld("Hello, field!")
	public String greetingState;

	@GreetsTheWorld("Hello, constructor!")
	public HelloWorld() {
	}

	@GreetsTheWorld("Hello, method!")
	public void sayHi() {
	}

}