
package warmup;

import java.util.function.Predicate;

public interface Warmup {
	int findMax(int[] input);

	interface Predicates {
		Predicate<int[]> checkIfNotNullAndLengthGreaterThan0AndLengthLessThanMaxVal = (input) -> input != null
				&& input.length > 0 && input.length < Integer.MAX_VALUE / 10;
	}
}
