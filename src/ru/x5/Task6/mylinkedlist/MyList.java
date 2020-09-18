package ru.x5.Task6.mylinkedlist;

public interface MyList<T> {

    void add(T value);

    void add(int index, T value);

    void remove(int index);

    void remove(T value);

    int size();

    T get(int index);

    void clear();

    boolean hasNext();

    T getValue();
}
