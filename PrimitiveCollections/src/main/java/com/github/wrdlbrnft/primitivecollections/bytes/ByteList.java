package com.github.wrdlbrnft.primitivecollections.bytes;

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
public class ByteList implements ByteCollection {

    private byte[] mValues;
    private int mSize = 0;

    public ByteList(int capacity) {
        mValues = new byte[capacity];
    }

    public ByteList() {
        this(CollectionHelpers.DEFAULT_CAPACITY);
    }

    public int getSize() {
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
