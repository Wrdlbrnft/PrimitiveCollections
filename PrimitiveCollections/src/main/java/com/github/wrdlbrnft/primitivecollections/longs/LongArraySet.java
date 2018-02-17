package com.github.wrdlbrnft.primitivecollections.longs;

import com.github.wrdlbrnft.primitivecollections.utils.CollectionHelpers;
import com.github.wrdlbrnft.proguardannotations.KeepClass;

/**
 * Created with Android Studio<br>
 * User: Xaver<br>
 * Date: 05/12/2016
 */
@KeepClass
public class LongArraySet implements LongSet {

    private long[] mValues;
    private int mSize = 0;

    public LongArraySet(int capacity) {
        mValues = new long[capacity];
    }

    public LongArraySet() {
        this(CollectionHelpers.DEFAULT_CAPACITY);
    }

    @Override
    public boolean contains(long value) {
        final long index = CollectionHelpers.binarySearch(mValues, mSize, value);
        return index >= 0;
    }

    @Override
    public boolean add(long value) {
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
    public long get(int index) {
        return mValues[index];
    }

    @Override
    public int size() {
        return mSize;
    }

    @Override
    public long[] toArray() {
        final long[] result = new long[mSize];
        System.arraycopy(mValues, 0, result, 0, mSize);
        return result;
    }

    private static long[] insert(long[] array, int currentSize, int index, long element) {
        if (currentSize + 1 <= array.length) {
            System.arraycopy(array, index, array, index + 1, currentSize - index);
            array[index] = element;
            return array;
        }

        final long[] newArray = new long[CollectionHelpers.growSize(currentSize)];
        System.arraycopy(array, 0, newArray, 0, index);
        newArray[index] = element;
        System.arraycopy(array, index, newArray, index + 1, array.length - index);
        return newArray;
    }
}
