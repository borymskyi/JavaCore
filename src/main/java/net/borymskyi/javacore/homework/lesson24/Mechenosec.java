package main.java.net.borymskyi.javacore.homework.lesson24;

public class Mechenosec extends Fish{

    public Mechenosec(String name) {
        super(name);
    }

    @Override
    public void swim() {
        System.out.println("The Swordtail is a beautiful fish that swims fast!");
    }

    @Override
    public void eat(){
        System.out.println("The Swordtail is not a predatory fish, and it eats regular fish food!");
    }

    @Override
    public String toString() {
        return "Mechenosec{" +
                "name='" + name + '\'' +
                '}';
    }
}
