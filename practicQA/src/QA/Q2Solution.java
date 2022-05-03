/**
 * Question: Given array:
 * 				-int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 } ordered array.
 * 				Arrange even number first then odd numbers.
 * 				expected output - {2,4,6,8,10, 1,3,5,7,9}
 * 				1. element order does not matter
 * 				2. order matters
 */
package QA;

public class Q2Solution {
	/**
	 * step 1 : take new array of given array length step 2: itrrate the given
	 * array, if element is even then insert at the begning else insert from the end
	 * 
	 * @param arr
	 */
	public static int[] arrangeArray(int[] arr) {
		int[] newar = new int[arr.length];
		for (int i = 0, j = newar.length - 1, k = 0; i < newar.length; i++) {
			if (arr[i] % 2 == 0) {
				newar[k++] = arr[i];
			} else {
				newar[j--] = arr[i];
			}
		}
		return newar;
	}
	
	public static int[] arrangeArray1(int[] arr) {
		int[] newar = new int[arr.length];
		for (int i = 0, j = arr.length/2, k = 0; i < newar.length; i++) {
			if (arr[i] % 2 == 0) {
				newar[k++] = arr[i];
			} else {
				newar[j++] = arr[i];
			}
		}
		return newar;
	}
	
	

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10,11,12 };
		int[] result = arrangeArray1(arr);
		for (int a : result) {
			System.out.print(a + " ");
		}
	}
}
