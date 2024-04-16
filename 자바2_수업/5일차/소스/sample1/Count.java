package day5.annotation.sample1;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

 @Retention( RetentionPolicy.RUNTIME)
public @interface Count {	
	 int value() default 1;   //     어노테이션객체.value()로 애너테이션의 값을 얻어 올 수 있다
}

