/*
    Classwork 27. Повтор 26 урока.
 */
package main.java.net.borymskyi.javacore.classwork.lesson27;

public class ClassWork27 {
    public static void main(String[] args) {
        Animal a = new Tiger();
        System.out.println(a.a);
        System.out.println(a.b);
        a.abc();
        a.def();
    }
}

class Animal{
    int a = 5;
    static int b = 10;
    void abc() {
        System.out.println("nonstatic method Animal");
    }
    static void def() {
        System.out.println("static method Animal");
    }
}

class Tiger extends Animal {
    int a = 20;
    static int b = 40;
    @Override
    void abc() {
        System.out.println("non-static method Tiger");
    }
    static void def() {
        System.out.println("static method Tiger");
    }
}