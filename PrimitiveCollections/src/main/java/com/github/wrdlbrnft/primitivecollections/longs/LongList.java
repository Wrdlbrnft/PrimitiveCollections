package com.github.wrdlbrnft.primitivecollections.longs;

import com.github.wrdlbrnft.primitivecollections.utils.CollectionHelpers;
import com.github.wrdlbrnft.proguardannotations.KeepClass;
import com.github.wrdlbrnft.proguardannotations.KeepClassMembers;
import com.github.wrdlbrnft.proguardannotations.KeepSetting;

/**
 * Created with Android Studio<br>
 * User: Xaver<br>
 * Date: 09/12/2016
 */
@KeepClass
@KeepClassMembers(KeepSetting.PUBLIC_MEMBERS)
public class LongList implements LongCollection {

    private long[] mValues;
    private int mSize = 0;

    public LongList(int capacity) {
        mValues = new long[capacity];
    }

    public LongList() {
        this(CollectionHelpers.DEFAULT_CAPACITY);
    }

    public int getSize() {
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
