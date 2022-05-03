/**
 * Question: Find the second largest number from the given array - int []arr={20,50,70,10,5,25,90};
 */

package QA;

public class Q3Solution {
/**
 * 
 * @param ar
 */
	public static void printSeconedLargest(int[] ar) {
	int max=ar[0];
	for(int i=0; i<ar.length; i++ ) {
		if(ar[i]> max) {
			max=ar[i];
		}
	}
	System.out.println(max);
	
	int secondLargest=ar[0];
	for(int i=0; i<ar.length; i++ ) {
		if(ar[i]> secondLargest && (ar[i] < max)) {
			secondLargest=ar[i];
		}
	}
	System.out.println(secondLargest);

}
	public static void printSeconedLargest2(int[] ar) {
		int max=ar[0];
		int secondLargest=ar[0];
		for(int i=0; i<ar.length; i++ ) {
			if(ar[i]> max) {
				secondLargest=max;
				max=ar[i];
			}else if(ar[i]> secondLargest && (ar[i] < max)) {
				secondLargest=ar[i];
			}
		}
		System.out.println(secondLargest);
	}
	public static void main(String[] args) {
		int []arr={20,50,70,10,5,25,90};
		printSeconedLargest2(arr);
	}
}
