package practics2;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface QA87 {
String author() default "";
String date();
String[] comments() default {};
}

//@QA87(date="1-1-2020")
class Hello{
	@QA87(date="1-1-2020", author = "AM", comments = {"world"}) 
	public void func() {}
}
