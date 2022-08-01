package practics;

public enum QA45 {
	ALPHA(100), BETA(200), GAMMA(300);

	int v;
	 QA45(int v) {
		this.v=v;
	}
	 public String toString() {
		 return "200";
	 }
	 public static void main(String[] args) {
		System.out.println(QA45.values()[1]);
	}
}
