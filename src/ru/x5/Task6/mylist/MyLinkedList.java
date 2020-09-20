package ru.x5.Task6.mylist;

public class MyLinkedList<E> implements MyList<E> {
    private Node<E> first;
    private Node<E> last;
    private int size;

    public MyLinkedList() {
        first = null;
        last = null;
        size = 0;
    }

    public void unlinkFirst() {
        first.next.prev = null;
        first = first.next;
    }

    public void unlinkLast() {
        last.prev.next = null;
        last = last.prev;
    }

    public void unlink(Node<E> node) {
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }

    private void addFirst(E value) {
        if (first != null) {
            Node<E> newFirst = new Node<>(null, value, first);
            first.prev = newFirst;
            first = newFirst;
        } else {
            first = new Node<E>(null, value, null);
            last = first;
        }
        size++;
    }

    private void addLast(E value) {
        Node<E> newLast = new Node<>(last, value, null);
        last.next = newLast;
        last = newLast;
        size++;
    }

    @Override
    public boolean add(E value) {
        if (first == null) {
            addFirst(value);
        } else {
            addLast(value);
        }
        return true;
    }

    @Override
    public boolean add(int index, E value) {
        if ((index < 0) || (index > size)) {
            return false;
        } else if (index == 0) {
            addFirst(value);
        } else if (index == size) {
            addLast(value);
        } else {
            Node<E> node = first;
            for (int i = 0; i < index; i++) {
                node = node.next;
            }
            Node<E> added = new Node<>(node.prev, value, node);
            node.prev.next = added;
            node.prev = added;
            size++;
        }
        return true;
    }


    @Override
    public boolean remove(int index) {
        if ((index < 0) || (index >= size)) {
            return false;
        } else if (index == 0) {
            unlinkFirst();
        } else if (index == size - 1) {
            unlinkLast();
        } else {
            Node<E> node = first;
            for (int i = 0; i < index; i++) {
                node = node.next;
            }
            unlink(node);
        }
        size--;
        return true;

    }

    @Override
    public boolean remove(E value) {
        Node<E> node = first;
        int index;
        for (index = 0; index < size(); index++) {
            if (node.item.equals(value)) {
                break;
            }
            node = node.next;
        }

        return remove(index);
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public E get(int index) {
        Node<E> node = first;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node.item;
    }

    @Override
    public void clear() {
        first = null;
        last = null;
        size = 0;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        for (Node<E> node = first; node != null; node = node.next) {
            str.append(node.item).append(" ");
        }
        return str.toString();
    }


    private static class Node<E> {
        E item;
        MyLinkedList.Node<E> next;
        MyLinkedList.Node<E> prev;

        Node(MyLinkedList.Node<E> prev, E element, MyLinkedList.Node<E> next) {
            this.item = element;
            this.next = next;
            this.prev = prev;
        }
    }

   /* public static class MyIterator<E>{
        private Node<E> itr;

        public MyIterator(MyLinkedList.Node<E> first) {
            itr = first;
        }

        public
    }*/
}
