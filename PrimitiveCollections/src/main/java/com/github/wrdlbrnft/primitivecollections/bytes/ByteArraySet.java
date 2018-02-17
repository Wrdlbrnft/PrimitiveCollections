package com.github.wrdlbrnft.primitivecollections.bytes;

import com.github.wrdlbrnft.primitivecollections.utils.CollectionHelpers;
import com.github.wrdlbrnft.proguardannotations.KeepClass;

/**
 * Created with Android Studio<br>
 * User: Xaver<br>
 * Date: 05/12/2016
 */
@KeepClass
public class ByteArraySet implements ByteSet {

    private byte[] mValues;
    private int mSize = 0;

    public ByteArraySet(int capacity) {
        mValues = new byte[capacity];
    }

    public ByteArraySet() {
        this(CollectionHelpers.DEFAULT_CAPACITY);
    }

    @Override
    public boolean contains(byte value) {
        final int index = CollectionHelpers.binarySearch(mValues, mSize, value);
        return index >= 0;
    }

    @Override
    public boolean add(byte value) {
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
    public byte get(int index) {
        return mValues[index];
    }

    @Override
    public int size() {
        return mSize;
    }

    @Override
    public byte[] toArray() {
        final byte[] result = new byte[mSize];
        System.arraycopy(mValues, 0, result, 0, mSize);
        return result;
    }

    private static byte[] insert(byte[] array, int currentSize, int index, byte element) {
        if (currentSize + 1 <= array.length) {
            System.arraycopy(array, index, array, index + 1, currentSize - index);
            array[index] = element;
            return array;
        }

        final byte[] newArray = new byte[CollectionHelpers.growSize(currentSize)];
        System.arraycopy(array, 0, newArray, 0, index);
        newArray[index] = element;
        System.arraycopy(array, index, newArray, index + 1, array.length - index);
        return newArray;
    }
}
