package main.java.net.borymskyi.javacore.homework.lesson24;

public abstract class Animal {

    String name;

    public Animal(String name) {
        this.name = name;
    }

    public abstract void eat();

    public abstract void sleep();

}
