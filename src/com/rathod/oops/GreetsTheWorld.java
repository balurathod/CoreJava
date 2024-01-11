package com.rathod.oops;
import java.lang.annotation.Retention;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Retention(RUNTIME)
public @interface GreetsTheWorld {
	public String value();
}

