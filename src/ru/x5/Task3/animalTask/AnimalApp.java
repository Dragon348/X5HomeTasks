package ru.x5.Task3.animalTask;

public class AnimalApp {
    public static void main(String[] args) {
        Animal[] animals = new Animal[3];
        animals[0] = new Cat("Мышь", "Дом", false);
        animals[1] = new Dog("Мусор", "Будка", "Гав");
        animals[2] = new Horse("Овёс", "Дикие поля", 17);
        Veterinar veterinar = new Veterinar();
        for (Animal animal : animals) {
            veterinar.treatAnimal(animal);
            animal.makeNoise();
        }
    }
}
