package com.github.wrdlbrnft.primitivecollections.chars;

import com.github.wrdlbrnft.primitivecollections.utils.CollectionHelpers;

/**
 * Created with Android Studio<br>
 * User: Xaver<br>
 * Date: 05/12/2016
 */
public class CharSet implements CharCollection {

    private char[] mValues;
    private int mSize = 0;

    public CharSet(int capacity) {
        mValues = new char[capacity];
    }

    public CharSet() {
        this(CollectionHelpers.DEFAULT_CAPACITY);
    }

    @Override
    public boolean contains(char value) {
        final int index = CollectionHelpers.binarySearch(mValues, mSize, value);
        return index >= 0;
    }

    @Override
    public boolean add(char value) {
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
    public char get(int index) {
        return mValues[index];
    }

    @Override
    public int getSize() {
        return mSize;
    }

    @Override
    public char[] toArray() {
        final char[] result = new char[mSize];
        System.arraycopy(mValues, 0, result, 0, mSize);
        return result;
    }

    private static char[] insert(char[] array, int currentSize, int index, char element) {
        if (currentSize + 1 <= array.length) {
            System.arraycopy(array, index, array, index + 1, currentSize - index);
            array[index] = element;
            return array;
        }

        final char[] newArray = new char[CollectionHelpers.growSize(currentSize)];
        System.arraycopy(array, 0, newArray, 0, index);
        newArray[index] = element;
        System.arraycopy(array, index, newArray, index + 1, array.length - index);
        return newArray;
    }
}
