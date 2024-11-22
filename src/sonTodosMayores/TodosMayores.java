package sonTodosMayores;

import java.util.Collections;
import java.util.List;

public class TodosMayores {

	public static <T extends Comparable<T>> boolean sonTodosMayores(List<T> l1, List<T> l2) {

		// Verificar que la lista 2 tenga elementos
		if (l1.isEmpty()) {
			return true;
		}
		T maxL2 = Collections.max(l2);

		for (T elementoL1 : l1) {
			if (elementoL1.compareTo(maxL2) <= 0) {
				/*
				 * compareTo devuelve negetivo - cero - positivo. Esta comparación está
				 * verificando si elementoL1 es menor o igual a maxL2
				 */
				return false;
			}
		}

		return true;
	}
}
