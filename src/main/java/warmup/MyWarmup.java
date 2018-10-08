
package warmup;

import java.util.Arrays;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicInteger;

public class MyWarmup implements Warmup {

	@Override
	public int findMax(int[] array) {
		int index = -1;

		if (Predicates.checkIfNotNullAndLengthGreaterThan0AndLengthLessThanMaxVal.test(array)) {
			final TreeMap<Integer, Integer> treeMap = new TreeMap<>();
			AtomicInteger ind = new AtomicInteger();
			Arrays.stream(array).forEach(val -> {
				if (!treeMap.containsKey((array[ind.intValue()]))) {
					treeMap.put(array[ind.intValue()], ind.intValue());
				}
				ind.getAndIncrement();
			});

			index = treeMap.get(treeMap.lastKey());
			Arrays.stream(array).forEach(System.out::print);
			System.out.println("Index of Max Val is: " + index);

		}

		return index;
	}

}
