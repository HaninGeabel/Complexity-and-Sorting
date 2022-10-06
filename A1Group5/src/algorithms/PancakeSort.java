package algorithms;

import java.util.Comparator;

/**
 * A util class for sorting a Comparable array using pancake sort algorithm.
 * 
 * This algorithm starts at the last element and finds the minIndex that has
 * the min value in the subarray arr[0..minIndex] and then flips each element
 * from arr[0..i] to move the smallest value to the end of the subarray.
 * It repeats these steps until i is 0, except 0.
 * 
 * @author Debora Kwon
 *
 */
public class PancakeSort {
	
	/**
	 * Runs pancake sort algorithm in-place on an array
	 * @param arr A collection of Comparables
	 */
	public static <T extends Comparable<? super T>> void pancakeSort (T[] arr) {
		
		// go through each element starting from the last element, except the first element
		for(int i = arr.length - 1; i > 0; i--) {
			int minIndex = i;
			for(int j = i - 1; j >= 0; j--) {
				// check if there's a smaller value, so the result is always negative number
				if(arr[j].compareTo(arr[minIndex]) < 0) {
					// look for a min index for this algorithm
					minIndex = j;
				}
			}
			// check if i is the smallest value, then continue to the next index
			if(i == minIndex) {
				continue;
			}
				
			// next step is flipping values from "index = 0" to "minIndex"
			for(int k = 0; k < minIndex; k++, minIndex--) {
				// swap each value
				T tempValue;
				tempValue = arr[minIndex];
				arr[minIndex] = arr[k];
				arr[k] = tempValue;
			}
			// last step is flipping values from "index = 0" to "i"
			for(int n = 0, lastIndex = i; n < lastIndex; n++, lastIndex--) {
				// swap each value
				T tempValue;
				tempValue = arr[lastIndex];
				arr[lastIndex] = arr[n];
				arr[n] = tempValue;
			}
		}
	}
	
	
	
	/**
	 * Runs pancake sort algorithm in-place on an array
	 * @param arr A collection of Comparables
	 * @param c A Comparator to sort with
	 */
	public static <T extends Comparable<? super T>> void pancakeSort (T[] arr, Comparator<? super T> c) {
		
		// go through each element starting from the last element, except the first element
		for(int i = arr.length - 1; i > 0; i--) {
			int minIndex = i;
			for(int j = i - 1; j >= 0; j--) {
				// check if there's a smaller value, so the result is always negative number
				if(c.compare(arr[j], arr[minIndex]) < 0) {
					// look for a min index for this algorithm
					minIndex = j;
				}
			}
			// check if i is the smallest value, then continue to the next index
			if(i == minIndex) {
				continue;
			}
				
			// next step is flipping values from "index = 0" to "minIndex"
			for(int k = 0; k < minIndex; k++, minIndex--) {
				// swap each value
				T tempValue;
				tempValue = arr[minIndex];
				arr[minIndex] = arr[k];
				arr[k] = tempValue;
			}
			// last step is flipping values from "index = 0" to "i"
			for(int n = 0, lastIndex = i; n < lastIndex; n++, lastIndex--) {
				// swap each value
				T tempValue;
				tempValue = arr[lastIndex];
				arr[lastIndex] = arr[n];
				arr[n] = tempValue;
			}
		}
	}
}