package shapes;

public class PentagonalPrism extends Prism {
//Pentagon always has five sides so we use a constant
	private final double sides = 5;
//Length of each edge of the shape
	private double edgeLength;

//No-arg constructor
	public PentagonalPrism() {
		super();
	}

	/**
	 * 
	 * @param height the height of the prism
	 * @param edgeLength the length of each side of the shape
	 */
	public PentagonalPrism(double height, double edgeLength) {
		super(height);
		this.edgeLength = edgeLength;
	}

	/**
	 * 
	 * @return returns the length of each side of the prism
	 */
	public double getEdgeLength() {
		return edgeLength;
	}

	/**
	 * 
	 * @param edgeLength sets the length of each side of the prism
	 */
	public void setEdgeLength(double edgeLength) {
		this.edgeLength = edgeLength;
	}

	@Override
	/**
	 * @return returns the volume of the prism using the formula:
	 *  Area * height
	 */
	public double calcVolume() {
		// (5 * b * h) / 2
		double area = calcBaseArea();
		double volume = area * height;
		return volume;
	}

	@Override
	/**
	 * @return returns the base area of the prism using the formula:
	 *  5 * s^2 * tan(54) / 4
	 */
	public double calcBaseArea() {
		double area = sides * (edgeLength * edgeLength) * Math.tan(54) / 4;
		return area;
	}

	@Override
	public String toString() {
		return "PentagonalPrism [edgeLength=" + edgeLength + ", height=" + height + ", calcVolume()=" + calcVolume()
				+ ", calcBaseArea()=" + calcBaseArea() + "]";
	}

}
