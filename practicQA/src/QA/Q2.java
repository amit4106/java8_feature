/**
 * Question: Find the Odd and Even number from the given int array -int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
 */

package QA;

public class Q2 {
	static int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

	public static void evenNumber() {
		System.out.print("Even numbers of int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 } is : ");
		for (int i = 0; i <= arr.length - 1; i++) {
			if (i % 2 == 1) {
				System.out.print(arr[i]+",");
			}
		}
		System.out.println();
	}

	public static void oddNumber() {
		System.out.print("Odd numbers of int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 } is : ");
		for (int i = 0; i < arr.length; i++) {
			if (i % 2 == 0) {
				System.out.print(arr[i]+",");
			}
		}
	}

	public static void main(String[] args) {

		evenNumber();
//		oddNumber();

	}
}
