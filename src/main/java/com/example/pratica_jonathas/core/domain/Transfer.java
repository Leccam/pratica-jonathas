package com.example.pratica_jonathas.core.domain;

public class Transfer {

    private double value;

    private int payer;

    private int payee;

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public int getPayer() {
        return payer;
    }

    public void setPayer(int payer) {
        this.payer = payer;
    }

    public int getPayee() {
        return payee;
    }

    public void setPayee(int payee) {
        this.payee = payee;
    }

    public Transfer() {
    }

    public Transfer(double value, int payer, int payee) {
        this.value = value;
        this.payer = payer;
        this.payee = payee;
    }

    @Override
    public String toString() {
        return "{" +
                "\n    'value': " + this.value +
                "\n    'payer': " + this.payer +
                "\n    'payee': " + this.payee +
                "\n}";
    }
}
