package ru.x5.Task6.mylinkedlist;

public class MainApp {
    public static void main(String[] args) {
        MyList<Integer> list = new MyLinkedList<>();
        list.add(5);
        list.add(7);
        list.add(4);
        list.add(15);
        list.add(2,33);
        MyLinkedList<Integer> iterator = (MyLinkedList<Integer>) list;
        while (true){
            System.out.print(iterator.getValue() + " ");
            if (!iterator.hasNext()) break;
            iterator = iterator.next();
        }
        System.out.println();
        System.out.println(list.size());
        list.remove(3);
        iterator = (MyLinkedList<Integer>) list;
        while (true){
            System.out.print(iterator.getValue() + " ");
            if (!iterator.hasNext()) break;
            iterator = iterator.next();
        }
    }
}
