package p2;

import java.util.Comparator;


public class RatingSorted implements Comparator<ElectronicDevice> {

	@Override
	public int compare(ElectronicDevice o1, ElectronicDevice o2) {
		return o1.getRating()-o2.getRating();
		
	}

}
