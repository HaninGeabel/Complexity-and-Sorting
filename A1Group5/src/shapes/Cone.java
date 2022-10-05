package shapes;

public class Cone extends Shape{
private double radius;

//No arg constructor for cone shape
public Cone() {
	super();
}

/**
 * Constructor for cone shape
 * @param height height of the shape
 * @param radius radius of the shape
 */
public Cone(double height, double radius) {
	super(height);
	this.radius = radius;
}

/**
 * 
 * @return returns the radius of cone shape
 */
public double getRadius() {
	return radius;
}

/**
 * 
 * @param radius sets radius of cone shape
 */
public void setRadius(double radius) {
	this.radius = radius;
}

@Override
/**
 * 
 * @return returns the volume of the cone shape calculated using formula:
 *  1/3 pi r^2 h
 */
public double calcVolume() {
	double volume = height * (1/3) * this.calcBaseArea();
	return volume;
}

@Override
/**
 *
 * @return returns the base area of the cone using formula:
 *  pi r^2
 */
public double calcBaseArea() {
	double area = radius * radius * Math.PI;
	return area;
}



}
