package shapes;

public class Cone extends Shape{
private double radius;

public Cone() {
	super();
}

public Cone(double radius) {
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
	double volume = height * (1/3) * this.calcBaseArea();
	return volume;
}

@Override
public double calcBaseArea() {
	double base = radius * radius * Math.PI;
	return base;
}



}
