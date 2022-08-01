package practics;

import java.util.List;
import java.util.stream.IntStream;

public class QA50 {
	public static void main(String[] args) {
		final List<String> fruits=List.of("Orange","Apple","Lemmon","Raspberry");
		final List<String> types=List.of("Juice","Pie","Ice","Tart");
		final var stream=
		IntStream.range(0, Math.min(fruits.size(), types.size())).mapToObj((i)->fruits.get(i)+" "+ types.get(i));
		stream.forEach(System.out::println);
	}
}
