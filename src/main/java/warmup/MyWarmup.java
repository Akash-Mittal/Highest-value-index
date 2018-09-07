/*
   This file is provided exclusively for the purpose of Spartez Online Assessment.
   Unauthorized distribution of this file, derived work or information about its
   content, via any medium, is strictly prohibited.
 */
package warmup;

import java.util.Arrays;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicInteger;

public class MyWarmup implements Warmup {

    @Override
    public int findMax(int[] array) {
        int index = -1;
        if (array != null && array.length > 0 && array.length < Integer.MAX_VALUE / 10) {
            final TreeMap<Integer, Integer> treeMap = new TreeMap<>();
            AtomicInteger ind = new AtomicInteger();
            Arrays.stream(array).forEach(val -> {
                if (!treeMap.containsKey((array[ind.intValue()]))) {
                    treeMap.put(array[ind.intValue()], ind.intValue());
                }
                ind.getAndIncrement();
            });

            index = treeMap.get(treeMap.lastKey());
        }
        return index;
    }
}
