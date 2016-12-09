package com.github.wrdlbrnft.primitivecollections.ints;

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
public class IntList implements IntCollection {

    private int[] mValues;
    private int mSize = 0;

    public IntList(int capacity) {
        mValues = new int[capacity];
    }

    public IntList() {
        this(CollectionHelpers.DEFAULT_CAPACITY);
    }

    public int getSize() {
        return mSize;
    }

    @Override
    public boolean contains(int value) {
        for (int i : mValues) {
            if (i == value) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean add(int value) {
        while (mValues.length <= mSize) {
            final int[] newArray = new int[CollectionHelpers.growSize(mSize)];
            System.arraycopy(mValues, 0, newArray, 0, mValues.length);
            mValues = newArray;
        }
        mValues[mSize++] = value;
        return true;
    }

    @Override
    public int get(int index) {
        return mValues[index];
    }

    @Override
    public int[] toArray() {
        final int[] result = new int[mSize];
        System.arraycopy(mValues, 0, result, 0, mSize);
        return result;
    }
}
