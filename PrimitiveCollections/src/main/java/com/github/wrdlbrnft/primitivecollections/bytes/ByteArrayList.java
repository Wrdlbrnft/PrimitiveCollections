package com.github.wrdlbrnft.primitivecollections.bytes;

import com.github.wrdlbrnft.primitivecollections.utils.CollectionHelpers;
import com.github.wrdlbrnft.proguardannotations.KeepClass;

/**
 * Created with Android Studio<br>
 * User: Xaver<br>
 * Date: 09/12/2016
 */
@KeepClass
public class ByteArrayList implements ByteList {

    private byte[] mValues;
    private int mSize = 0;

    public ByteArrayList(int capacity) {
        mValues = new byte[capacity];
    }

    public ByteArrayList() {
        this(CollectionHelpers.DEFAULT_CAPACITY);
    }

    public int size() {
        return mSize;
    }

    @Override
    public boolean contains(byte value) {
        for (int i : mValues) {
            if (i == value) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean add(byte value) {
        while (mValues.length <= mSize) {
            final byte[] newArray = new byte[CollectionHelpers.growSize(mSize)];
            System.arraycopy(mValues, 0, newArray, 0, mValues.length);
            mValues = newArray;
        }
        mValues[mSize++] = value;
        return true;
    }

    @Override
    public byte get(int index) {
        return mValues[index];
    }

    @Override
    public byte[] toArray() {
        final byte[] result = new byte[mSize];
        System.arraycopy(mValues, 0, result, 0, mSize);
        return result;
    }
}
