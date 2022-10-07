package shapes;

public class OctagonalPrism extends Prism{
//An octagonal prims always has 8 sides
private final double sides = 8; 
//Edge length will always be passed from the file to the constructor
private double edgeLength;
	//No arg constructor for octagonal prism
	public OctagonalPrism() {
	super();
}
	
	/**
	 * 
	 * @param height the height of the shape
	 * @param edgeLength the edge length of each side of the shape
	 * Constructor with arguments for building a new octagonal prism
	 */
	public OctagonalPrism(double height ,double edgeLength) {
		super(height);
		this.edgeLength = edgeLength;
	}


	/**
	 * 
	 * @return returns the edge length of the octagonal prism
	 */
	public double getEdgeLength() {
		return edgeLength;
	}


	/**
	 * 
	 * @param edgeLength the edge length of each side of the shape
	 * Sets edge length for this object
	 */
	public void setEdgeLength( double edgeLength) {
		this.edgeLength = edgeLength;
	}


	@Override
	/**
	 * 
	 * @return returns the volume of the prism calculated using the formula:
	 *  Area * height
	 */
	public double calcVolume() {
		double volume = 2 * (1 + Math.sqrt(2)) * edgeLength * edgeLength * height;
		return volume;
	}

	@Override
	/**
	 * 
	 * @return returns the area of the prism using the formula:
	 *  2 * (1 + square root of 2) * s^2
	 */
	public double calcBaseArea() {
		double area = 2 * (1 + Math.sqrt(2)) * edgeLength * edgeLength;
		return area;
	}

	@Override
	public String toString() {
		return "OctagonalPrism [edgeLength=" + edgeLength + ", height=" + height + ", calcVolume()=" + calcVolume()
				+ ", calcBaseArea()=" + calcBaseArea() + "]";
	}
	

}
