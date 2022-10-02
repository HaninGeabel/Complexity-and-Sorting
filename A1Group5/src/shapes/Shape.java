package shapes;

public abstract class Shape implements Comparable<Shape> {
	
	
	public  double height = 0;
	
	public Shape() {
		super();
	}
	
	public Shape(double height) {
		super();
		this.height = height;
	}
	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	};
	

	//All shapes have a calculated volume but the calculation differs
	public abstract double calcVolume();
	
	//All shapes have a calculated base area but the calculation differs
	public abstract double calcBaseArea();
	//compare between shapes 
	public int compareTo(Shape shape2) {
		if (this.getHeight()> shape2.getHeight()) 
			return 1; 
			else if (this.getHeight() == shape2.getHeight())  
				return 0;
			else 
				return -1;
		}
		
	}

	



