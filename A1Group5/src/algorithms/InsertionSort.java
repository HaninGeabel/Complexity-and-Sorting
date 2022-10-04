package algorithms;

/**
 * A util class for sorting a Comparable array using insertion sort algorithm.
 * @author Debora Kwon
 *
 */
public class InsertionSort {
	
	/**
	 * Runs insertion sort algorithm in-place on an array
	 * @param arr A collection of Comparables
	 * @return The same array that was sorted
	 */
	public <T extends Comparable<? super T>> T[] insertionSort (T[] arr) {
		
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
		return arr;
	}
}
