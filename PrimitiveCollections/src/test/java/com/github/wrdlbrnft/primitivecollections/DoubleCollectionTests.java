package com.github.wrdlbrnft.primitivecollections;

import com.github.wrdlbrnft.primitivecollections.doubles.DoubleCollection;
import com.github.wrdlbrnft.primitivecollections.doubles.DoubleList;
import com.github.wrdlbrnft.primitivecollections.doubles.DoubleSet;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created with Android Studio<br>
 * User: Xaver<br>
 * Date: 09/12/2016
 */
public class DoubleCollectionTests {

    @Test
    public void testDoubleListBasic() {
        final DoubleCollection collection = new DoubleList();
        TestHelpers.fillCollection(collection, TestHelpers.UNIQUE_DOUBLES);
        final double[] actual = collection.toArray();
        final double[] expected = TestHelpers.UNIQUE_DOUBLES;
        Assert.assertArrayEquals(expected, actual, 0.0);
    }

    @Test
    public void testDoubleListComplex() {
        final DoubleCollection collection = new DoubleList();
        TestHelpers.fillCollection(collection, TestHelpers.UNIQUE_DOUBLES);

        final double[] result = new double[collection.getSize()];
        for (int i = 0, count = collection.getSize(); i < count; i++) {
            result[i] = collection.get(i);
        }

        Assert.assertTrue(collection.contains(TestHelpers.CONTAINED_DOUBLE));
        Assert.assertFalse(collection.contains(TestHelpers.OTHER_DOUBLE));
        Assert.assertArrayEquals(TestHelpers.UNIQUE_DOUBLES, result, 0.0);
    }

    @Test
    public void testDoubleSetBasic() {
        final DoubleCollection collection = new DoubleSet();
        TestHelpers.fillCollection(collection, TestHelpers.UNIQUE_DOUBLES);
        final double[] actual = collection.toArray();
        final double[] expected = TestHelpers.UNIQUE_DOUBLES;
        Assert.assertArrayEquals(expected, actual, 0.0);
    }

    @Test
    public void testDoubleSetComplex() {
        final DoubleCollection collection = new DoubleSet();
        TestHelpers.fillCollection(collection, TestHelpers.UNIQUE_DOUBLES);

        final double[] result = new double[collection.getSize()];
        for (int i = 0, count = collection.getSize(); i < count; i++) {
            result[i] = collection.get(i);
        }

        Assert.assertTrue(collection.contains(TestHelpers.CONTAINED_DOUBLE));
        Assert.assertFalse(collection.contains(TestHelpers.OTHER_DOUBLE));
        Assert.assertArrayEquals(TestHelpers.UNIQUE_DOUBLES, result, 0.0);
    }
}
