package practics2;

import java.util.ArrayList;
import java.util.List;
import java.util.function.UnaryOperator;

public class QA94 {
public static void main(String[] args) {
//	Function function = String::toUpperCase;
	UnaryOperator<String> function = String::toUpperCase;
	List<String> list=new ArrayList<>(List.of("apple","orange","banana"));
	list.replaceAll(function);
}
}
