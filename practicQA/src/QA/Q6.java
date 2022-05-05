/**
 * Question:	Reverse the given array -
 * 				Given array -int [] array ={20, 5, 70, 50, 10, 90};
 * 				Output: {90, 10, 50, 70, 5, 20}
 */

package QA;

public class Q6 {
	public static void reverseArray() {
		int[] arr = { 20, 5, 70, 50, 10, 90 };
		System.out.println("The given array is : " );
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println("Reversed array :");
		for(int i=arr.length-1;i>=0;i--) {
			System.out.println(arr[i]);
		}
	}

	public static void main(String[] args) {
		reverseArray();
	}
}
