package practics;

public class QA26 extends GameObject {
	public Object[] move(Number x, Number y) {
		System.out.println("Move Character");
		return super.move(x.intValue(), y.intValue());
	}
	public static void main(String[] args) {
		var character=new QA26();
		character.move(10.0, 10.0);
		character.move(10, 10);
	}
}

class GameObject {
	public Object[] move(int x, int y) {
		System.out.println("Move GameObject");
		return new Integer[] { x + 10, y + 10 };
	}
}
