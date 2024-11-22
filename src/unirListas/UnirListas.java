package unirListas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UnirListas {

	public List<Integer> unirListas(List<Integer> l1, List<Integer> l2) {

		List<Integer> union = new ArrayList<>();

		union.addAll(l1);
		union.addAll(l2);

		Collections.sort(union);

		return union;
	}

}
