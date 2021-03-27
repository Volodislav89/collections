package com.zvl.collections;

import java.util.Iterator;

public class QueueImpl implements Queue {
    @Override
    public void enqueue(Object element) {

    }

    @Override
    public Object dequeue() {
        return null;
    }

    @Override
    public Object top() {
        return null;
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
