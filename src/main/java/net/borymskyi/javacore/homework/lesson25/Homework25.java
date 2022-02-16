/*
    Homework 25. Полиморфизм / Кастинг.
 */
package main.java.net.borymskyi.javacore.homework.lesson25;

public class Homework25 {
    public static void main(String[] args) {
        Speakable25 animal0 = new Lev25("lev");
        Speakable25 animal2 = new Pingvin25("pingvin");
        Lev25 animal2_2 = new Lev25("lev_2");
        Pingvin25 animal2_3 = new Pingvin25("pingvin_2");
        Speakable25 [] array0 = {animal0, animal2, animal2_2, animal2_3};
        for (Speakable25 i : array0) {
            if (i instanceof Pingvin25) {
                Pingvin25 p = (Pingvin25) i;
                System.out.println(p.name);
                p.eat25();
                p.sleep25();
                p.speak25();
                p.fly25();
                System.out.println();
//                System.out.println(((Animal25) i).name);
//                ((Animal25) i).eat25();
//                ((Animal25) i).sleep25();
//                i.speak25();
//                if (i instanceof Lev25) {
//                    ((Lev25) i).run25();
//                }
//                if (i instanceof Pingvin25) {
//                    ((Pingvin25) i).fly25();
//                }
//                System.out.println();
            }
            if (i instanceof Lev25) {
                Lev25 l = (Lev25) i;
                System.out.println(l.name);
                l.eat25();
                l.sleep25();
                l.speak25();
                l.run25();
                System.out.println();
            }
        }
        Animal25 animal3 = new Lev25("lev2");
        Animal25 animal4 = new Mechenosec25("mechenosec2");
        Animal25 animal5 = new Pingvin25("pingvin2");
        Bird25 animal6 = new Pingvin25("pingvid2_2");
        Mammal25 animal7 = new Lev25("lev2_2");
        Animal25 [] array1 = {animal3, animal4, animal5, animal6, animal7};
        for (Animal25 i : array1) {
            if (i instanceof Animal25) {
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