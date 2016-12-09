package com.github.wrdlbrnft.primitivecollections.floats;

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
public interface FloatCollection extends PrimitiveCollection {
    boolean contains(float value);
    boolean add(float value);
    float get(int index);
    float[] toArray();
}
