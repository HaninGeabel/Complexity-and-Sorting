package algorithms;

public class InsertionSort {
	public Comparable[] insertionSort (Comparable[] arr) {
		
		for(int i= 0; i < arr.length - 1; i++) {
			for(int j = i; j >= 0; j--) {
			// sorting greatest to least
			// when arr[i] is less than arr[i+1] -> negative number
				if(arr[j].compareTo(arr[j + 1]) < 0) {
					// if i+1 is greater than i, then swap the elements
					Comparable tempValue;
					tempValue = arr[j + 1];
					arr[j + 1] = arr[j];
					arr[j] = tempValue;
				
				} else {
					break;
				}
			}
			
		}
		return arr;
	}
}
