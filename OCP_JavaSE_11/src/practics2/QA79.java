package practics2;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class QA79 {
	public static void main(String[] args) {
		List list=Arrays.asList("apple","orange","banana");
		Consumer<String> con=System.out::print;
		Consumer<String> out = con.andThen(x->System.out.println(":"+x.toUpperCase()));
		list.forEach(out);
		
		Runnable r=()->{System.out.println();};
	}
}
 
