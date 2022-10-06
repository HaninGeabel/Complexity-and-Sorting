package algorithms;

import java.util.Comparator;

/**
 * A util class for sorting a Comparable array using insertion sort algorithm.
 * 
 * This algorithm starts at the first element and starts to compare the current
 * element with the next element. If the first element is not in sort order compared
 * to the next element, then swap both elements. If a swap happened, then repeat the
 * last step with the previous element and the current element. This moves the largest
 * value to the front of the subarray. It repeats these steps until i is the index of the
 * last element, except the last element.
 * 
 * @author Debora Kwon
 *
 */
public class InsertionSort {
	
	/**
	 * Runs insertion sort algorithm in-place on an array
	 * @param arr A collection of Comparables
	 */
	public static <T extends Comparable<? super T>> void insertionSort (T[] arr) {
		
		// go through each element except the last element
		for(int i = 0; i < arr.length - 1; i++) {
			// set up another loop to track moving the compared element to the left
			for(int j = i; j >= 0; j--) {
				// sorting greatest to least
				// when arr[j] is less than arr[j + 1] -> negative number
				if(arr[j].compareTo(arr[j + 1]) < 0) {
					// if arr[j + 1] is greater than arr[j], then swap the elements
					T tempValue;
					tempValue = arr[j + 1];
					arr[j + 1] = arr[j];
					arr[j] = tempValue;
				
				} else {
					// otherwise, don't need to keep moving left
					break;
				}
			}
			
		}
	}
	
	/**
	 * Runs insertion sort algorithm in-place on an array
	 * @param arr A collection of Comparables
	 * @param c A Comparator to sort with
	 */
	public static <T extends Comparable<? super T>> void insertionSort (T[] arr,  Comparator<? super T> c) {
		
		// go through each element except the last element
		for(int i = 0; i < arr.length - 1; i++) {
			// set up another loop to track moving the compared element to the left
			for(int j = i; j >= 0; j--) {
				// sorting greatest to least
				// when arr[j] is less than arr[j + 1] -> negative number
				if(c.compare(arr[j], arr[j + 1]) < 0) {
					// if arr[j + 1] is greater than arr[j], then swap the elements
					T tempValue;
					tempValue = arr[j + 1];
					arr[j + 1] = arr[j];
					arr[j] = tempValue;
				
				} else {
					// otherwise, don't need to keep moving left
					break;
				}
			}
			
		}
	}
}

