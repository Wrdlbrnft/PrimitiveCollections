package com.github.wrdlbrnft.primitivecollections.floats;

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
public class FloatList implements FloatCollection {

    private float[] mValues;
    private int mSize = 0;

    public FloatList(int capacity) {
        mValues = new float[capacity];
    }

    public FloatList() {
        this(CollectionHelpers.DEFAULT_CAPACITY);
    }

    public int getSize() {
        return mSize;
    }

    @Override
    public boolean contains(float value) {
        for (float f : mValues) {
            if (f == value) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean add(float value) {
        while (mValues.length <= mSize) {
            final float[] newArray = new float[CollectionHelpers.growSize(mSize)];
            System.arraycopy(mValues, 0, newArray, 0, mValues.length);
            mValues = newArray;
        }
        mValues[mSize++] = value;
        return true;
    }

    @Override
    public float get(int index) {
        return mValues[index];
    }

    @Override
    public float[] toArray() {
        final float[] result = new float[mSize];
        System.arraycopy(mValues, 0, result, 0, mSize);
        return result;
    }
}
