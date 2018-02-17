# PrimitiveCollections

A lightweight library for efficient Sets and Lists of primitives.

 - **Efficient implementations**: The collection implementations are designed to guarantee best possible performance. Different collection implementations are specialized for different use cases.  
 - **Avoids boxing and unboxing**: No boxing or unboxing of the primitive values occurs anywhere in the library. That allows for best possible performance and more reliability.

[![Build Status](https://travis-ci.org/Wrdlbrnft/PrimitiveCollections.svg?branch=master)](https://travis-ci.org/Wrdlbrnft/PrimitiveCollections)

## How do I add it to my project?

Just add this dependency to your build.gradle file:

```groovy
compile 'com.github.wrdlbrnft:primitive-collections:0.3.0.2'
```

## How do I use it?

PrimitiveCollections includes collection implementations for the following primitives:

 - `int`
 - `long`
 - `char`
 - `byte`
 - `float`
 - `double`
 
For each type a separate collection interface with two implementations for either a list or a set exists:
 
 - `IntCollection`: `IntArraySet` and `IntArrayList`
 - `LongCollection`: `LongArraySet` and `LongArrayList`
 - `CharCollection`: `CharArraySet` and `CharArrayList`
 - `ByteCollection`: `ByteArraySet` and `ByteArrayList`
 - `FloatCollection`: `FloatArraySet` and `FloatArrayList`
 - `DoubleCollection`: `DoubleArraySet` and `DoubleArrayList`

All collections work exactly the same way, the only difference is the primitive type they are made for.

As an example:

```java
IntList list = new IntArrayList();

// Adding values to the collection
list.add(someValue);

// Checking if a value is contained in the collection
if(list.contains(someOtherValue)) {
    // Value is contained in the IntList
}

// Iterating over all items in the collection
for(int i = 0, count = list.size(); i < count; i++) {

    // Value at index i
    int value = list.get(i);
}

// Getting an array of all the values in the collection.
int[] array = list.toArray();
```

The difference between the list and set implementations is that a set can contain each unique value only once and that the items it contains are in an undefined order.

The list implementations keep items in the order they were added to the collections and allow for the same value to be added multiple times.