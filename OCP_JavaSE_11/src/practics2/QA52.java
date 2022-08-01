
package practics2;

import static java.lang.annotation.ElementType.ANNOTATION_TYPE;
import static java.lang.annotation.ElementType.CONSTRUCTOR;
import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.LOCAL_VARIABLE;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.PACKAGE;
import static java.lang.annotation.ElementType.PARAMETER;
import static java.lang.annotation.ElementType.TYPE;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.function.Function;

@NonNull
public class QA52 {
	@NonNull
	QA52(){}
@NonNull	Integer i;
public static void main(String[] args) {
	@NonNull Integer  g;
	Long c = 23l;
	Long c1=Long.valueOf(23L);
//	Float g1 = Float.valueOf;
}
	public void m11(@NonNull String  s) {
	@NonNull	String s2;
		Function<String, String> func = (@NonNull var x) -> x.toUpperCase();
//		MyTest obj = new @NonNull MyTest();
//		var myString = (@NonNull String) s2;
//		var v = "Hello" + (@NonNull) "World";
	}
}

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(value = { TYPE, METHOD,CONSTRUCTOR,FIELD,PARAMETER,LOCAL_VARIABLE, PACKAGE,ANNOTATION_TYPE,  })
@interface NonNull {

//	String developer() default "Amit";
//	String developeDate() default "10/10/2010"
	
}
class MyTest{}
