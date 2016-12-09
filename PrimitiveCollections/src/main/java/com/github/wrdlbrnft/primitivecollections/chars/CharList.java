package com.github.wrdlbrnft.primitivecollections.chars;

import com.github.wrdlbrnft.primitivecollections.utils.CollectionHelpers;

/**
 * Created with Android Studio<br>
 * User: Xaver<br>
 * Date: 09/12/2016
 */
public class CharList implements CharCollection {

    private char[] mValues;
    private int mSize = 0;

    public CharList(int capacity) {
        mValues = new char[capacity];
    }

    public CharList() {
        this(CollectionHelpers.DEFAULT_CAPACITY);
    }

    public int getSize() {
        return mSize;
    }

    @Override
    public boolean contains(char value) {
        for (int i : mValues) {
            if (i == value) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean add(char value) {
        while (mValues.length <= mSize) {
            final char[] newArray = new char[CollectionHelpers.growSize(mSize)];
            System.arraycopy(mValues, 0, newArray, 0, mValues.length);
            mValues = newArray;
        }
        mValues[mSize++] = value;
        return true;
    }

    @Override
    public char get(int index) {
        return mValues[index];
    }

    @Override
    public char[] toArray() {
        final char[] result = new char[mSize];
        System.arraycopy(mValues, 0, result, 0, mSize);
        return result;
    }
}
