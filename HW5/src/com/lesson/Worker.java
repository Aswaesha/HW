package com.lesson;

public class Worker extends Employee {

    public Worker(String firstname, String lastname, Integer experience) {
        super(firstname, lastname, experience);
    }

    @Override
    public void setPosition() {
        this.pos=Position.WORKER;
    }

}
