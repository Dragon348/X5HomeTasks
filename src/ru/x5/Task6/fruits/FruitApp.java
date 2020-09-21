package ru.x5.Task6.fruits;

public class FruitApp {
    public static void main(String[] args) {
        Box appleBox = new Box();
        appleBox.add(new Apple(1.2f));
        appleBox.add(new Apple(3.2f));
        appleBox.add(new Orange(2.1f));
        Box orangeBox = new Box();
        orangeBox.add(new Orange(2.1f));
        orangeBox.add(new Orange(5.2f));
        orangeBox.add(new Apple(2.12f));

        System.out.println(appleBox.getWeight());
        System.out.println(orangeBox.getWeight());
        System.out.println(orangeBox.compare(appleBox));
        appleBox.add(new Apple(2.9f));
        System.out.println(appleBox.getWeight());
        System.out.println(orangeBox.getWeight());
        System.out.println(appleBox.compare(orangeBox));
        Box appleBox1 = new Box();
        appleBox1.add(new Apple(3f));
        appleBox1.add(new Apple(2f));
        appleBox.addAll(orangeBox);
        System.out.println(appleBox1.getWeight());
        appleBox.addAll(appleBox1);
        System.out.println(appleBox.getWeight());
        System.out.println(appleBox1.getWeight());
    }
}
