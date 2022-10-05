package algorithms;

import java.util.Comparator;

/**
 * Class Definition:Class that holds 4 methods that have recursive mergSort (
 * comparable using compareTo method and comparator using compare method)
 * 
 * @author Hanin
 *
 */
public class MergSort {

//		public static void main (String [] args) {
//			String  array [] = {"a","z","b","z","c", "d"};
//			mergSort(array, 0 , 5); 
//			for (String s:array) {
//				System.out.println(s);
//			}
//		}
	/**
	 * This recursive method to divided the array and then will call the merge
	 * method to merge 2 sorted arrayes that implement comparable
	 * 
	 * @param <T>
	 * @param arr
	 * @param firstIndex
	 * @param lastIndex
	 */
	public static <T extends Comparable<? super T>> void mergSort(T[] arr, int firstIndex, int lastIndex) {
		// base case
		if (firstIndex == lastIndex)
			return;

		if (firstIndex < lastIndex)// check if the array has more than one element
		{
			// find the middle point
			int mid = (firstIndex + lastIndex) / 2;

			mergSort(arr, firstIndex, mid); // sort left half
			mergSort(arr, mid + 1, lastIndex); // sort right half

			// call the merg method to the sorted halves
			merg(arr, firstIndex, mid, lastIndex);
		}
	}

	/**
	 * This method used to sort the array
	 * 
	 * @param <T>
	 * @param arr
	 * @param firstIndex
	 * @param middle
	 * @param lastIndex
	 */
	static <T extends Comparable<? super T>> void merg(T[] arr, int firstIndex, int middle, int lastIndex) {

		// create temp array of the same type to store the left part of the array (size
		// of the first half)
		T[] leftArray = (T[]) new Comparable[middle - firstIndex + 1];
		// create temp array of the same type to store the right part of the array(size
		// of second half)
		T[] rightArray = (T[]) new Comparable[lastIndex - middle];

		// fill in left array to leftArray
		for (int i = 0; i < leftArray.length; ++i)
			leftArray[i] = arr[firstIndex + i];

		// fill in right array to rightArray
		for (int i = 0; i < rightArray.length; ++i)
			rightArray[i] = arr[middle + 1 + i];

		// Merge the temp arrays

		// pointers indexes of first and second tem arrays
		int leftIndex = 0, rightIndex = 0;

		// pointer to track the index that will fill in the main array
		int currentIndex = firstIndex;

		// compare each index of the sub arrays adding the highest value to the
		// currentIndex //
		// while we don't each the end of the arrays
		while (leftIndex < leftArray.length && rightIndex < rightArray.length) {
			if (leftArray[leftIndex].compareTo(rightArray[rightIndex]) >= 0)// call the compareTo function based on
																			// height if left > right
			// the left should be stored first in the main array
			{
				arr[currentIndex] = leftArray[leftIndex];
				leftIndex++;// update the pointer in the left array
			} else {// if right > left
				// the right should be stored first in the main array
				arr[currentIndex] = rightArray[rightIndex];
				rightIndex++;// update the pointer in the right array
			}
			currentIndex++;// update the pointer in the main array
		}

		// if the right array done => copy all the left array to the main array if any
		while (leftIndex < leftArray.length)
			arr[currentIndex++] = leftArray[leftIndex++];

		// if the left array done => copy all the right array to the main array if any
		while (rightIndex < rightArray.length)
			arr[currentIndex++] = rightArray[rightIndex++];
	}

	/**
	 * This recursive method to divided the array and then will call the merge
	 * method to merge 2 sorted arrays that implement comparator
	 * 
	 * @param <T>
	 * @param arr
	 * @param firstIndex
	 * @param lastIndex
	 * @param c
	 */

	public static <T extends Comparator<? super T>> void mergSort(T[] arr, int firstIndex, int lastIndex,
			Comparator<? super T> c) {
		// base case
		if (firstIndex == lastIndex)
			return;

		if (firstIndex < lastIndex) {// check if the array has more than one element

			// find the middle point
			int middle = (firstIndex + lastIndex) / 2;

			mergSort(arr, firstIndex, middle, c); // sort left half
			mergSort(arr, middle + 1, lastIndex, c); // sort right half

			// call the merg method to the sorted halves
			merg(arr, firstIndex, middle, lastIndex, c);
		}
	}

	static <T extends Comparator<? super T>> void merg(T[] arr, int firstIndex, int middle, int lastIndex,
			Comparator<? super T> c)

	{
		// create temp array of the same type to store the left part of the array (size
				// of the first half)
		T[] leftArray = (T[]) new Comparator[middle - firstIndex + 1];
		// create temp array of the same type to store the right part of the array(size
				// of second half)
		T[] rightArray = (T[]) new Comparator[lastIndex - middle];

		// fill in left array to leftArray
		for (int i = 0; i < leftArray.length; ++i)
			leftArray[i] = arr[firstIndex + i];

		// fill in right array to rightArray
		for (int i = 0; i < rightArray.length; ++i)
			rightArray[i] = arr[middle + 1 + i];

		// Merge the temp arrays

		// pointers indexes of first and second tem arrays
		int leftIndex = 0, rightIndex = 0;

		// pointer to track the index that will fill in the main array
		int currentIndex = firstIndex;

		// compare each index of the sub arrays adding the highest value to the
				// currentIndex 
				// while we don't each the end of the arrays
		while (leftIndex < leftArray.length && rightIndex < rightArray.length) {// call the compare function based on
			// height if left > right
			// the left should be stored first in the main array
			
			// the left should be stored first in the main array
			if (c.compare(leftArray[leftIndex], rightArray[rightIndex]) <= 0) {
				arr[currentIndex] = leftArray[leftIndex];
				leftIndex++;// update the pointer in the left array 
			} else {//if right > left
				// the right should be stored first in the main array
				arr[currentIndex] = rightArray[rightIndex];
				rightIndex++;// update the pointer in the right array
			}
			currentIndex++;// update the pointer in the main array 
		}

		// if the right array done => copy all the left array to the main array if any  
		while (leftIndex < leftArray.length) {
			arr[currentIndex++] = leftArray[leftIndex++];
		}

		// if the left array done => copy all the right array to the main array if any  
		while (rightIndex < rightArray.length) {
			arr[currentIndex++] = rightArray[rightIndex++];
		}
	}
}
