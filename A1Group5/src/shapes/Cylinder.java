package shapes;

public class Cylinder extends Shape{
	
//	private double height;
	private double radius;
	


	public Cylinder() {
		super();
	}

	public Cylinder(double height, double radius) {
		super(height);
		
		this.radius = radius;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
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

	

