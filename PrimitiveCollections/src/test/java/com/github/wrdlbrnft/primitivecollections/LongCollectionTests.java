package com.github.wrdlbrnft.primitivecollections;

import com.github.wrdlbrnft.primitivecollections.longs.LongArrayList;
import com.github.wrdlbrnft.primitivecollections.longs.LongArraySet;
import com.github.wrdlbrnft.primitivecollections.longs.LongList;
import com.github.wrdlbrnft.primitivecollections.longs.LongSet;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created with Android Studio<br>
 * User: Xaver<br>
 * Date: 09/12/2016
 */
public class LongCollectionTests {

    private static final long[] UNIQUE_LONGS = new long[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26};

    @Test
    public void testLongArrayListAdd() {
        final LongList collection = new LongArrayList();
        for (long b : UNIQUE_LONGS) {
            collection.add(b);
        }
        Assert.assertThat(collection.toArray(), CoreMatchers.equalTo(UNIQUE_LONGS));
    }

    @Test
    public void testLongArrayListContains() {
        final LongList collection = new LongArrayList();
        for (long b : UNIQUE_LONGS) {
            collection.add(b);
        }

        for (long b : UNIQUE_LONGS) {
            Assert.assertThat(collection.contains(b), CoreMatchers.is(true));
        }
    }

    @Test
    public void testLongArraySetAdd() {
        final LongSet collection = new LongArraySet();
        for (long b : UNIQUE_LONGS) {
            collection.add(b);
        }
        for (long b : UNIQUE_LONGS) {
            collection.add(b);
        }
        Assert.assertThat(collection.toArray(), CoreMatchers.equalTo(UNIQUE_LONGS));
    }

    @Test
    public void testLongArraySetContains() {
        final LongSet collection = new LongArraySet();
        for (long b : UNIQUE_LONGS) {
            collection.add(b);
        }
        for (long b : UNIQUE_LONGS) {
            Assert.assertThat(collection.contains(b), CoreMatchers.is(true));
        }
    }
}
