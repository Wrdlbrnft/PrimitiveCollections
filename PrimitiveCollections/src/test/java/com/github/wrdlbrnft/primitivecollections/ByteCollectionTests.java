package com.github.wrdlbrnft.primitivecollections;

import com.github.wrdlbrnft.primitivecollections.bytes.ByteArrayList;
import com.github.wrdlbrnft.primitivecollections.bytes.ByteArraySet;
import com.github.wrdlbrnft.primitivecollections.bytes.ByteList;
import com.github.wrdlbrnft.primitivecollections.bytes.ByteSet;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created with Android Studio<br>
 * User: Xaver<br>
 * Date: 09/12/2016
 */
public class ByteCollectionTests {

    private static final byte[] UNIQUE_BYTES = new byte[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26};

    @Test
    public void testByteArrayListAdd() {
        final ByteList collection = new ByteArrayList();
        for (byte b : UNIQUE_BYTES) {
            collection.add(b);
        }
        Assert.assertThat(collection.toArray(), CoreMatchers.equalTo(UNIQUE_BYTES));
    }

    @Test
    public void testByteArrayListContains() {
        final ByteList collection = new ByteArrayList();
        for (byte b : UNIQUE_BYTES) {
            collection.add(b);
        }

        for (byte b : UNIQUE_BYTES) {
            Assert.assertThat(collection.contains(b), CoreMatchers.is(true));
        }
    }

    @Test
    public void testByteArraySetAdd() {
        final ByteSet collection = new ByteArraySet();
        for (byte b : UNIQUE_BYTES) {
            collection.add(b);
        }
        for (byte b : UNIQUE_BYTES) {
            collection.add(b);
        }
        Assert.assertThat(collection.toArray(), CoreMatchers.equalTo(UNIQUE_BYTES));
    }

    @Test
    public void testByteArraySetContains() {
        final ByteSet collection = new ByteArraySet();
        for (byte b : UNIQUE_BYTES) {
            collection.add(b);
        }
        for (byte b : UNIQUE_BYTES) {
            Assert.assertThat(collection.contains(b), CoreMatchers.is(true));
        }
    }
}
