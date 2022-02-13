package main.java.net.borymskyi.javacore.homework.lesson24;

public class Lev extends Mammal {

    public Lev(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println("The lion like any predator loves meat");
    }

    @Override
    public void sleep() {
        System.out.println("Most of the day the lion sleeps");
    }

    @Override
    public void run() {
        System.out.println("Leo is not the fastest cat");
    }
}
