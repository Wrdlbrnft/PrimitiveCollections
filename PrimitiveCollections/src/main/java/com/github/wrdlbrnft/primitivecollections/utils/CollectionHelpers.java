package com.github.wrdlbrnft.primitivecollections.utils;

public class CollectionHelpers {

    public static final int DEFAULT_CAPACITY = 8;

    public static int growSize(int currentSize) {
        return currentSize <= 4 ? DEFAULT_CAPACITY : currentSize * 2;
    }

    public static int binarySearch(int[] array, int size, int value) {
        int lo = 0;
        int hi = size - 1;

        while (lo <= hi) {
            final int mid = (lo + hi) >>> 1;
            final int midVal = array[mid];

            if (midVal < value) {
                lo = mid + 1;
            } else if (midVal > value) {
                hi = mid - 1;
            } else {
                return mid;
            }
        }
        return ~lo;
    }

    public static int binarySearch(long[] array, int size, long value) {
        int lo = 0;
        int hi = size - 1;

        while (lo <= hi) {
            final int mid = (lo + hi) >>> 1;
            final long midVal = array[mid];

            if (midVal < value) {
                lo = mid + 1;
            } else if (midVal > value) {
                hi = mid - 1;
            } else {
                return mid;
            }
        }
        return ~lo;
    }

    public static int binarySearch(byte[] array, int size, byte value) {
        int lo = 0;
        int hi = size - 1;

        while (lo <= hi) {
            final int mid = (lo + hi) >>> 1;
            final byte midVal = array[mid];

            if (midVal < value) {
                lo = mid + 1;
            } else if (midVal > value) {
                hi = mid - 1;
            } else {
                return mid;
            }
        }
        return ~lo;
    }

    public static int binarySearch(char[] array, int size, char value) {
        int lo = 0;
        int hi = size - 1;

        while (lo <= hi) {
            final int mid = (lo + hi) >>> 1;
            final int midVal = array[mid];

            if (midVal < value) {
                lo = mid + 1;
            } else if (midVal > value) {
                hi = mid - 1;
            } else {
                return mid;
            }
        }
        return ~lo;
    }

    public static int binarySearch(float[] array, int size, float value) {
        int lo = 0;
        int hi = size - 1;

        while (lo <= hi) {
            final int mid = (lo + hi) >>> 1;
            final float midVal = array[mid];

            if (midVal < value) {
                lo = mid + 1;
            } else if (midVal > value) {
                hi = mid - 1;
            } else {
                return mid;
            }
        }
        return ~lo;
    }

    public static int binarySearch(double[] array, int size, double value) {
        int lo = 0;
        int hi = size - 1;

        while (lo <= hi) {
            final int mid = (lo + hi) >>> 1;
            final double midVal = array[mid];

            if (midVal < value) {
                lo = mid + 1;
            } else if (midVal > value) {
                hi = mid - 1;
            } else {
                return mid;
            }
        }
        return ~lo;
    }
}