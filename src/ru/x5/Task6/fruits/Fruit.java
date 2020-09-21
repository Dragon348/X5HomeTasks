package ru.x5.Task6.fruits;

public class Fruit {
    private final float weight;

    public Fruit(float weight) {
        this.weight = MyMath.round(weight,2);
    }

    public float getWeight(){
        return weight;
    }
}
