package practics2;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class QA73 {
public static void main(String[] args) {
	int[][] arr= {{5,10},{8,12},{9,3}};
	long count = Stream.of(arr).flatMapToInt(IntStream::of).map(n->n+1).filter(n->n%2==0).peek(System.out::print).count();
	System.out.println(count+" ");
}
}
