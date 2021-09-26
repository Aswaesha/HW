package com.lesson;

public class Main {

    public static void main(String[] args) {
        Employee worker1 = new Worker("W1","WS1",1);
        Employee worker2 = new Worker("W2","WS2",2);
        Employee worker3 = new Worker("W3","WS3",3);
        Employee worker4 = new Worker("W4","WS4",4);

        Employee director1 = new Director("D1","DS1",10);
        Employee director2 = new Director("D2","DS2",15);


//        ((Director)director1).addWorker(worker1);
//        ((Director)director1).addWorker(worker2);
//        ((Director)director1).addWorker(worker3);
//
//        ((Director)director2).addWorker(worker4);
//        ((Director)director1).addWorker(director2);

        System.out.println(director1);

    }


}
