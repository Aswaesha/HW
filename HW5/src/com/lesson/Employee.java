package com.lesson;

public abstract class Employee extends Person {
    private Integer experience;
    protected Position pos;
    private Integer base = 1000;

    public Employee (String firstname,String lastname,Integer experience){
        super(firstname,lastname);
        this.experience = experience;
        setPosition();
    }

    public abstract void  setPosition();

    public Integer getSal(){
        return base * pos.getCoif() * experience;

    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstname=" + firstname +
                "lastname=" + lastname +
                "experience=" + experience +
                ", position=" + pos +
                ", salary=" + getSal() +
                '}';
    }

}
