package com.github.wrdlbrnft.primitivecollections;

import com.github.wrdlbrnft.primitivecollections.doubles.DoubleArrayList;
import com.github.wrdlbrnft.primitivecollections.doubles.DoubleArraySet;
import com.github.wrdlbrnft.primitivecollections.doubles.DoubleList;
import com.github.wrdlbrnft.primitivecollections.doubles.DoubleSet;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created with Android Studio<br>
 * User: Xaver<br>
 * Date: 09/12/2016
 */
public class DoubleCollectionTests {

    private static final double[] UNIQUE_DOUBLES = new double[]{
            1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0, 10.0,
            11.0, 12.0, 13.0, 14.0, 15.0, 16.0, 17.0, 18.0, 19.0,
            20.0, 21.0, 22.0, 23.0, 24.0, 25.0, 26.0
    };

    @Test
    public void testDoubleArrayListAdd() {
        final DoubleList collection = new DoubleArrayList();
        for (double b : UNIQUE_DOUBLES) {
            collection.add(b);
        }
        Assert.assertThat(collection.toArray(), CoreMatchers.equalTo(UNIQUE_DOUBLES));
    }

    @Test
    public void testDoubleArrayListContains() {
        final DoubleList collection = new DoubleArrayList();
        for (double b : UNIQUE_DOUBLES) {
            collection.add(b);
        }

        for (double b : UNIQUE_DOUBLES) {
            Assert.assertThat(collection.contains(b), CoreMatchers.is(true));
        }
    }

    @Test
    public void testDoubleArraySetAdd() {
        final DoubleSet collection = new DoubleArraySet();
        for (double b : UNIQUE_DOUBLES) {
            collection.add(b);
        }
        for (double b : UNIQUE_DOUBLES) {
            collection.add(b);
        }
        Assert.assertThat(collection.toArray(), CoreMatchers.equalTo(UNIQUE_DOUBLES));
    }

    @Test
    public void testDoubleArraySetContains() {
        final DoubleSet collection = new DoubleArraySet();
        for (double b : UNIQUE_DOUBLES) {
            collection.add(b);
        }
        for (double b : UNIQUE_DOUBLES) {
            Assert.assertThat(collection.contains(b), CoreMatchers.is(true));
        }
    }
}
