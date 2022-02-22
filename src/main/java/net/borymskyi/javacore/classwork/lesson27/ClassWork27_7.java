package main.java.net.borymskyi.javacore.classwork.lesson27;

public class ClassWork27_7 {
    static void abc() {
        System.out.println("rabotaet method abc");
        abc();
    }

    public static void main(String[] args) {
        abc();
    }
}
