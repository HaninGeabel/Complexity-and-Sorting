package shapes;

public class Pyramid extends Shape{
public double radius; 

	public Pyramid() {
	super();
}

	public Pyramid(double radius) {
		super();
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
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
