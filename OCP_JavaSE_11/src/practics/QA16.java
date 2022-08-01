package practics;

import java.util.function.Consumer;

public class QA16 {
public static void main(String[] args) {
	Consumer<String> c1=arg->System.out.println(arg);
	c1.accept("c1 accepted");
	Consumer<String> c2=arg->System.out.println(arg);
	c1.accept("c2 accepted");
	c2.andThen(c1).accept("after then");
	c2.accept("c2 accepted again");
}
}
