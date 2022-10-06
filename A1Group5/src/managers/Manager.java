package managers;

import java.awt.Shape;
import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Array;
import java.util.Scanner;

import shapes.Cone;
import shapes.Cylinder;
import shapes.OctagonalPrism;
import shapes.PentagonalPrism;
import shapes.Pyramid;
import shapes.SquarePrism;
import shapes.TriangularPrism;

public class Manager {

	public Shape[] shapes = new Shape[100];

//pass the args
	public void readFromFile(String[] args) {

		for (int i = 0; i < args.length; i++) {
			if (args[i].startsWith("f")) {
				String fileString = args[i].substring(1);
				if (!args[i].contains("\"")) {
					try {
						ReadFile(args[i]);
					} catch (FileNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				if (fileString.startsWith("\"") && fileString.endsWith("\"")) {

				}
				if (fileString.startsWith("\"") && fileString.endsWith("txt")) {

				}

			}
		}

	}

	private void ReadFile(String string) throws FileNotFoundException {
		String fileName = "res/" + string;
		int arraySize = 0;
		String[] allFile = null;
		// BufferedReader reader = new BufferedReader(new InputStreamReader(new
		// FileInputStream(fileName)));
		File file = new File(fileName);
		Scanner in = new Scanner(file);

		while (in.hasNext()) {
			String line = in.nextLine();
			allFile = line.split(" ");
			arraySize = Integer.parseInt(allFile[0]);
		}
		for (int i = 1; i <= arraySize * 3; i = i + 3) {
			String className = allFile[i];
			double firstP = Double.parseDouble(allFile[i + 1]);
			double secoundP = Double.parseDouble(allFile[i + 2]);
			if (className.equals("Cylinder")) {
				Cylinder cylinder = new Cylinder(firstP, secoundP);
			} else if (className.equals("Cone")) {
				Cone cone = new Cone(firstP, secoundP);
			} else if (className.equals("Pyramid")) {
				Pyramid pyramid = new Pyramid(firstP, secoundP);
			} else if (className.equals("Pyramid")) {
				Pyramid pyramid = new Pyramid(firstP, secoundP);
			} else if (className.equals("TriangularPrism")) {
				TriangularPrism triangularPrism = new TriangularPrism(firstP, secoundP);

			} else if (className.equals("PentagonalPrism")) {
				PentagonalPrism pentagonalPrism = new PentagonalPrism(firstP, secoundP);
			} else if (className.equals("SquarePrism")) {
				SquarePrism squarePrism = new SquarePrism(firstP, secoundP);
			} else if (className.equals("OctagonalPrism")) {
				OctagonalPrism octagonalPrism = new OctagonalPrism(firstP, secoundP);
			} else {
				System.out.println("This is not a valid object.");
			}

		}
	}
	
	/**
	 * SortOutput should print the first sorted value the last sorted value,
	 * and every thousandth values in between.
	 * @param <T>
	 * @param sortedArray the array to print out
	 */
	public <T extends Comparable<? super T>> void sortOutput(T[] sortedArray) {
		for(int i = 0; i < sortedArray.length - 1; i += 1000) {
			System.out.println(sortedArray[i]);
		} 
		// print out the last value
		System.out.println(sortedArray[sortedArray.length - 1]);
	}

}
//Method #1
// The compare type will be provided as input from the command 
//line to your program - h for height, v for volume, and a for base area via the -t option.

//Method2 
//program that will read a text file (entered at the command line via the -f option)
//of random shapes that adds them to an array (not ArrayList).

//Method #3