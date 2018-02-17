package com.github.wrdlbrnft.primitivecollections;

import com.github.wrdlbrnft.primitivecollections.floats.FloatArrayList;
import com.github.wrdlbrnft.primitivecollections.floats.FloatArraySet;
import com.github.wrdlbrnft.primitivecollections.floats.FloatList;
import com.github.wrdlbrnft.primitivecollections.floats.FloatSet;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created with Android Studio<br>
 * User: Xaver<br>
 * Date: 09/12/2016
 */
public class FloatCollectionTests {

    private static final float[] UNIQUE_FLOATS = new float[]{
            1.0f, 2.0f, 3.0f, 4.0f, 5.0f, 6.0f, 7.0f, 8.0f, 9.0f, 10.0f,
            11.0f, 12.0f, 13.0f, 14.0f, 15.0f, 16.0f, 17.0f, 18.0f, 19.0f,
            20.0f, 21.0f, 22.0f, 23.0f, 24.0f, 25.0f, 26.0f
    };

    @Test
    public void testFloatArrayListAdd() {
        final FloatList collection = new FloatArrayList();
        for (float b : UNIQUE_FLOATS) {
            collection.add(b);
        }
        Assert.assertThat(collection.toArray(), CoreMatchers.equalTo(UNIQUE_FLOATS));
    }

    @Test
    public void testFloatArrayListContains() {
        final FloatList collection = new FloatArrayList();
        for (float b : UNIQUE_FLOATS) {
            collection.add(b);
        }

        for (float b : UNIQUE_FLOATS) {
            Assert.assertThat(collection.contains(b), CoreMatchers.is(true));
        }
    }

    @Test
    public void testFloatArraySetAdd() {
        final FloatSet collection = new FloatArraySet();
        for (float b : UNIQUE_FLOATS) {
            collection.add(b);
        }
        for (float b : UNIQUE_FLOATS) {
            collection.add(b);
        }
        Assert.assertThat(collection.toArray(), CoreMatchers.equalTo(UNIQUE_FLOATS));
    }

    @Test
    public void testFloatArraySetContains() {
        final FloatSet collection = new FloatArraySet();
        for (float b : UNIQUE_FLOATS) {
            collection.add(b);
        }
        for (float b : UNIQUE_FLOATS) {
            Assert.assertThat(collection.contains(b), CoreMatchers.is(true));
        }
    }
}
