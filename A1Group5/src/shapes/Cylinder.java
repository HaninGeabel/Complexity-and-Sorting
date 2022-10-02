package shapes;

public class Cylinder extends Shape{
	private double radius;
	


	public Cylinder() {
		super();
	}

	public Cylinder(double radius) {
		super();
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}


	@Override
	public double calcVolume() {
		double volume;
		double base = this.calcBaseArea();
		volume = base * height;
		return volume;
	}

	@Override
	public double calcBaseArea() {
		double base;
		base = radius * radius * Math.PI;
		return base;
	}
}

	

