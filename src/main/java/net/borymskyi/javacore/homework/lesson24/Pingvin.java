package main.java.net.borymskyi.javacore.homework.lesson24;

public class Pingvin extends Bird{

    public Pingvin(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println("Penguin loves to eat fish");
    }

    @Override
    public void sleep() {
        System.out.println("Penguins sleep snuggled up to each other!");
    }

    @Override
    public void fly() {
        System.out.println("Penguins can't fly");
    }

    @Override
    public void speak(){
        System.out.println("Penguins can't sing like a nightingale");
    }
}
