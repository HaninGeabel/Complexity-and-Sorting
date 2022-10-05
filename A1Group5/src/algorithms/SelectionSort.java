package algorithms;

import java.util.Comparator;

/**Class Definition: Selection class contain 2 methods of selection sorts (first extends comparaple to call the compareTo methods and the second 
 * method implements comparator interface to call compare function   
 * @author Hanin
 *
 */
public class SelectionSort {
	/**
	 * SelectionSort that extends comparable interface to compare based on the height using compareTo
	 * it will select the largest item and it will move it to the first element of the array O(n^2)
	 * @param <T>
	 * @param array
	 */
	
	public static <T extends Comparable<? super T>> void  SelectionSort(T[] array) {
	
		// get the length of the array and store it in to x 
		int x = array.length;
		// base case 
		if (x == 1 ) return ; 
		
		
		// outer for loop for the number of iterations 
		for (int i = 0; i < x ; i++) {
			// select the large item in the array 
			 T larg = array[i]; 
			 // save the index of the large element into largIndex
			 int largIndex = i; 
			 // inner for loop to find the largest element of the array 
			 for (int j = i ; j <x ; j++) {
				 int res =larg.compareTo(array[j]) ;// call compare method 
				 //if large <array [j] 
				 if (res < 0) {
					 larg = array[j]; // set the large = array [j] 
					 largIndex = j; /// get the index of it 
				 }
			 }
			 
			 int res2 = larg.compareTo(array[i]);// if the large > the element " which is the pointer that we need to check first" 
			 if (res2>0) {
				 //swap
				 T temp = array[i]; 
				 array[i] = array[largIndex];
				 array[largIndex] = temp;
			 }
		
		}
	}
	
	/**
	 * SelectionSort that extends comparator interface to compare based on the either volume area using compare method
	 * it will select the largest item and it will move it to the first element of the array O(n^2)
	 * @param <T>
	 * @param array
	 * @param c
	 */
	public static <T> void  SelectionSort(T[] array, Comparator<? super T> c) {
		// get the length of the array and store it in to x 
		int x = array.length;
		// base case 
				if (x == 1 ) return ; 
		// outer for loop for the number of iterations 
		for (int i = 0;i <x ; i++) {
			// select the large item in the array 
			 T large = array[i]; 
			 // save the index of the large element into largIndex
			 int largeIndex = i; 
			 // inner for loop to find the largest element of the array 
			 for (int j = i ; j <x ; j++) {
				 int res =c.compare(large,array[j]) ;
				 //if large <array [j] 
				 if (res < 0) {
					 large = array[j]; // set the large = array [j] 
					 largeIndex = j; /// get the index of it 
				 }
			 }
			// if the large > the element " which is the pointer that we need to check first" 
			 int res2 = c.compare(large,array[i]);
			 if (res2>0) { //swap
				 T temp = array[i]; 
				 array[i] = array[largeIndex];
				 array[largeIndex] = temp;
			 }
		
		}
	}
}
