package com.lesson;

public enum Position {
    DIRECTOR (2),
    WORKER(3);

    private int coef;

    Position (int coef){
        this.coef = coef;
    }


}
