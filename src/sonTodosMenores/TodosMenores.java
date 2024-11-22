package sonTodosMenores;

import java.util.Collections;
import java.util.List;

public class TodosMenores {

	public static <T extends Comparable<T>> boolean sonTodosMenores(List<T> l1, List<T> l2) {

		if (l2.isEmpty()) {
			return false;
		}

		T minL2 = Collections.min(l2);

		for (T elementoL1 : l2) {
			if (elementoL1.compareTo(minL2) >= 0) {
				return false;
			}
		}
		return true;
	}

}
