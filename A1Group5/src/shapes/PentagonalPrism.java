package shapes;

public class PentagonalPrism extends Prism{
	

private double edgeLength; 
	

public PentagonalPrism() {
	super();
}


	public PentagonalPrism(double edgeLength) {
	super();
	this.edgeLength = edgeLength;
}


	public double getEdgeLength() {
		return edgeLength;
	}

	public void setApothemLength(double edgeLength) {
		this.edgeLength = edgeLength;
	}
	
	@Override
	public double calcVolume() {
		//(5 * b * h) / 2
		double area = calcBaseArea();
		double volume = area * height;
		return volume;
	}

	@Override
	public double calcBaseArea() {
		double area =  5 * (edgeLength * edgeLength) * Math.tan(54) / 4;
		return area;
	}

}
