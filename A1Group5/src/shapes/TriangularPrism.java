package shapes;

public class TriangularPrism extends Prism {
	final private double sides = 3;
	//Length of the edges of the triangular prism
	private double edgeLength; 
	
	
	//No arg constructor
	public TriangularPrism() {
		super();
	}
	//Main constructor
	public TriangularPrism(double height ,double edgeLength) {
		super(height);
		this.edgeLength = edgeLength;
	}

	/**
	 * 
	 * @return returns length of each edge of the triangular prism
	 */
	public double getEdgeLength() {
		return edgeLength;
	}

	/**
	 * 
	 * @param edgeLength sets the length of each edge of the triangular prism
	 */
	public void setLength(double edgeLength) {
		this.edgeLength = edgeLength;
	}

	@Override
	/**
	 * @return returns the volume of the triangular prism, calculated using the formula:
	 * area * height
	 */
	public double calcVolume() {
		double volume = this.calcBaseArea() * height; 
		return volume;
	}

	@Override
	/**
	 * @return returns the base area of the triangular prism, calculated using the formula:
	 * s^2 * (square root of 3) / 4
	 */
	public double calcBaseArea() {
		double area = 1/2 * edgeLength * edgeLength;
		return area;
	}

}
