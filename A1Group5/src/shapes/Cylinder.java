package shapes;

public class Cylinder extends Shape {

	private double radius;

//No arg constructor for cylinder shape
	public Cylinder() {
		super();
	}

	/**
	 * 
	 * @param height the height of the cylinder shape
	 * @param radius the radius of the cylinder shape
	 */
	public Cylinder(double height, double radius) {
		super(height);
		this.radius = radius;
	}

	/**
	 * @return returns the height of the cylinder shape
	 */
	public double getHeight() {
		return height;
	}

	/**
	 * @param height sets the height of the cylinder shape
	 */
	public void setHeight(double height) {
		this.height = height;
	}

	/**
	 * 
	 * @return returns the radius of the cylinder shape
	 */
	public double getRadius() {
		return radius;
	}

	/**
	 * 
	 * @param radius sets the radius of the cylinder shape
	 */
	public void setRadius(double radius) {
		this.radius = radius;
	}

	/**
	 * @return returns the volume of the cylinder calculated using the formula: pi
	 *         r^2 h
	 */
	@Override
	public double calcVolume() {
		double volume;
		double area = this.calcBaseArea();
		volume = area * height;
		return volume;
	}

	@Override
	/**
	 * @return returns the base area of the cylinder calculated using the formula:
	 *         pi * r^2
	 */
	public double calcBaseArea() {
		double area;
		area = radius * radius * Math.PI;
		return area;
	}
}
