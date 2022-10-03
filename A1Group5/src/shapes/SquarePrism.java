package shapes;

public class SquarePrism extends Prism {
private double edgeLength; 




	public SquarePrism() {
	super();
}

	public SquarePrism(double height, double edgeLength) {
		super(height);
		this.edgeLength = edgeLength;
		
	}


	

	public double getEdgeLength() {
		return edgeLength;
	}

	public void setEdgeLength(double edgeLength) {
		this.edgeLength = edgeLength;
	}


	@Override
	public double calcVolume() {
		// TODO Auto-generated method stub
		
		
		double volume = this.edgeLength * this.edgeLength * height; 
		return volume;
	}

	@Override
	public double calcBaseArea() {
		double area = this.edgeLength * this.edgeLength;
		return area;
	}

//	@Override
//	public int compareTo(Shape o) {
//		// TODO Auto-generated method stub
//		return 0;
//	}


}
