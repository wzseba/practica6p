package sonTodosMayores;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

class TodosMayoresTest {

	@Test
	void todosMayoresConEnterosTest() {

		List<Integer> l1 = Arrays.asList(5, 6, 7);
		List<Integer> l2 = Arrays.asList(2, 3, 4);

		assertTrue(TodosMayores.sonTodosMayores(l1, l2));
	}

	@Test
	void todosMayoresConEnterosFalseTest() {
		List<Integer> l1 = Arrays.asList(2, 6, 9);
		List<Integer> l2 = Arrays.asList(5, 3, 4);

		assertFalse(TodosMayores.sonTodosMayores(l1, l2));
	}

	@Test
	void todosMayoresConStringTest() {
		List<String> l1 = Arrays.asList("d", "e", "f");
		List<String> l2 = Arrays.asList("a", "b", "c");

		assertTrue(TodosMayores.sonTodosMayores(l1, l2));
	}

	@Test
	void todosMayoresConStringFalseTest() {
		List<String> l1 = Arrays.asList("d", "e", "f");
		List<String> l2 = Arrays.asList("a", "h", "c");

		assertFalse(TodosMayores.sonTodosMayores(l1, l2));
	}

}
