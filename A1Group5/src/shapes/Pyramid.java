package shapes;

public class Pyramid extends Shape{
public double edgeLength; 

	public Pyramid() {
	super();
}

	public Pyramid(double height, double edgeLength) {
		super(height);
		this.edgeLength = edgeLength;
	}

	public double getEdgeLength() {
		return edgeLength;
	}

	public void setRadius(double edgeLength) {
		this.edgeLength = edgeLength;
	}

//	@Override
//	public int compareTo(Shape o) {
//		// TODO Auto-generated method stub
//		return 0;
//	}

	@Override
	public double calcVolume() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double calcBaseArea() {
		// TODO Auto-generated method stub
		return 0;
	}

	

}
