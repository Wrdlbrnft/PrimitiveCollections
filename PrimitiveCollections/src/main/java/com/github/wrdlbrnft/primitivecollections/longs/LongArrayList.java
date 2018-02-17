package com.github.wrdlbrnft.primitivecollections.longs;

import com.github.wrdlbrnft.primitivecollections.utils.CollectionHelpers;
import com.github.wrdlbrnft.proguardannotations.KeepClass;

/**
 * Created with Android Studio<br>
 * User: Xaver<br>
 * Date: 09/12/2016
 */
@KeepClass
public class LongArrayList implements LongList {

    private long[] mValues;
    private int mSize = 0;

    public LongArrayList(int capacity) {
        mValues = new long[capacity];
    }

    public LongArrayList() {
        this(CollectionHelpers.DEFAULT_CAPACITY);
    }

    public int size() {
        return mSize;
    }

    @Override
    public boolean contains(long value) {
        for (long i : mValues) {
            if (i == value) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean add(long value) {
        while (mValues.length <= mSize) {
            final long[] newArray = new long[CollectionHelpers.growSize(mSize)];
            System.arraycopy(mValues, 0, newArray, 0, mValues.length);
            mValues = newArray;
        }
        mValues[mSize++] = value;
        return true;
    }

    @Override
    public long get(int index) {
        return mValues[index];
    }

    @Override
    public long[] toArray() {
        final long[] result = new long[mSize];
        System.arraycopy(mValues, 0, result, 0, mSize);
        return result;
    }
}
