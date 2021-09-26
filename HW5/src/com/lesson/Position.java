package com.lesson;

public enum Position {
    DIRECTOR (3),
    WORKER(2);

    private int coif;

    Position (int coif){
        this.coif = coif;
    }

    public int getCoif() {
        return coif;
    }
}
