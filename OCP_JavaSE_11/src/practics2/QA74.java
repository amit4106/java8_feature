package practics2;

import java.util.function.Consumer;

public class QA74 {
public static void main(String[] args) {
	Consumer con=System.out::print;
	con.accept("hello lambda	");
}
}
