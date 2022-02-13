package main.java.net.borymskyi.javacore.homework.lesson24;

public abstract class Bird extends Animal implements Speakable {

    public Bird(String name) {
        super(name);
    }

    public abstract void fly();

    @Override
    public void speak() {
        System.out.println(this.name + " sings");
    }

}
