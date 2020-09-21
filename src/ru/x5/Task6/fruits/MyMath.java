package ru.x5.Task6.fruits;

public class MyMath {
    public static float round(float x, int digitsCount) {
        return (float) Math.round(x * pow(10, 2)) / pow(10, 2);
    }

    public static int pow(int num, int pow) {
        int powNum = 1;
        for (int i = 0; i < pow; i++) {
            powNum *= num;
        }
        return powNum;
    }
}
