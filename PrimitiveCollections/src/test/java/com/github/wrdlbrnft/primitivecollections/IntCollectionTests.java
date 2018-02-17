package com.github.wrdlbrnft.primitivecollections;

import com.github.wrdlbrnft.primitivecollections.ints.IntArrayList;
import com.github.wrdlbrnft.primitivecollections.ints.IntArraySet;
import com.github.wrdlbrnft.primitivecollections.ints.IntList;
import com.github.wrdlbrnft.primitivecollections.ints.IntSet;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created with Android Studio<br>
 * User: Xaver<br>
 * Date: 09/12/2016
 */
public class IntCollectionTests {

    private static final int[] UNIQUE_INTS = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26};

    @Test
    public void testIntArrayListAdd() {
        final IntList collection = new IntArrayList();
        for (int b : UNIQUE_INTS) {
            collection.add(b);
        }
        Assert.assertThat(collection.toArray(), CoreMatchers.equalTo(UNIQUE_INTS));
    }

    @Test
    public void testIntArrayListContains() {
        final IntList collection = new IntArrayList();
        for (int b : UNIQUE_INTS) {
            collection.add(b);
        }

        for (int b : UNIQUE_INTS) {
            Assert.assertThat(collection.contains(b), CoreMatchers.is(true));
        }
    }

    @Test
    public void testIntArraySetAdd() {
        final IntSet collection = new IntArraySet();
        for (int b : UNIQUE_INTS) {
            collection.add(b);
        }
        for (int b : UNIQUE_INTS) {
            collection.add(b);
        }
        Assert.assertThat(collection.toArray(), CoreMatchers.equalTo(UNIQUE_INTS));
    }

    @Test
    public void testIntArraySetContains() {
        final IntSet collection = new IntArraySet();
        for (int b : UNIQUE_INTS) {
            collection.add(b);
        }
        for (int b : UNIQUE_INTS) {
            Assert.assertThat(collection.contains(b), CoreMatchers.is(true));
        }
    }
}
