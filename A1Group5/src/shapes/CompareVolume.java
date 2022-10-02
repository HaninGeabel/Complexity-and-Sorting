package shapes;

import java.util.Comparator;

public class CompareVolume implements Comparator<Shape>{

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
