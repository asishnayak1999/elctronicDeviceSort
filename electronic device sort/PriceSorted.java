package p2;

import java.util.Comparator;


public class PriceSorted implements Comparator<ElectronicDevice> {

	public PriceSorted() {
	}

	@Override
	public int compare(ElectronicDevice o1, ElectronicDevice o2) {
		return o1.getPrice()-o2.getPrice();
	}

}
