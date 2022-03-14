package annotation;

public class CustomeAnnotation {
	
	public static void main(String[] args) {

	}
}

/**
 * Marker Annotation		:
 * Single Value Annotaion 	:
 * Multi Value Annotation	:
 *
 */

@interface Smartphone{
	String os() default "Symbian";
	int version() default 1;
}

@Smartphone(os="Symbian", version=6)
class NokiaASeries{
	
}