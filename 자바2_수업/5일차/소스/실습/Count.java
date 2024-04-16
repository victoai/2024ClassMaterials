package day5.annotation.실습;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

//
@Retention ( RetentionPolicy.RUNTIME)
public @interface Count {
	 int count() ;   // int value()  default;   //생략할 수 있다.
}
