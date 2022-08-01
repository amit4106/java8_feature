package practics2;

public class QA84 {
public static void main(String[] args) {
	String[] words= {"banana","orange","apple","lemon"};
	Integer[] numbers= {1,2,3,4,5};
	CustomeType type=new CustomeType();
	CustomeType<String> sType=new CustomeType<>();
	System.out.println(sType.count(words, "apple"));
	System.out.println(type.count(words, "apple"));
	System.out.println(type.count(numbers, 3));
}
}

class CustomeType<T>{
	public <T> int count(T[] anArray, T element) {
		int count =0;
		for(T e: anArray) {
			if(e.equals(element))
				count++;
		}
		return count;
	}
}
