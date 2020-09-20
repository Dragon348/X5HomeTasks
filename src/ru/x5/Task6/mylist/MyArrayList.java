package ru.x5.Task6.mylist;

public class MyArrayList<E> implements MyList<E> {
    private Object[] elements;
    private int size = 0;

    public MyArrayList() {
        this.elements = new Object[size];
    }


    @Override
    public boolean add(E value) {
        Object[] newElements = new Object[size + 1];
        System.arraycopy(elements, 0, newElements, 0, size);
        newElements[size] = value;
        size++;
        elements = newElements;
        return true;
    }

    @Override
    public boolean add(int index, E value) {
        int newSize = size + 1;
        Object[] newElements = new Object[newSize];
        if (index >= 0) {
            System.arraycopy(elements, 0, newElements, 0, index);
        }
        for (int i = index + 1; i < newSize; i++) {
            newElements[i] = elements[i - 1];
        }
        newElements[index] = value;
        elements = newElements;
        size = newSize;
        return true;
    }

    @Override
    public boolean remove(int index) {
        if ((index < 0) || index > size) {
            return false;
        }
        int newSize = size - 1;
        Object[] newElements = new Object[newSize];
        System.arraycopy(elements, 0, newElements, 0, index);
        for (int i = index + 1; i < size; i++) {
            newElements[i - 1] = elements[i];
        }
        elements = newElements;
        size = newSize;
        return true;
    }

    @Override
    public boolean remove(E value) {
        int i;
        for (i = 0; i < size; i++) {
            if (elements[i].equals(value)) {
                break;
            }
        }
        return remove(i);
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public E get(int index) {
        return (E) elements[index];
    }

    @Override
    public void clear() {
        elements = new Object[10];
        size = 0;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        for (Object el : elements) {
            str.append(el).append(" ");
        }
        return str.toString();
    }
}
