package ru.x5.Task3.ptoneTask;

public class Phone {
    private String number;
    private String model;

    public void setNumber(String number) {
        this.number = number;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    private int weight;

    public Phone(String number, String model, int weigth) {
        this(number, model);
        this.weight = weigth;
    }

    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone() {
        this("+79999999999", "c-01", 222);
    }

    public void recieveCall(String callerName) {
        System.out.println("Звонит " + callerName);
    }

    public void recieveCall(String callerName, String number) {
        System.out.println("Звонит " + callerName);
        System.out.println("Номер " + number);
    }

    public String getNumber() {
        return number;
    }

    public void sendMessage(String... numbers) {
        for (String s : numbers) {
            System.out.println("Отправлено: " + s);
        }
    }
}
