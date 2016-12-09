package com.github.wrdlbrnft.primitivecollections.doubles;

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
public interface DoubleCollection extends PrimitiveCollection {
    boolean contains(double value);
    boolean add(double value);
    double get(int index);
    double[] toArray();
}
