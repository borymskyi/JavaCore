package main.java.net.borymskyi.javacore.homework.lesson24;

public abstract class Fish extends Animal{

    public Fish(String name) {
        super(name);
    }

    @Override
    public void sleep(){
        System.out.println("Always wondering how fish sleep");
    }

    public abstract void swim();
}
