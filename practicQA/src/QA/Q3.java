/**
 * Question: Find the second largest number from the given array - int []arr={20,50,70,10,5,25,90};.
 * 
 * Ans: Here, we are sorting the total elements of the given array using method Arrays.sort(arr); and passed
 * 		the object of int array which is arr. After that printing the value of sorted array using the method
 * 		"length" as array index, also need to keep in mind that the Array indexing starts from 0. So, here we
 * 		passed length -2 as array index for seconed higest value. 
 */

package QA;

import java.util.Arrays;

public class Q3 {
	public static void main(String[] args) {
		int[] arr = { 20, 50, 70, 10, 5, 25, 90 };
		Arrays.sort(arr);
		System.out.println(
				"Second highest value of int [] arr = { 20, 50, 70, 10, 5, 25, 90 } is - " + arr[arr.length - 2]);
	}
}
