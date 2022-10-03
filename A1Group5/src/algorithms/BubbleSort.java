package algorithms;

import java.awt.Shape;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import shapes.CompareArea;

public class BubbleSort {
	
	private  CompareArea compareo = new CompareArea();

	//I'm passing in a dummy array for now. It should be changed to the actual array we need to use.
	private Shape[] bubbleSort(Shape [] shapes) {
//Bubble sort compares the first value to the second, and places the larger value on the left.
//The selection then moves to the value that was smaller, and compares it to the next value.
//Once the smallest value is on the right, we go back to the very start.
	int x = shapes.length;
	
	//Before we can actually compare anything, we need to specify that we are looking at the 
	//volume or base area and calculate those.
	
	//We want to know how long it takes to sort the array, so we will assign the current time to a variable.
	long start = System.currentTimeMillis();
	
	//Since we need to loop through the whole array every time, we use a nested for loop.
	for (int i = 0; i < x-1; i++) {
		for (int j = 0; j < x-1-i; j++) {
			//Compare the current element to the next one in the array
			//object should be cast to the type of the shape

			// if user enter "h"
			int res = ((shapes.Shape) shapes[j]).compareTo((shapes.Shape)shapes[j+1]) ;
				//A simple method of swapping
			if (res>0) {
				Shape temp = shapes[j];
				shapes[j] = shapes[j+1];
				shapes[j+1] = temp;
				
			}
		}
	}
	long stop = System.currentTimeMillis();
	long processTime = stop - start;
	System.out.println("Total running time: " + processTime + "ms");
	return shapes; 
	}
}

