package shapes;

import java.util.Comparator;
/**
 * Class Definition: CompareVolume implements comparator and has an override method of compare 
 * @author Hanin
 *
 */
public class CompareVolume implements Comparator<Shape>{
	/**
	 * @param Shape o1
	 * @param Shape o2
	 * @Override
	 */
	@Override
	public int compare(Shape o1, Shape o2) {
		if (o1.calcVolume() > o2.calcVolume())
			return 1;
		if (o1.calcVolume() < o2.calcVolume())
			return -1;
		else
		return 0;
	}

}
