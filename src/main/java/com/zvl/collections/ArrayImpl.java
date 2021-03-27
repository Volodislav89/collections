package com.zvl.collections;

import java.util.Iterator;

public class ArrayImpl implements Array {

    @Override
    public void add(Object element) {

    }

    @Override
    public void set(int index, Object element) {

    }

    @Override
    public Object get(int index) {
        return null;
    }

    @Override
    public int indexOf(Object element) {
        return 0;
    }

    @Override
    public void remove(int index) {

    }

    @Override
    public void clear() {

    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public Iterator<Object> iterator() {
        return new IteratorImpl();
    }

    private class IteratorImpl implements Iterator<Object> {

        @Override
        public boolean hasNext() {
            return false;
        }

        @Override
        public Object next() {
            return null;
        }

        @Override
        public void remove() {

        }
    }
}
