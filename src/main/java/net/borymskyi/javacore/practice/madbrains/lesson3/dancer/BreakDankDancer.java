package main.java.net.borymskyi.javacore.practice.madbrains.lesson3.dancer;

public class BreakDankDancer extends Dancer {
    public BreakDankDancer(String name, int age) {
        super(name, age);
    }

    @Override
    public void dance(){
        System.out.println(toString() + "Я танцую брейк-данс!");
    }
}
