package com.github.wrdlbrnft.primitivecollections;

import com.github.wrdlbrnft.primitivecollections.longs.LongCollection;
import com.github.wrdlbrnft.primitivecollections.longs.LongList;
import com.github.wrdlbrnft.primitivecollections.longs.LongSet;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created with Android Studio<br>
 * User: Xaver<br>
 * Date: 09/12/2016
 */
public class LongCollectionTests {

    @Test
    public void testLongListBasic() {
        final LongCollection collection = new LongList();
        TestHelpers.fillCollection(collection, TestHelpers.UNIQUE_LONGS);
        final long[] actual = collection.toArray();
        final long[] expected = TestHelpers.UNIQUE_LONGS;
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void testLongListComplex() {
        final LongCollection collection = new LongList();
        TestHelpers.fillCollection(collection, TestHelpers.UNIQUE_LONGS);

        final long[] result = new long[collection.getSize()];
        for (int i = 0, count = collection.getSize(); i < count; i++) {
            result[i] = collection.get(i);
        }

        Assert.assertTrue(collection.contains(TestHelpers.CONTAINED_LONG));
        Assert.assertFalse(collection.contains(TestHelpers.OTHER_LONG));
        Assert.assertArrayEquals(TestHelpers.UNIQUE_LONGS, result);
    }

    @Test
    public void testLongSetBasic() {
        final LongCollection collection = new LongSet();
        TestHelpers.fillCollection(collection, TestHelpers.UNIQUE_LONGS);
        final long[] actual = collection.toArray();
        final long[] expected = TestHelpers.UNIQUE_LONGS;
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void testLongSetComplex() {
        final LongCollection collection = new LongSet();
        TestHelpers.fillCollection(collection, TestHelpers.UNIQUE_LONGS);

        final long[] result = new long[collection.getSize()];
        for (int i = 0, count = collection.getSize(); i < count; i++) {
            result[i] = collection.get(i);
        }

        Assert.assertTrue(collection.contains(TestHelpers.CONTAINED_LONG));
        Assert.assertFalse(collection.contains(TestHelpers.OTHER_LONG));
        Assert.assertArrayEquals(TestHelpers.UNIQUE_LONGS, result);
    }
}
