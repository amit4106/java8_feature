package practics;

public class QA20 extends ConSuper{
QA20(){
	this(4);
	System.out.println("1");
}
QA20(int a){
	System.out.println(a);
}
public static void main(String[] args) {
	new QA20(4);
}
}

class ConSuper{
	protected ConSuper() {
		this(2);
		System.out.println("3");
	}
	protected ConSuper(int a) {
		System.out.println(a);
	}
}
