package com.github.wrdlbrnft.primitivecollections;

import com.github.wrdlbrnft.primitivecollections.ints.IntCollection;
import com.github.wrdlbrnft.primitivecollections.ints.IntList;
import com.github.wrdlbrnft.primitivecollections.ints.IntSet;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created with Android Studio<br>
 * User: Xaver<br>
 * Date: 09/12/2016
 */
public class IntCollectionTests {

    @Test
    public void testIntListBasic() {
        final IntCollection collection = new IntList();
        TestHelpers.fillCollection(collection, TestHelpers.UNIQUE_INTS);
        final int[] actual = collection.toArray();
        final int[] expected = TestHelpers.UNIQUE_INTS;
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void testIntListComplex() {
        final IntCollection collection = new IntList();
        TestHelpers.fillCollection(collection, TestHelpers.UNIQUE_INTS);

        final int[] result = new int[collection.getSize()];
        for (int i = 0, count = collection.getSize(); i < count; i++) {
            result[i] = collection.get(i);
        }

        Assert.assertTrue(collection.contains(TestHelpers.CONTAINED_INT));
        Assert.assertFalse(collection.contains(TestHelpers.OTHER_INT));
        Assert.assertArrayEquals(TestHelpers.UNIQUE_INTS, result);
    }

    @Test
    public void testIntSetBasic() {
        final IntCollection collection = new IntSet();
        TestHelpers.fillCollection(collection, TestHelpers.UNIQUE_INTS);
        final int[] actual = collection.toArray();
        final int[] expected = TestHelpers.UNIQUE_INTS;
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void testIntSetComplex() {
        final IntCollection collection = new IntSet();
        TestHelpers.fillCollection(collection, TestHelpers.UNIQUE_INTS);

        final int[] result = new int[collection.getSize()];
        for (int i = 0, count = collection.getSize(); i < count; i++) {
            result[i] = collection.get(i);
        }

        Assert.assertTrue(collection.contains(TestHelpers.CONTAINED_INT));
        Assert.assertFalse(collection.contains(TestHelpers.OTHER_INT));
        Assert.assertArrayEquals(TestHelpers.UNIQUE_INTS, result);
    }
}
