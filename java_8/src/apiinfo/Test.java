package apiinfo;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Test {

	public static void main(String[] args) throws ClassNotFoundException {
Class<?> forName = Class.forName("java.time.LocalTime");
Method[] methods = forName.getMethods();
Arrays.stream(methods).map(m->m.getName()).distinct().collect(Collectors.toList()).forEach(s->System.out.println(s));
	}

}
