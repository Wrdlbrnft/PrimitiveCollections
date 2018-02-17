package com.github.wrdlbrnft.primitivecollections;

import com.github.wrdlbrnft.primitivecollections.chars.CharArrayList;
import com.github.wrdlbrnft.primitivecollections.chars.CharArraySet;
import com.github.wrdlbrnft.primitivecollections.chars.CharList;
import com.github.wrdlbrnft.primitivecollections.chars.CharSet;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created with Android Studio<br>
 * User: Xaver<br>
 * Date: 09/12/2016
 */
public class CharCollectionTests {

    private static final char[] UNIQUE_CHARS = new char[]{'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

    @Test
    public void testCharArrayListAdd() {
        final CharList collection = new CharArrayList();
        for (char b : UNIQUE_CHARS) {
            collection.add(b);
        }
        Assert.assertThat(collection.toArray(), CoreMatchers.equalTo(UNIQUE_CHARS));
    }

    @Test
    public void testCharArrayListContains() {
        final CharList collection = new CharArrayList();
        for (char b : UNIQUE_CHARS) {
            collection.add(b);
        }

        for (char b : UNIQUE_CHARS) {
            Assert.assertThat(collection.contains(b), CoreMatchers.is(true));
        }
    }

    @Test
    public void testCharArraySetAdd() {
        final CharSet collection = new CharArraySet();
        for (char b : UNIQUE_CHARS) {
            collection.add(b);
        }
        for (char b : UNIQUE_CHARS) {
            collection.add(b);
        }
        Assert.assertThat(collection.toArray(), CoreMatchers.equalTo(UNIQUE_CHARS));
    }

    @Test
    public void testCharArraySetContains() {
        final CharSet collection = new CharArraySet();
        for (char b : UNIQUE_CHARS) {
            collection.add(b);
        }
        for (char b : UNIQUE_CHARS) {
            Assert.assertThat(collection.contains(b), CoreMatchers.is(true));
        }
    }
}
