package ru.x5.Task7.logic;

public class Account {
    private int id;
    private String holder;
    private int amount;

    public Account(int id, String holder, int amount) {
        this.id = id;
        this.holder = holder;
        this.amount = amount;
    }

    public int getId() {
        return id;
    }

    public String getHolder() {
        return holder;
    }

    public int getAmount() {
        return amount;

    }
    public void setAmount(int amount) {
        this.amount = amount;
    }
    @Override
    public String toString(){
        return "Текущий баланс счёта " + this.getId() + ". Держатель " + this.getHolder() + ": " + this.getAmount();
    }
}
