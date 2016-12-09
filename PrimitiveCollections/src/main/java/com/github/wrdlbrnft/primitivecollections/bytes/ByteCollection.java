package com.github.wrdlbrnft.primitivecollections.bytes;

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
public interface ByteCollection extends PrimitiveCollection {
    boolean contains(byte value);
    boolean add(byte value);
    byte get(int index);
    byte[] toArray();
}
