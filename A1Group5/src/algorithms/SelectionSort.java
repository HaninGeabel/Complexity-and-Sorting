package algorithms;

import java.util.Comparator;

public class SelectionSort {
	public static void main (String [] args) {
		String  array [] = {"a","z","b","z","c"};
		SelectionSort(array); 
		for (String s:array) {
			System.out.println(s);
		}
	}
	public static <T extends Comparable<? super T>> void  SelectionSort(T[] array) {
		
		int x = array.length;
		
		for (int i = 0;i <x ; i++) {
			 T mid = array[i]; 
			 int midIndex = i; 
			 for (int j = i ; j <x ; j++) {
				 int res =mid.compareTo(array[j]) ;
				 if (res > 0) {
					 mid = array[j]; 
					 midIndex = j; 
				 }
			 }
			 int res2 = mid.compareTo(array[i]);
			 if (res2<0) {
				 T temp = array[i]; 
				 array[i] = array[midIndex];
				 array[midIndex] = temp;
			 }
		
		}
	}
	public static <T> void  SelectionSort(T[] array, Comparator<? super T> c) {
		
		int x = array.length;
		
		for (int i = 0;i <x ; i++) {
			 T mid = array[i]; 
			 int midIndex = i; 
			 for (int j = i ; j <x ; j++) {
				 int res =c.compare(mid,array[j]) ;
				 if (res > 0) {
					 mid = array[j]; 
					 midIndex = j; 
				 }
			 }
			 int res2 = c.compare(mid,array[i]);
			 if (res2<0) {
				 T temp = array[i]; 
				 array[i] = array[midIndex];
				 array[midIndex] = temp;
			 }
		
		}
	}
}
