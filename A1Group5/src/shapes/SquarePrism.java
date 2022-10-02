package shapes;

public class SquarePrism extends Prism {
private double weidth; 
private double length;



	public SquarePrism() {
	super();
}

	public SquarePrism(double weidth, double length) {
		super();
		this.weidth = weidth;
		this.length = length;
	}


	public double getWeidth() {
		return weidth;
	}

	public void setWeidth(double weidth) {
		this.weidth = weidth;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}


	@Override
	public double calcVolume() {
		// TODO Auto-generated method stub
		
		
		double volume = this.length * this.weidth * height; 
		return volume;
	}

	@Override
	public double calcBaseArea() {
		double area = this.length * this.weidth;
		return area;
	}

//	@Override
//	public int compareTo(Shape o) {
//		// TODO Auto-generated method stub
//		return 0;
//	}


}
