package ru.x5.Task3.animalTask;

public class Dog extends Animal {
    private String barkType;

    public String getBarkType() {
        return barkType;
    }

    public Dog(String food, String location, String barkType) {
        super(food, location);
        this.barkType = barkType;
    }

    @Override
    public void makeNoise() {
        System.out.println(barkType + "-" + barkType);
    }
}
