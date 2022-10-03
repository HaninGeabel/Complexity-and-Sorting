package shapes;

public class OctagonalPrism extends Prism{
private final double sides = 8; 
private double edgeLength;

	public OctagonalPrism() {
	super();
}
	
	
	public OctagonalPrism(double height ,double edgeLength) {
		super(height);
		this.edgeLength = edgeLength;
	}


	public double getEdgeLength() {
		return edgeLength;
	}


	public void setEdgeLength( double edgeLength) {
		this.edgeLength = edgeLength;
	}


	@Override
	public double calcVolume() {
		double volume = 2 * (1 + Math.sqrt(2)) * edgeLength * edgeLength * height;
		return volume;
	}

	@Override
	public double calcBaseArea() {
		double area = 2 * (1 + Math.sqrt(2)) * edgeLength * edgeLength;
		return area;
	}
	

}
