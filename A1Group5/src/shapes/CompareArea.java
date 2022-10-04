package shapes;

import java.util.Comparator;

public class CompareArea  implements Comparator<Shape>  {

	

	@Override
	public int compare(Shape o1, Shape o2) {
		if (o1.calcBaseArea() > o2.calcBaseArea())
			return 1;
		if (o1.calcBaseArea() < o2.calcBaseArea())
			return -1;
		else
		return 0;
	}




}
