package ru.x5.Task6.mylinkedlist;

public class MyLinkedList<T> implements MyList<T>{
    private T value;
    private MyLinkedList next;
    private MyLinkedList first;
    private MyLinkedList last;
    private int size;
    //private MyLinkedList<T> last = null;
    public MyLinkedList() {
        value = null;
        next = null;
    }

    @Override
    public void add(T value) {
        if (this.value == null) {
            this.value = value;
            first = this;
            last = this;
            size = 1;
        } else {
            last.next = new MyLinkedList<T>();
            last.next.setValue(value);
            last = last.next;
            size++;
        }
    }

    private void setValue(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    @Override
    public void add(int index, T value) {
        MyLinkedList<T> iterator = this.first;
        MyLinkedList<T> prev = null;
        int i = 0;
        while (iterator.hasNext()) {
            if (i == index - 1) break;
            i++;
            prev = iterator;
            iterator = iterator.next();
        }
        prev.next = new MyLinkedList<T>();
        prev.next.setValue(value);
        prev.next.setNext(iterator);
        size++;
    }

    @Override
    public void remove(int index) {
        MyLinkedList<T> iterator = this.first;
        MyLinkedList<T> prev = null;
        int i = 0;
        while (iterator.hasNext()) {
            if (i == index - 1) break;
            i++;
            prev = iterator;
            iterator = iterator.next();
        }
        prev.next = iterator.next();
    }

    @Override
    public void remove(T value) {

    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public T get(int index) {
        return null;
    }

    @Override
    public void clear() {

    }

    public MyLinkedList next() {
        return next;
    }

    public void setNext(MyLinkedList next) {
        this.next = next;
    }

    public MyLinkedList getFirst() {
        return first;
    }

    public void setFirst(MyLinkedList first) {
        this.first = first;
    }

    public MyLinkedList getLast() {
        return last;
    }

    public void setLast(MyLinkedList last) {
        this.last = last;
    }

    public boolean hasNext() {
        return next != null;
    }

    @Override
    public String toString() {
        return value.toString();
    }
}
