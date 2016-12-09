package com.github.wrdlbrnft.primitivecollections.doubles;

import com.github.wrdlbrnft.primitivecollections.utils.CollectionHelpers;
import com.github.wrdlbrnft.proguardannotations.KeepClass;
import com.github.wrdlbrnft.proguardannotations.KeepClassMembers;
import com.github.wrdlbrnft.proguardannotations.KeepSetting;

/**
 * Created with Android Studio<br>
 * User: Xaver<br>
 * Date: 05/12/2016
 */
@KeepClass
@KeepClassMembers(KeepSetting.PUBLIC_MEMBERS)
public class DoubleSet implements DoubleCollection {

    private double[] mValues;
    private int mSize = 0;

    public DoubleSet(int capacity) {
        mValues = new double[capacity];
    }

    public DoubleSet() {
        this(CollectionHelpers.DEFAULT_CAPACITY);
    }

    @Override
    public boolean contains(double value) {
        final long index = CollectionHelpers.binarySearch(mValues, mSize, value);
        return index >= 0;
    }

    @Override
    public boolean add(double value) {
        int index = CollectionHelpers.binarySearch(mValues, mSize, value);

        if (index >= 0) {
            return false;
        }
        index = ~index;

        mValues = insert(mValues, mSize, index, value);
        mSize++;

        return true;
    }

    @Override
    public double get(int index) {
        return mValues[index];
    }

    @Override
    public int getSize() {
        return mSize;
    }

    @Override
    public double[] toArray() {
        final double[] result = new double[mSize];
        System.arraycopy(mValues, 0, result, 0, mSize);
        return result;
    }

    private static double[] insert(double[] array, int currentSize, int index, double element) {
        if (currentSize + 1 <= array.length) {
            System.arraycopy(array, index, array, index + 1, currentSize - index);
            array[index] = element;
            return array;
        }

        final double[] newArray = new double[CollectionHelpers.growSize(currentSize)];
        System.arraycopy(array, 0, newArray, 0, index);
        newArray[index] = element;
        System.arraycopy(array, index, newArray, index + 1, array.length - index);
        return newArray;
    }
}
