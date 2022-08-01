package practics;

public class QA14 {
	public static void main(String[] args) {
		StringBuilder tx1 = new StringBuilder("PPQRRRSTT");
		int i = 0;
		a: while (i < tx1.length()) {
			char x = tx1.charAt(i);
			int j = 0;
			i++;
			b: while (j < tx1.length()) {
				char y = tx1.charAt(j);
				if (i != j && y == x) {
					tx1.deleteCharAt(j);
					break a;
				}
				j++;
			}
		}
		System.out.println(tx1);
	}
}

//	Ans: C
