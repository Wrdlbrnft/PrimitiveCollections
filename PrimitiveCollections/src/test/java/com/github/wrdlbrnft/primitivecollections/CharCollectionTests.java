package com.github.wrdlbrnft.primitivecollections;

import com.github.wrdlbrnft.primitivecollections.chars.CharCollection;
import com.github.wrdlbrnft.primitivecollections.chars.CharList;
import com.github.wrdlbrnft.primitivecollections.chars.CharSet;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created with Android Studio<br>
 * User: Xaver<br>
 * Date: 09/12/2016
 */
public class CharCollectionTests {

    @Test
    public void testCharListBasic() {
        final CharCollection collection = new CharList();
        TestHelpers.fillCollection(collection, TestHelpers.UNIQUE_CHARS);
        final char[] actual = collection.toArray();
        final char[] expected = TestHelpers.UNIQUE_CHARS;
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void testCharListComplex() {
        final CharCollection collection = new CharList();
        TestHelpers.fillCollection(collection, TestHelpers.UNIQUE_CHARS);

        final char[] result = new char[collection.getSize()];
        for (int i = 0, count = collection.getSize(); i < count; i++) {
            result[i] = collection.get(i);
        }

        Assert.assertTrue(collection.contains(TestHelpers.CONTAINED_CHAR));
        Assert.assertFalse(collection.contains(TestHelpers.OTHER_CHAR));
        Assert.assertArrayEquals(TestHelpers.UNIQUE_CHARS, result);
    }

    @Test
    public void testCharSetBasic() {
        final CharCollection collection = new CharSet();
        TestHelpers.fillCollection(collection, TestHelpers.UNIQUE_CHARS);
        final char[] actual = collection.toArray();
        final char[] expected = TestHelpers.UNIQUE_CHARS;
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void testCharSetComplex() {
        final CharCollection collection = new CharSet();
        TestHelpers.fillCollection(collection, TestHelpers.UNIQUE_CHARS);

        final char[] result = new char[collection.getSize()];
        for (int i = 0, count = collection.getSize(); i < count; i++) {
            result[i] = collection.get(i);
        }

        Assert.assertTrue(collection.contains(TestHelpers.CONTAINED_CHAR));
        Assert.assertFalse(collection.contains(TestHelpers.OTHER_CHAR));
        Assert.assertArrayEquals(TestHelpers.UNIQUE_CHARS, result);
    }
}
