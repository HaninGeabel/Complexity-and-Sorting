package managers;

//import java.awt.Shape;
import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Array;
import java.util.Scanner;

import shapes.CompareArea;
import shapes.Shape;
import shapes.CompareVolume;
import shapes.Cone;
import shapes.Cylinder;
import shapes.OctagonalPrism;
import shapes.PentagonalPrism;
import shapes.Prism;
import shapes.Pyramid;
import shapes.SquarePrism;
import shapes.TriangularPrism;

import algorithms.BubbleSort;
import algorithms.InsertionSort;
import algorithms.MergSort;
import algorithms.PancakeSort;
import algorithms.SelectionSort;


public class Manager{	
	  
	Shape shapes[];
	
	CompareArea a= new CompareArea();
	CompareVolume v= new CompareVolume();
	
 
public Manager() {
	
		
	}

public Manager(String [] args) {
	super();
	readFromFile(args);
}


//pass the args
public void readFromFile(String [] args) {
	
	String fileName = "";
	String compareType = "";
	String sortType = "";
	
	String string1 = "";
	String string2 = "";
	String string3 = ""; 

	if(args.length != 3) {
		System.out.println("Pass in the correct number of arguments");
		return;
	}
	else {
		string1 = args[0].toLowerCase();
		string2 = args[1].toLowerCase();
		string3 = args[2].toLowerCase();
	}

	//check the category for string1
	if (string1.startsWith("-f")) {
		fileName = string1.substring(2);
	}
	else if (string1.startsWith("-t")) {
		compareType = string1.substring(2);
	}
	else if (string1.startsWith("-s")) {
		sortType = string1.substring(2);
	}
	else {
		
		System.out.println("Pass in the correct argument types1");
	}
	

//check the category for string2
	if (string2.startsWith("-f")) {
		fileName = string2.substring(2);
	}
	else if (string2.startsWith("-t")) {
		compareType = string2.substring(2);
	}
	else if (string2.startsWith("-s")) {
		sortType = string2.substring(2);
	}
	else {
		
		System.out.println("Pass in the correct argument types2");
	}
	
		
	//check the category for string3
	if (string3.startsWith("-f")) {
		fileName = string3.substring(2);
	}
	else if (string3.startsWith("-t")) {
		compareType = string3.substring(2);
	}
	else if (string3.startsWith("-s")) {
		sortType = string3.substring(2);
	}
	else {
		
		System.out.println("Pass in the correct argument types3");
	}
	

	
	//call readfile method to populate arrays
	try {
		readFile(fileName);
//		for (Shape s :shapes)
//			System.out.println(s);
		sortArr(shapes, sortType, compareType);
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	//call sort algorithm
	//if(compareType.equalsIgnoreCase("h")){
//		System.out.println("bubbleHeigh");
	//	sortArr(shapes, sortType, compareType);
	//}
	//sortArr(shapes, sortType, compareType);

}




private void readFile(String fileName) throws FileNotFoundException  {
	//declare variables
	
	int numOfShapes = 0;
	String[] allFile = null;

	//remove quotation from filenames
	if (fileName.contains("\"")){
		fileName = fileName.replace("\"", "");
	}
	
	//read from text file
	try {
			File file = new File(fileName);
		    Scanner myReader = new Scanner(file);

	      while (myReader.hasNextLine()) {
	        String line = myReader.nextLine();
			allFile = line.split(" ");
			numOfShapes = Integer.parseInt(allFile[0]); 
	      }
	      myReader.close();
	    } 
	catch (FileNotFoundException e) {
	      System.out.println("An error occurred.");
	      e.printStackTrace();
	    }
	
	//set the size of shapes objects
    shapes = new Shape[numOfShapes];
    
     //populate the shapes object and respective arrays based on the 3 types
	int j = 0;
	for (int i = 1 ; i < numOfShapes*3; i = i+3) {
		
		String className = allFile[i];
		double firstP =Double.parseDouble( allFile[i+1]); 
		double secondP = Double.parseDouble(allFile[i+2]); 

		
		if (className.equals("Cylinder")) {
			Cylinder cylinder = new Cylinder(firstP,secondP);
			shapes[j] = (Shape) cylinder;
			
			//[1 2, 3 4]
 		}
		
		else if (className.equals("Cone")) {
			Cone cone = new Cone(firstP,secondP);
			shapes[j] = (Shape) cone;
		}
		
		else if (className.equals("Pyramid")) {
			Pyramid  pyramid = new Pyramid(firstP,secondP);
			shapes[j] = (Shape) pyramid;
		}
		
		else if (className.equals("TriangularPrism")) {
			TriangularPrism triangularPrism  = new TriangularPrism (firstP,secondP);
			shapes[j] = (Shape) triangularPrism;
		}
		
		else if (className.equals("PentagonalPrism")) {
			PentagonalPrism pentagonalPrism = new PentagonalPrism (firstP,secondP);
			shapes[j] = (Shape) pentagonalPrism;
		}
		
		else if (className.equals("SquarePrism")) {
			SquarePrism squarePrism = new SquarePrism (firstP,secondP);
			shapes[j] = (Shape) squarePrism;
		}
		
		else if (className.equals("OctagonalPrism")) {
			OctagonalPrism octagonalPrism  = new OctagonalPrism (firstP,secondP);
			shapes[j] = (Shape) octagonalPrism;
		}
		
		else {
			System.out.println("This is not a valid object."); 
		}
		j = j+1;
	}
			
		
}		


public void sortArr(Shape[] arr, String sortType, String compareType) {
//height pass the array
	// volume and array pass array and object
	int lastIndex =  arr.length-1;
	
	if(compareType.equalsIgnoreCase("h")) {
	
	
		if(sortType.equalsIgnoreCase("b")) {
			System.out.println(sortType);
			BubbleSort.bubbleSort(arr);
//			for(int i= 0 ; i <=10 ; i++ )
//			System.out.println(arr[i]);
			
		}
		
		else if(sortType.equalsIgnoreCase("s")) {
			SelectionSort.SelectionSort(arr);
		}
		else if(sortType.equalsIgnoreCase("i")) {
//			System.out.println(sortType);
			InsertionSort.insertionSort(arr);
//			System.out.println(sortType);
//			for(int i= 0 ; i <=1000; i++ ) {
//				System.out.println(arr[i]);
//			}
				
		}
		else if(sortType.equalsIgnoreCase("m")) {
			
			MergSort.mergSort(arr, 0, lastIndex);
			}
//		else if(sortType.equalsIgnoreCase("q")) {
//			
//		}
		else if(sortType.equalsIgnoreCase("z")) {
			PancakeSort.pancakeSort(arr);
		}
		else {
			System.out.println("Invalid compare type1");
		}
	}
	else if(compareType.equalsIgnoreCase("v")) {
		
		
		if(sortType.equalsIgnoreCase("b")) {
			BubbleSort.bubbleSort(arr, v);
		}
		else if(sortType.equalsIgnoreCase("s")) {
			SelectionSort.SelectionSort(arr, v);
		}
		else if(sortType.equalsIgnoreCase("i")) {
			InsertionSort.insertionSort(arr, v);
		}
		else if(sortType.equalsIgnoreCase("m")) {
//			int lastIndex =  arr.length-1;
			int firstIndex = 0; 
				MergSort.mergSort(arr, firstIndex, lastIndex,v);
			}
		else if(sortType.equalsIgnoreCase("q")) {
			
		}
		else if(sortType.equalsIgnoreCase("z")) {
			PancakeSort.pancakeSort(arr, v);
		}
		else {
			System.out.println("Invalid compare type2");
		}
	}
	else if(compareType.equalsIgnoreCase("a")) {
		
		
		if(sortType.equalsIgnoreCase("b")) {
			BubbleSort.bubbleSort(arr, a);
		}
		else if(sortType.equalsIgnoreCase("s")) {
			SelectionSort.SelectionSort(arr, a);
		}
		else if(sortType.equalsIgnoreCase("i")) {
			//InsertionSort.insertionSort(arr, a);
		}
		else if(sortType.equalsIgnoreCase("m")) {
//			int lastIndex =  arr.length-1; 
			MergSort.mergSort(arr, 0, lastIndex, a);
			
			}
		else if(sortType.equalsIgnoreCase("q")) {
			
		}
		else if(sortType.equalsIgnoreCase("z")) {
			//PancakeSort.pancakeSort(arr, a);
		}
		else {
			System.out.println("Invalid compare type3");
		}
	}
	else {
		System.out.println("Invalid compare type4");
	}
	for(int i= 0 ; i <=10 ; i++ )
		System.out.println(arr[i]);
	
}
}
