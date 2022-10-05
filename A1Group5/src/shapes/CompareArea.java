package shapes;

import java.util.Comparator;

/**
 * Class Definition: CompareArea implements comparator and has an override method of compare 
 * @author Hanin
 *
 */
public class CompareArea  implements Comparator<Shape>  {


	@Override
	/**
	 * @param Shape o1
	 * @param Shape o2
	 * @Override
	 */
	public int compare(Shape o1, Shape o2) {
		if (o1.calcBaseArea() > o2.calcBaseArea())
			return 1;
		if (o1.calcBaseArea() < o2.calcBaseArea())
			return -1;
		else
		return 0;
	}




}
