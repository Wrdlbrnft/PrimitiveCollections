package com.github.wrdlbrnft.primitivecollections.ints;

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
public class IntSet implements IntCollection {

    private int[] mValues;
    private int mSize = 0;

    public IntSet(int capacity) {
        mValues = new int[capacity];
    }

    public IntSet() {
        this(CollectionHelpers.DEFAULT_CAPACITY);
    }

    @Override
    public boolean contains(int value) {
        final int index = CollectionHelpers.binarySearch(mValues, mSize, value);
        return index >= 0;
    }

    @Override
    public boolean add(int value) {
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
    public int get(int index) {
        return mValues[index];
    }

    @Override
    public int getSize() {
        return mSize;
    }

    @Override
    public int[] toArray() {
        final int[] result = new int[mSize];
        System.arraycopy(mValues, 0, result, 0, mSize);
        return result;
    }

    private static int[] insert(int[] array, int currentSize, int index, int element) {
        if (currentSize + 1 <= array.length) {
            System.arraycopy(array, index, array, index + 1, currentSize - index);
            array[index] = element;
            return array;
        }

        final int[] newArray = new int[CollectionHelpers.growSize(currentSize)];
        System.arraycopy(array, 0, newArray, 0, index);
        newArray[index] = element;
        System.arraycopy(array, index, newArray, index + 1, array.length - index);
        return newArray;
    }
}
