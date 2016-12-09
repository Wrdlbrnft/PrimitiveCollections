package com.github.wrdlbrnft.primitivecollections.ints;

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
public interface IntCollection extends PrimitiveCollection {
    boolean contains(int value);
    boolean add(int value);
    int get(int index);
    int[] toArray();
}
