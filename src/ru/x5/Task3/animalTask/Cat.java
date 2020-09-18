package ru.x5.Task3.animalTask;

public class Cat extends Animal {
    private boolean isWild;

    public Cat(String food, String location, boolean isWild) {
        super(food, location);
        this.isWild = isWild;
    }

    @Override
    public void makeNoise() {
        System.out.println("Мяу");
    }
}
