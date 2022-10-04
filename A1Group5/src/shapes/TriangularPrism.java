package shapes;

public class TriangularPrism extends Prism {
	private double edgeLength; 
	
	
	
	public TriangularPrism() {
		super();
	}

	public TriangularPrism(double height ,double edgeLength) {
		super(height);
	
		this.edgeLength = edgeLength;
	}



	public double getEdgeLength() {
		return edgeLength;
	}

	public void setLength(double edgeLength) {
		this.edgeLength = edgeLength;
	}

	@Override
	public double calcVolume() {
		double volume = 1/2 * this.edgeLength * this.edgeLength* height; 
		return volume;
	}

	@Override
	public double calcBaseArea() {
		double area = 1/2 * this.edgeLength * this.edgeLength;
		return area;
	}

}
