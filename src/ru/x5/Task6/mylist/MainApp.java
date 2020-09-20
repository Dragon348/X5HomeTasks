package ru.x5.Task6.mylist;

public class MainApp {
    public static void main(String[] args) {
        MyList<Integer> list = new MyArrayList<>();
        list.add(5);
        list.add(7);
        list.add(4);
        list.add(15);
        list.add(2,33);
        list.add(0,1733);
        list.add(list.size(), 22);
        System.out.println(list);
        list.remove((int)0);
        System.out.println(list);
        list.remove((Integer)33);
        System.out.println(list);
        System.out.println(list.size());
    }
}
