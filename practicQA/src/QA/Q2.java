package QA;

public class Q2 {
	static int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

	public static void evenNumber() {
		for(int i =0; i<=arr.length-1;i++) {
			if(i % 2 ==1) {
				System.out.println(arr[i]);
			}
		}
	}
	public static void oddNumber() {
		for(int i =0; i<=arr.length-1;i++) {
			if(i % 2 ==0) {
				System.out.println(arr[i]);
			}
		}
	}

	public static void main(String[] args) {
		
		evenNumber();
		oddNumber();

	}
}

