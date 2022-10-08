package algorithms;

import java.awt.Shape;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

import shapes.CompareArea;

/**
 * @author Hanin
 *Class Definition: Class that holds 2 methods of bubble sort ( comparable using compareTo method and comparator using compare method)
 */


public class BubbleSort {
	/**
	 * This is a bubble sort method that compare based on the height using compareTo
	 * it will compare adjacent items and it will swap the large value to the right O(n^2)
	 * @param <T>
	 * @param array
	 */
public static <T extends Comparable<? super T>> void  bubbleSort(T[] array) {//
// get the length of the passed array 
	int x = array.length;
	// base case
	if (x == 0 ) return ; 
	
	long start, stop;

	
	start = System.currentTimeMillis();


	//the outer loop for the number of iterations 
	for (int i = 0; i < x-1; i++) {
		// inner loop for compare each adjacent items
		for (int j = 0; j < x-1-i; j++) {// i is number of item that already sorted 
			

			int res =array[j].compareTo(array[j+1]) ;// call compareTo method to compare based on height and store it in res
				//if array[j] < arrray[j+1] => swap (descending order )
			if (res<0) {
				T temp = array[j];
				array[j] = array[j+1];
				array[j+1] = temp;
				
			}
	
		}
	}
	stop = System.currentTimeMillis();
	System.out.println("Time complexity of: " + (stop-start));

	}
/**
 * This is a bubble sort method that compare based on the class that pass as a parameter using compare
 * it will compare adjacent items and it will swap the large value to the right O(n^2)
 * @param <T>
 * @param array
 * @param c
 */

	public static <T> void  bubbleSort(T[] array, Comparator<? super T> c) {//
		// get the length of the passed array 
			int x = array.length;
			long start, stop;

			
			start = System.currentTimeMillis();
			//the outer loop for the number of iterations 
			for (int i = 0; i < x-1; i++) {
				// inner loop for compare each adjacent items
				for (int j = 0; j < x-1-i; j++) {
					
			
					
					int res =c.compare(array[j], array[j+1]) ;// call compareTo method to compare based on height and store it in res
					//if array[j] < arrray[j+1] => swap (descending order )
						
					if (res<0) {
						T temp = array[j];
						array[j] = array[j+1];
						array[j+1] = temp;
						
					}
					
				}
			}
			stop = System.currentTimeMillis();
			System.out.println("Time complexity of: " + (stop-start));

			}

}

