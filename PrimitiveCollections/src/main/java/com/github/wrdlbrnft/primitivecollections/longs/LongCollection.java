package com.github.wrdlbrnft.primitivecollections.longs;

import com.github.wrdlbrnft.primitivecollections.PrimitiveCollection;
import com.github.wrdlbrnft.proguardannotations.KeepClass;
import com.github.wrdlbrnft.proguardannotations.KeepClassMembers;

/**
 * Created with Android Studio<br>
 * User: Xaver<br>
 * Date: 09/12/2016
 */
@KeepClass
@KeepClassMembers
public interface LongCollection extends PrimitiveCollection {
    boolean contains(long value);
    boolean add(long value);
    long get(int index);
    long[] toArray();
}
