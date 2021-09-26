package com.lesson;

import java.util.Arrays;

public class Director extends  Employee{
    private  Employee[] employees;

    public Director(String firstname, String lastname, Integer experience) {
        super(firstname, lastname, experience);
    }

    public void addWorker(Employee employee){
        if (employees == null){
            employees = new Employee[1];
            employees[0] = employee;
        } else {
            employees = Arrays.copyOf(employees, employees.length + 1 );
            employees[employees.length - 1] = employee;
        }
    }

    @Override
    public void setPosition() {
        this.pos=Position.DIRECTOR;
    }

    @Override
    public Integer getSal() {
        if (employees == null){
            return super.getSal();
        } else {
            return super.getSal() + employees.length;
     }
    }

    @Override
    public String toString() {
        return "Director{" +
                "position=" + pos +
                "salary=" + getSal() +
                "employees=" + Arrays.toString(employees) +

                '}';
    }
}
