package diferenciaSimetrica;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DiferenciaSimetrica {

	public static <T extends Comparable<T>> List<T> diferenciaSimetrica(List<T> l1, List<T> l2) {

		Set<T> setL1 = new HashSet<T>(l1);
		Set<T> setL2 = new HashSet<T>(l2);

		Set<T> resultado = new HashSet<T>(l1);
		resultado.removeAll(l2);
		setL2.removeAll(setL1);

		resultado.addAll(l2);

		return new ArrayList<T>(resultado);
	}

}
