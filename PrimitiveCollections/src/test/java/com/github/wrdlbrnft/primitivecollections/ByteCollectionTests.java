package com.github.wrdlbrnft.primitivecollections;

import com.github.wrdlbrnft.primitivecollections.bytes.ByteCollection;
import com.github.wrdlbrnft.primitivecollections.bytes.ByteList;
import com.github.wrdlbrnft.primitivecollections.bytes.ByteSet;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created with Android Studio<br>
 * User: Xaver<br>
 * Date: 09/12/2016
 */
public class ByteCollectionTests {

    @Test
    public void testByteListBasic() {
        final ByteCollection collection = new ByteList();
        TestHelpers.fillCollection(collection, TestHelpers.UNIQUE_BYTES);
        final byte[] actual = collection.toArray();
        final byte[] expected = TestHelpers.UNIQUE_BYTES;
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void testByteListComplex() {
        final ByteCollection collection = new ByteList();
        TestHelpers.fillCollection(collection, TestHelpers.UNIQUE_BYTES);

        final byte[] result = new byte[collection.getSize()];
        for (int i = 0, count = collection.getSize(); i < count; i++) {
            result[i] = collection.get(i);
        }

        Assert.assertTrue(collection.contains(TestHelpers.CONTAINED_BYTE));
        Assert.assertFalse(collection.contains(TestHelpers.OTHER_BYTE));
        Assert.assertArrayEquals(TestHelpers.UNIQUE_BYTES, result);
    }

    @Test
    public void testByteSetBasic() {
        final ByteCollection collection = new ByteSet();
        TestHelpers.fillCollection(collection, TestHelpers.UNIQUE_BYTES);
        final byte[] actual = collection.toArray();
        final byte[] expected = TestHelpers.UNIQUE_BYTES;
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void testByteSetComplex() {
        final ByteCollection collection = new ByteSet();
        TestHelpers.fillCollection(collection, TestHelpers.UNIQUE_BYTES);

        final byte[] result = new byte[collection.getSize()];
        for (int i = 0, count = collection.getSize(); i < count; i++) {
            result[i] = collection.get(i);
        }

        Assert.assertTrue(collection.contains(TestHelpers.CONTAINED_BYTE));
        Assert.assertFalse(collection.contains(TestHelpers.OTHER_BYTE));
        Assert.assertArrayEquals(TestHelpers.UNIQUE_BYTES, result);
    }
}
