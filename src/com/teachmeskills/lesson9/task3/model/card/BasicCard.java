package com.teachmeskills.lesson9.task3.model.card;

public abstract class BasicCard{

    private static int counter;
    private long id;
    private int cvv;
    private double currentAmount;
    public String currency;
    public double commissionPercentage;

    public BasicCard() {
        this.id = ++counter;
    }

    abstract public int getTransferLimit();

    public long getId() {
        return id;
    }

    public int getCvv() {
        return cvv;
    }
    public void setCvv(int cvv) {
        if (cvv >= 1000 || cvv < 100){
            System.out.println("CVV incorrect. Default value set: 100");
            this.cvv = 100;
        } else {
            this.cvv = cvv;
        }
    }

    public double getCurrentAmount() {
        return currentAmount;
    }
    public void setCurrentAmount(double currentAmount) {
        if(currentAmount < 0){
            System.out.println("Amount incorrect. Default value set: 0");
            this.currentAmount = 0;
        } else {
            this.currentAmount = currentAmount;
        }
    }
}
