package main.java.net.borymskyi.javacore.homework.lesson24;

public abstract class Mammal extends Animal implements Speakable {

    public Mammal(String name) {
        super(name);
    }

    public abstract void run();

    @Override
    public void speak() {
        System.out.println(this.name + " sings");
    }
}
