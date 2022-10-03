package algorithms;

import java.awt.Shape;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

import shapes.CompareArea;

public class BubbleSort {
	

	

	//I'm passing in a dummy array for now. It should be changed to the actual array we need to use.
	public static <T extends Comparable<? super T>> void  bubbleSort(T[] array) {//
//Bubble sort compares the first value to the second, and places the larger value on the left.
//The selection then moves to the value that was smaller, and compares it to the next value.
//Once the smallest value is on the right, we go back to the very start.
	int x = array.length;
	
	//Before we can actually compare anything, we need to specify that we are looking at the 
	//volume or base area and calculate those.
	
	//We want to know how long it takes to sort the array, so we will assign the current time to a variable.
	//long start = System.currentTimeMillis();in caller
	
	//Since we need to loop through the whole array every time, we use a nested for loop.
	for (int i = 0; i < x-1; i++) {
		for (int j = 0; j < x-1-i; j++) {
			//Compare the current element to the next one in the array
			//object should be cast to the type of the shape

			// if user enter "h" 
	
			int res =array[j].compareTo(array[j+1]) ;
				//A simple method of swapping 
			if (res>0) {
				T temp = array[j];
				array[j] = array[j+1];
				array[j+1] = temp;
				
			}
			//if user enters "ta -sb"
//			compareArea.compare((shapes.Shape)shapes[j],(shapes.Shape) shapes[j+1]);
		}
	}
//	long stop = System.currentTimeMillis();// caller
//	long processTime = stop - start;
//	System.out.println("Total running time: " + processTime + "ms");
//	return shapes; 
	}
	public static <T> void  bubbleSort(T[] array, Comparator<? super T> c) {//
		//Bubble sort compares the first value to the second, and places the larger value on the left.
		//The selection then moves to the value that was smaller, and compares it to the next value.
		//Once the smallest value is on the right, we go back to the very start.
			int x = array.length;
			
			//Before we can actually compare anything, we need to specify that we are looking at the 
			//volume or base area and calculate those.
			
			//We want to know how long it takes to sort the array, so we will assign the current time to a variable.
			//long start = System.currentTimeMillis();in caller
			
			//Since we need to loop through the whole array every time, we use a nested for loop.
			for (int i = 0; i < x-1; i++) {
				for (int j = 0; j < x-1-i; j++) {
					//Compare the current element to the next one in the array
					//object should be cast to the type of the shape

					// if user enter "a" 
			
					
					int res =c.compare(array[j], array[j+1]) ;
						//A simple method of swapping 
					if (res>0) {
						T temp = array[j];
						array[j] = array[j+1];
						array[j+1] = temp;
						
					}
					//if user enters "ta -sb"
//					compareArea.compare((shapes.Shape)shapes[j],(shapes.Shape) shapes[j+1]);
				}
			}
//			long stop = System.currentTimeMillis();// caller
//			long processTime = stop - start;
//			System.out.println("Total running time: " + processTime + "ms");
//			return shapes; 
			}
}

