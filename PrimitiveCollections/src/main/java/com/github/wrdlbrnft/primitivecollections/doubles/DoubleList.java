package com.github.wrdlbrnft.primitivecollections.doubles;

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
public class DoubleList implements DoubleCollection {

    private double[] mValues;
    private int mSize = 0;

    public DoubleList(int capacity) {
        mValues = new double[capacity];
    }

    public DoubleList() {
        this(CollectionHelpers.DEFAULT_CAPACITY);
    }

    public int getSize() {
        return mSize;
    }

    @Override
    public boolean contains(double value) {
        for (double f : mValues) {
            if (f == value) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean add(double value) {
        while (mValues.length <= mSize) {
            final double[] newArray = new double[CollectionHelpers.growSize(mSize)];
            System.arraycopy(mValues, 0, newArray, 0, mValues.length);
            mValues = newArray;
        }
        mValues[mSize++] = value;
        return true;
    }

    @Override
    public double get(int index) {
        return mValues[index];
    }

    @Override
    public double[] toArray() {
        final double[] result = new double[mSize];
        System.arraycopy(mValues, 0, result, 0, mSize);
        return result;
    }
}
