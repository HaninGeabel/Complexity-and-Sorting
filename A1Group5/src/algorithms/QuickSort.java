package algorithms;

import java.util.Comparator;

/**
 * A util class for sorting a Comparable array using Quicksort algorithm.
 * 
 * This algorithm divides the problem into smaller problems until each small problem
 * is too small to divide further. It does this by partitioning subarrays to
 * move the pivot element to the right position. All elements to the left of the pivot
 * should be greater than the elements to the right of the pivot. Then repeating the 
 * partitioning on the subarrays to the left and right side of the pivot element.
 * 
 * @author Debora Kwon
 *
 */
public class QuickSort {
	
	/**
	 * Runs Quicksort sort algorithm in-place on an array
	 * @param arr A collection of Comparables
	 */
	public static <T extends Comparable<? super T>> void quicksort(T[] arr) {
		quicksort(arr, 0, arr.length - 1);
	}

	/**
	 * Runs Quicksort sort algorithm in-place on a subarray of arr
	 * If the size of the subarray is greater than 1, then partition the subarray
	 * and recursively call quicksort on the left and right sides of the partition.
	 * @param arr A collection of Comparables
	 * @param low the start of the subarray
	 * @param high the end of the subarray
	 */
	public static <T extends Comparable<? super T>> void quicksort(T[] arr, int low, int high) {
		if(low < high) {
			int index = partition(arr, low, high);
			quicksort(arr, low, index - 1);
			quicksort(arr, index + 1, high);
		}
	}
	
	/**
	 * Picks the last element in the subarray as the pivot value and swaps elements
	 * until the sorted position is found for the pivot value.
	 * @param arr A collection of Comparables
	 * @param low the start of the subarray
	 * @param high the end of the subarray
	 * @return the index of the pivot that is in sorted order
	 */
	public static <T extends Comparable<? super T>> int partition(T[] arr, int low, int high) {
		T pivot = arr[high];
		int i = low;
		for(int j = low; j < high; j++) {
			if(arr[j].compareTo(pivot) > 0) {
				T tempValue = arr[j];
				arr[j] = arr[i];
				arr[i] = tempValue;
				i++;
			}
		}
		T tempValue = arr[i];
		arr[i] = arr[high];
		arr[high] = tempValue;
		return i;
	}
	
	
	
	/**
	 * Runs Quicksort sort algorithm in-place on an array
	 * @param arr A collection of Comparables
	 * @param c A Comparator to sort with
	 */
	public static <T extends Comparable<? super T>> void quicksort(T[] arr, Comparator<? super T> c) {
		quicksort(arr, 0, arr.length - 1, c);
	}


	/**
	 * Runs Quicksort sort algorithm in-place on a subarray of arr
	 * If the size of the subarray is greater than 1, then partition the subarray
	 * and recursively call quicksort on the left and right sides of the partition.
	 * @param arr A collection of Comparables
	 * @param low the start of the subarray
	 * @param high the end of the subarray
	 * @param c A Comparator to sort with
	 */
	public static <T extends Comparable<? super T>> void quicksort(T[] arr, int low, int high, Comparator<? super T> c) {
		if(low < high) {
			int index = partition(arr, low, high, c);
			quicksort(arr, low, index - 1, c);
			quicksort(arr, index + 1, high, c);
		}
	}
	
	/**
	 * Picks the last element in the subarray as the pivot value and swaps elements
	 * until the sorted position is found for the pivot value.
	 * @param arr A collection of Comparables
	 * @param low the start of the subarray
	 * @param high the end of the subarray
	 * @param c A Comparator to sort with
	 * @return the index of the pivot that is in sorted order
	 */
	public static <T extends Comparable<? super T>> int partition(T[] arr, int low, int high, Comparator<? super T> c) {
		T pivot = arr[high];
		int i = low;
		for(int j = low; j < high; j++) {
			if(c.compare(arr[j], pivot) > 0) {
				T tempValue = arr[j];
				arr[j] = arr[i];
				arr[i] = tempValue;
				i++;
			}
		}
		T tempValue = arr[i];
		arr[i] = arr[high];
		arr[high] = tempValue;
		return i;
	}
}


