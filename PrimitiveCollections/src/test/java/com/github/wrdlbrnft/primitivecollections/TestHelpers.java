package com.github.wrdlbrnft.primitivecollections;

import com.github.wrdlbrnft.primitivecollections.bytes.ByteCollection;
import com.github.wrdlbrnft.primitivecollections.chars.CharCollection;
import com.github.wrdlbrnft.primitivecollections.doubles.DoubleCollection;
import com.github.wrdlbrnft.primitivecollections.floats.FloatCollection;
import com.github.wrdlbrnft.primitivecollections.ints.IntCollection;
import com.github.wrdlbrnft.primitivecollections.longs.LongCollection;

/**
 * Created with Android Studio<br>
 * User: Xaver<br>
 * Date: 09/12/2016
 */
public class TestHelpers {

    public static final char[] UNIQUE_CHARS = new char[]{'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
    public static final char CONTAINED_CHAR = 'b';
    public static final char OTHER_CHAR = 'B';

    public static final int[] UNIQUE_INTS = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26};
    public static final int CONTAINED_INT = 2;
    public static final int OTHER_INT = 123;

    public static final long[] UNIQUE_LONGS = new long[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26};
    public static final long CONTAINED_LONG = 2;
    public static final long OTHER_LONG = 123;

    public static final float[] UNIQUE_FLOATS = new float[]{
            1.0f, 2.0f, 3.0f, 4.0f, 5.0f, 6.0f, 7.0f, 8.0f, 9.0f, 10.0f,
            11.0f, 12.0f, 13.0f, 14.0f, 15.0f, 16.0f, 17.0f, 18.0f, 19.0f,
            20.0f, 21.0f, 22.0f, 23.0f, 24.0f, 25.0f, 26.0f
    };
    public static final float CONTAINED_FLOAT = 2.0f;
    public static final float OTHER_FLOAT = 123.0f;

    public static final double[] UNIQUE_DOUBLES = new double[]{
            1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0, 10.0,
            11.0, 12.0, 13.0, 14.0, 15.0, 16.0, 17.0, 18.0, 19.0,
            20.0, 21.0, 22.0, 23.0, 24.0, 25.0, 26.0
    };
    public static final double CONTAINED_DOUBLE = 2.0;
    public static final double OTHER_DOUBLE = 123.0;

    public static final byte[] UNIQUE_BYTES = new byte[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26};
    public static final byte CONTAINED_BYTE = 2;
    public static final byte OTHER_BYTE = 123;

    public static void fillCollection(CharCollection collection, char[] chars) {
        for (char c : chars) {
            collection.add(c);
        }
    }

    public static void fillCollection(IntCollection collection, int[] ints) {
        for (int i : ints) {
            collection.add(i);
        }
    }

    public static void fillCollection(ByteCollection collection, byte[] bytes) {
        for (byte b : bytes) {
            collection.add(b);
        }
    }

    public static void fillCollection(LongCollection collection, long[] longs) {
        for (long l : longs) {
            collection.add(l);
        }
    }

    public static void fillCollection(FloatCollection collection, float[] floats) {
        for (float f : floats) {
            collection.add(f);
        }
    }

    public static void fillCollection(DoubleCollection collection, double[] doubles) {
        for (double d : doubles) {
            collection.add(d);
        }
    }
}