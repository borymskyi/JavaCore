package main.java.net.borymskyi.javacore.homework.lesson25;

public class Homework25 {
    public static void main(String[] args) {
        Animal25 animal0 = new Lev25("lev");
        Animal25 animal2 = new Pingvin25("pingvin");
        Speakable25 [] array0 = {(Speakable25)animal0, (Speakable25)animal2};
        if (array0 instanceof Speakable25[]) {
            for (Speakable25 i : array0) {
                System.out.println(((Animal25) i).name);
                ((Animal25) i).eat25();
                ((Animal25) i).sleep25();
                i.speak25();
                if (i instanceof Lev25) {
                    ((Lev25) i).run25();
                }
                if (i instanceof Pingvin25) {
                    ((Pingvin25) i).fly25();
                }
                System.out.println();
            }
        }

        Animal25 animal3 = new Lev25("lev2");
        Animal25 animal4 = new Mechenosec25("mechenosec2");
        Animal25 animal5 = new Pingvin25("pingvin2");
        Animal25 [] array1 = {animal3, animal4, animal5};
        if (array1 instanceof Animal25[]) {
            for (Animal25 i : array1) {
                System.out.println(i.name);
                i.sleep25();
                i.eat25();
                if (i instanceof Lev25) {
                    ((Lev25) i).run25();
                    ((Lev25) i).speak25();
                }
                if (i instanceof Mechenosec25) {
                    ((Mechenosec25) i).swim25();
                }
                if (i instanceof Pingvin25) {
                    ((Pingvin25) i).fly25();
                    ((Pingvin25) i).speak25();
                }
                System.out.println();
            }
        }
    }
}



// Speakable
interface Speakable25 {
    default void speak25() {
        System.out.println("Somebody speaks");
    }
}



// Animal
abstract class Animal25 {
    String name;

    public Animal25(String name) {
        this.name = name;
    }

    public abstract void eat25();

    public abstract void sleep25();
}



// Bird
abstract class Bird25 extends Animal25 implements Speakable25 {
    public Bird25(String name) {
        super(name);
    }

    public abstract void fly25();

    @Override
    public void speak25() {
        System.out.println(this.name + " sings");
    }
}



// Fish
abstract class Fish25 extends Animal25 {
    public Fish25(String name) {
        super(name);
    }

    public abstract void swim25();

    @Override
    public void sleep25() {
        System.out.println("Always wondering how fish sleep");
    }
}



// Mammal
abstract class Mammal25 extends Animal25 implements Speakable25 {
    public Mammal25(String name) {
        super(name);
    }

    public abstract void run25();

    @Override
    public void speak25() {
        System.out.println(this.name + " sings");
    }
}



// Lev
class Lev25 extends Mammal25 {
    public Lev25(String name) {
        super(name);
    }

    @Override
    public void eat25() {
        System.out.println("The lion like any predator loves meat");
    }

    @Override
    public void sleep25() {
        System.out.println("Most of the day the lion sleeps");
    }

    @Override
    public void run25() {
        System.out.println("Leo is not the fastest cat");
    }
}



// Mechenosec
class Mechenosec25 extends Fish25 {
    public Mechenosec25(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Mechenosec{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public void eat25() {
        System.out.println("The Swordtail is not a predatory fish, and it eats regular fish food!");
    }

    @Override
    public void swim25() {
        System.out.println("The Swordtail is a beautiful fish that swims fast!");
    }
}



// Pingvin
class Pingvin25 extends Bird25 {
    public Pingvin25(String name) {
        super(name);
    }

    @Override
    public void eat25() {
        System.out.println("Penguin loves to eat fish");
    }

    @Override
    public void sleep25() {
        System.out.println("Penguins sleep snuggled up to each other!");
    }

    @Override
    public void fly25() {
        System.out.println("Penguins can't fly");
    }

    @Override
    public void speak25() {
        System.out.println("Penguins can't sing like a nightingale");
    }
}