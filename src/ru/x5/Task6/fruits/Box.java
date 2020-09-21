package ru.x5.Task6.fruits;

import ru.x5.Task6.mylist.MyArrayList;
import ru.x5.Task6.mylist.MyList;

public class Box {
    private MyList<Fruit> fruits = new MyArrayList<>();

    public boolean add(Fruit fruit) {
        if (fruits.size() == 0) {
            fruits.add(fruit);
            return true;
        } else if (fruit.getClass().equals(fruits.get(0).getClass())) {
            fruits.add(fruit);
            return true;
        } else {
            System.out.println("Невозможно добавить " + fruit + " в коробку с " + fruits.get(0));
            return false;
        }
    }

    public float getWeight(){
        float weight = 0;
        for (int i = 0; i < fruits.size(); i++) {
            weight += fruits.get(i).getWeight();
        }
        return MyMath.round(weight,2);
    }

    public boolean compare(Box box) {
        return MyMath.round(this.getWeight(),2) == MyMath.round(box.getWeight(),2);
    }

    public boolean addAll(Box anotherBox) {
        if (fruits.get(0).getClass().equals(anotherBox.fruits.get(0).getClass())) {
            for (int i = 0; i < anotherBox.fruits.size(); i++) {
                this.add(anotherBox.fruits.get(i));
            }
            anotherBox.fruits.clear();
            return true;
        }
        System.out.println("Невозможно добавить " + anotherBox.fruits.get(0) + " в коробку с " + fruits.get(0));
        return false;
    }
}
