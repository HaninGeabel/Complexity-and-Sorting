package shapes;

import java.util.Comparator;

public abstract class Shape implements Comparable<Shape> {

	// Height is inherited by all shapes
	public double height;

	// No arg constructor
	public Shape() {
		super();
	}

	// Main constructor
	public Shape(double height) {
		super();
		this.height = height;
	}

	/**
	 * 
	 * @return returns the height of the shape
	 */
	public double getHeight() {
		return height;
	}

	/**
	 * 
	 * @param height sets the height of the shape
	 */
	public void setHeight(double height) {
		this.height = height;
	};

	// All shapes have a calculated volume but the calculation differs
	public abstract double calcVolume();

	// All shapes have a calculated base area but the calculation differs
	public abstract double calcBaseArea();

	/**
	 * This method compares the current shape with a shape that is passed as a parameter, and returns a value based on the difference,
	 * @return a positive integer if the shape has a greater height than the passed shape, -1 if the shape has a lesser height, and 0 if they are equal
	 */
	public int compareTo(Shape shape2) {
		if (this.getHeight() > shape2.getHeight())
			return 1;
		else if (this.getHeight() == shape2.getHeight())
			return 0;
		else
			return -1;
	}

}
