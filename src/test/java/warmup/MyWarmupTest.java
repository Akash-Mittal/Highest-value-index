/*
   This file is provided exclusively for the purpose of Spartez Online Assessment.
   Unauthorized distribution of this file, derived work or information about its
   content, via any medium, is strictly prohibited.
 */
package warmup;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class MyWarmupTest {

    private Warmup warmup;

    @Before
    public void testSetup() throws Exception {
        warmup = new MyWarmup();
    }

    @Test
    public void findMaxFromTaskDescription() throws Exception {
        final int[] array = { 1, 2, 3, 0, -1, 3 };
        int result = warmup.findMax(array);
        assertEquals(2, result);
    }

    @Test
    public void findMaxFromSingle() throws Exception {
        final int[] array = { 1 };
        int result = warmup.findMax(array);
        assertEquals(0, result);
    }

    @Test
    public void findMaxWhenArrayisNullOrEmpty() throws Exception {
        final int[] nullArray = null;
        int result = warmup.findMax(nullArray);
        assertEquals(-1, result);
        final int[] emptyArray = {};
        result = warmup.findMax(emptyArray);
        assertEquals(-1, result);
    }

}