package apiGeneric;

import java.util.List;

public class MethodLevelGeneric {

	public <T> void m1(T t) {
		
	}
	public <T> void filter(MyGeneric<? super T> predicate){
			
	}
	
	public <T, R> void m2(T t, R r) {
		
	}
}
