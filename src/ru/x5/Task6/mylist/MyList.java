package ru.x5.Task6.mylist;

public interface MyList<E> {

    boolean add(E value);

    boolean add(int index, E value);

    boolean remove(int index);

    boolean remove(E value);

    int size();

    E get(int index);

    void clear();


}
