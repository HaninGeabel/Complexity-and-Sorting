package shapes;

public abstract class Prism extends Shape {

	// The length of each side of the prism
	protected double side;

	// No arg constructor for a prism shape
	public Prism() {
		super();
	}

	/**
	 * 
	 * @param side the length of each side of the prism
	 */
	public Prism(double side) {
		super();
		this.side = side;
	}

	/**
	 * @return the length of the each side of the prism
	 */
	public double getSide() {
		return side;
	}

	/**
	 * 
	 * @param side the length of each side of the prism
	 */
	public void setSide(double side) {
		this.side = side;
	}

	/**
	 * Abstract methods to be inherited by other prisms for calculating volume and
	 * area
	 */
	public abstract double calcVolume();

	public abstract double calcBaseArea();
}
