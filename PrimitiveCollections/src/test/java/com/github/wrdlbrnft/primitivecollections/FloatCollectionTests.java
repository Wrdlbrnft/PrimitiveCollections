package com.github.wrdlbrnft.primitivecollections;

import com.github.wrdlbrnft.primitivecollections.floats.FloatCollection;
import com.github.wrdlbrnft.primitivecollections.floats.FloatList;
import com.github.wrdlbrnft.primitivecollections.floats.FloatSet;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created with Android Studio<br>
 * User: Xaver<br>
 * Date: 09/12/2016
 */
public class FloatCollectionTests {

    @Test
    public void testFloatListBasic() {
        final FloatCollection collection = new FloatList();
        TestHelpers.fillCollection(collection, TestHelpers.UNIQUE_FLOATS);
        final float[] actual = collection.toArray();
        final float[] expected = TestHelpers.UNIQUE_FLOATS;
        Assert.assertArrayEquals(expected, actual, 0.0f);
    }

    @Test
    public void testFloatListComplex() {
        final FloatCollection collection = new FloatList();
        TestHelpers.fillCollection(collection, TestHelpers.UNIQUE_FLOATS);

        final float[] result = new float[collection.getSize()];
        for (int i = 0, count = collection.getSize(); i < count; i++) {
            result[i] = collection.get(i);
        }

        Assert.assertTrue(collection.contains(TestHelpers.CONTAINED_FLOAT));
        Assert.assertFalse(collection.contains(TestHelpers.OTHER_FLOAT));
        Assert.assertArrayEquals(TestHelpers.UNIQUE_FLOATS, result, 0.0f);
    }

    @Test
    public void testFloatSetBasic() {
        final FloatCollection collection = new FloatSet();
        TestHelpers.fillCollection(collection, TestHelpers.UNIQUE_FLOATS);
        final float[] actual = collection.toArray();
        final float[] expected = TestHelpers.UNIQUE_FLOATS;
        Assert.assertArrayEquals(expected, actual, 0.0f);
    }

    @Test
    public void testFloatSetComplex() {
        final FloatCollection collection = new FloatSet();
        TestHelpers.fillCollection(collection, TestHelpers.UNIQUE_FLOATS);

        final float[] result = new float[collection.getSize()];
        for (int i = 0, count = collection.getSize(); i < count; i++) {
            result[i] = collection.get(i);
        }

        Assert.assertTrue(collection.contains(TestHelpers.CONTAINED_LONG));
        Assert.assertFalse(collection.contains(TestHelpers.OTHER_LONG));
        Assert.assertArrayEquals(TestHelpers.UNIQUE_FLOATS, result, 0.0f);
    }
}
