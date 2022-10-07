package shapes;

public class Pyramid extends Shape {
	// A pyramid always has 4 sides, so this is final
	final public double sides = 4;
//The length of each edge of the shape
	public double edgeLength;

	// No arg constructor for pyramid
	public Pyramid() {
		super();
	}

	/**
	 * 
	 * @param height     the height of the pyramid
	 * @param edgeLength the length of each edge of the base of the pyramid
	 */
	public Pyramid(double height, double edgeLength) {
		super(height);
		this.edgeLength = edgeLength;
	}

	/**
	 * 
	 * @return return the length of each edge of the base of the pyramid
	 */
	public double getEdgeLength() {
		return edgeLength;
	}

	/**
	 * 
	 * @param edgeLength set the length of each edge of the base of the pyramid
	 */
	public void setRadius(double edgeLength) {
		this.edgeLength = edgeLength;
	}

	/**
	 * @return returns the volume of the pyramid using the formula: 1/3 * s^2 *
	 *         height
	 */
	@Override
	public double calcVolume() {
		// TODO Auto-generated method stub
		return 0;
	}

	/**
	 * @return returns the base area of the pyramid using the formula: s * s
	 */
	@Override
	public double calcBaseArea() {
		double area = edgeLength * edgeLength;
		return area;
	}

}
