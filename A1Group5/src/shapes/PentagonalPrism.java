package shapes;

public class PentagonalPrism extends Prism{
	
private double length;
private double apothemLength; 
	
//	a– apothem length of the Pentagonal Prism. 
//	b– base length of the Pentagonal Prism. 
//	h– height of the Pentagonal Prism.
	// 5 * a * b + 5 * b * h;

public PentagonalPrism() {
	super();
}


	public PentagonalPrism(double length, double apothemLength) {
	super();
	this.length = length;
	this.apothemLength = apothemLength;
}


	public double getLength() {
		return length;
	}

	

	public void setLength(double length) {
		this.length = length;
	}

	public double getApothemLength() {
		return apothemLength;
	}

	public void setApothemLength(double apothemLength) {
		this.apothemLength = apothemLength;
	}
	
	@Override
	public double calcVolume() {
		//(5 * b * h) / 2
		double volume = (5 * length * height) /2;
		return volume;
	}

	@Override
	public double calcBaseArea() {
		double area = (5 * apothemLength * length) + (5 * length * apothemLength);
		return area;
	}

}
