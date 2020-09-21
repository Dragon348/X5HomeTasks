package ru.x5.Task6.fruits;

public class FruitApp {
    public static void main(String[] args) {
        float appleWeight = 1.0f;
        float orangeWeight = 1.5f;
        Box appleBox = new Box();
        appleBox.add(new Apple(appleWeight));
        appleBox.add(new Apple(appleWeight));
        appleBox.add(new Orange(orangeWeight));
        Box orangeBox = new Box();
        orangeBox.add(new Orange(orangeWeight));
        orangeBox.add(new Orange(orangeWeight));
        orangeBox.add(new Apple(appleWeight));

        System.out.println(appleBox.getWeight());
        System.out.println(orangeBox.getWeight());
        System.out.println(orangeBox.compare(appleBox));
        appleBox.add(new Apple(appleWeight));
        System.out.println(appleBox.getWeight());
        System.out.println(orangeBox.getWeight());
        System.out.println(appleBox.compare(orangeBox));
        Box appleBox1 = new Box();
        appleBox1.add(new Apple(appleWeight));
        appleBox1.add(new Apple(appleWeight));
        appleBox.addAll(orangeBox);
        System.out.println(appleBox1.getWeight());
        appleBox.addAll(appleBox1);
        System.out.println(appleBox.getWeight());
        System.out.println(appleBox1.getWeight());
    }
}
