package main.java.net.borymskyi.javacore.practice.madbrains.lesson3.dancer;

public class ElectricBoogieDancer extends Dancer {
    public ElectricBoogieDancer(String name, int age) {
        super(name, age);
    }

    //переопределение метода базового класса
    @Override
    public void dance() {
        System.out.println( toString() + "Я танцую электрик буги!");
    }
}