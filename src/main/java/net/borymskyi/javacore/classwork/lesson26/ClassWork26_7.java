package main.java.net.borymskyi.javacore.classwork.lesson26;

public class ClassWork26_7 {
    public static void main(String[] args) {
        Lion l = new Lion();
    }
}

class Animal {
    Animal(){
        System.out.println("Constructor Animal.");
    }
    static {
        System.out.println("static init block Animal");
    }
    {
        System.out.println("init block Animal");
    }
}
class Mammal extends Animal {
    Mammal(){
        System.out.println("Constructor Mammal.");
    }
    static {
        System.out.println("static init block Mammal");
    }
    {
        System.out.println("init block Mammal");
    }
}
class Lion extends Mammal {
    Lion(){
        System.out.println("Constructor Lion");
    }
    static {
        System.out.println("static init block Lion");
    }
    {
        System.out.println("init block Lion");
    }
}