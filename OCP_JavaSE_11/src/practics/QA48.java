package practics;

public enum QA48 {
A(100), B(75), C(50);
	int percent;
	private QA48(int percent) {
		this.percent=percent;
	}
	static void checkQuality(QA48 q) {
		switch(q) {
		case A:
			System.out.println("Best");
		break;
		default:
			System.out.println("Not best");
			break;
		}
	}
	public static void main(String[] args) {
		checkQuality(QA48.A);
	}
}
