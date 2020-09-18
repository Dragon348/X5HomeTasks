package ru.x5.Task3.animalTask;

public class Horse extends Animal {
    private int horsePower;

    public int getHorsePower() {
        return horsePower;
    }

    public Horse(String food, String loaction, int horsePower) {
        super(food, loaction);
        this.horsePower = horsePower;
    }

    @Override
    public void makeNoise() {
        System.out.println("Иго-го");
    }
}
