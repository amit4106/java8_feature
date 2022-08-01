package practics;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

public class QA06 {
@JsonField(type = JsonField.Type.STRING, name="name")
private String _name;
@JsonField(type = JsonField.Type.INT)
private int x;

@JsonField(type=JsonField.Type.INT)
private int y;
}

@Target(ElementType.FIELD)
@interface JsonField{
	String name() default "";
	enum Type{
		INT, STRING, BOOLEAN;
		
	};
	Type type();
}