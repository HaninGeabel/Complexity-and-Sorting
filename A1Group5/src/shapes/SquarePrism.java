package shapes;

public class SquarePrism extends Prism {
//Square prisms always have 4 sides, so we set this as a constant
	final private double sides = 4;
//The length of the edges of the prism
	private double edgeLength;

//No arg constructor for the square prism
	public SquarePrism() {
		super();
	}

	/**
	 * 
	 * @param height     the height of the prism
	 * @param edgeLength the length of the edges of the prism
	 */
	public SquarePrism(double height, double edgeLength) {
		super(height);
		this.edgeLength = edgeLength;

	}

	/**
	 * 
	 * @return returns the length of the edges of the prism
	 */
	public double getEdgeLength() {
		return edgeLength;
	}

	/**
	 * 
	 * @param edgeLength sets the length of the edges of the prism
	 */
	public void setEdgeLength(double edgeLength) {
		this.edgeLength = edgeLength;
	}

	@Override
	/**
	 * @return returns the volume of the square prism calculated using the formula:
	 *         s^2 * height
	 */
	public double calcVolume() {
		double volume = edgeLength * edgeLength * height;
		return volume;
	}

	@Override
	/**
	 * @return returns the base area of the square prism calculated using the formula: 
	 * s^2
	 */
	public double calcBaseArea() {
		double area = edgeLength * edgeLength;
		return area;
	}

	@Override
	public String toString() {
		return "SquarePrism [edgeLength=" + edgeLength + ", height=" + height + ", calcVolume()=" + calcVolume()
				+ ", calcBaseArea()=" + calcBaseArea() + "]";
	}

}
