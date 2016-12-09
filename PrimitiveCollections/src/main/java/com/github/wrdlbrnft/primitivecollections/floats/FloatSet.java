package com.github.wrdlbrnft.primitivecollections.floats;

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
public class FloatSet implements FloatCollection {

    private float[] mValues;
    private int mSize = 0;

    public FloatSet(int capacity) {
        mValues = new float[capacity];
    }

    public FloatSet() {
        this(CollectionHelpers.DEFAULT_CAPACITY);
    }

    @Override
    public boolean contains(float value) {
        final long index = CollectionHelpers.binarySearch(mValues, mSize, value);
        return index >= 0;
    }

    @Override
    public boolean add(float value) {
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
    public float get(int index) {
        return mValues[index];
    }

    @Override
    public int getSize() {
        return mSize;
    }

    @Override
    public float[] toArray() {
        final float[] result = new float[mSize];
        System.arraycopy(mValues, 0, result, 0, mSize);
        return result;
    }

    private static float[] insert(float[] array, int currentSize, int index, float element) {
        if (currentSize + 1 <= array.length) {
            System.arraycopy(array, index, array, index + 1, currentSize - index);
            array[index] = element;
            return array;
        }

        final float[] newArray = new float[CollectionHelpers.growSize(currentSize)];
        System.arraycopy(array, 0, newArray, 0, index);
        newArray[index] = element;
        System.arraycopy(array, index, newArray, index + 1, array.length - index);
        return newArray;
    }
}
