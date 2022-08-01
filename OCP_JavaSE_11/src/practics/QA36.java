package practics;

public class QA36 extends X {
public QA36(String name) {
	super();
	setName(name);
}
public static void main(String[] args) {
	QA36 t=new QA36("HH");
	System.out.println(t);
}
}

 class X{
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String toString() {
		return getName();
	}
}
