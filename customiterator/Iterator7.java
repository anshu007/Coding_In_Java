package com.customiterator;

import java.util.Iterator;

public class Iterator7<Type> implements Iterable<Type> {

    private Type[] arrayList;
    private int currentSize;

    public Iterator7(Type[] newArray) {
        this.arrayList = newArray;
        this.currentSize = arrayList.length;
    }

    @Override
    public Iterator<Type> iterator() {
        Iterator<Type> it = new Iterator<Type>() {

            private int currentIndex = 0;
            private int index=0;

            @Override
            public boolean hasNext() {
                return currentIndex < currentSize && arrayList[currentIndex] != null;
            }

            @Override
            public Type next() {
            	index=currentIndex;
            	currentIndex=currentIndex+2;
                return arrayList[index];
            	
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
        return it;
    }
}