package main.java.net.borymskyi.javacore.classwork.lesson26;

public class Classwork26_3 {
    public static void main(String[] args) {
        Test26 t = new Test26();
        t.awd(5, 5);
    }
}

class Test26 {
    public void awd(int i, int i2) {
        System.out.println("int, int");
    }

    public void awd(int i, long l) {
        System.out.println("int, long");
    }

    public void awd(Integer i, Integer i2) {
        System.out.println("integer, integer");
    }

    public void awd(Object o, Object o2) {
        System.out.println("object, object");
    }

    public void awd(int ... i) {
        System.out.println("varargs");
    }
}