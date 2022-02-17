package main.java.net.borymskyi.javacore.classwork.lesson26;

public class ClassWork26_5 {

    static int i = 5;
    static {
        System.out.println(i);
    }
    static {
        i += i;
        System.out.println(i);
    }

    String s = "string s";
    {
        System.out.println(s);
    }
}

class Test26_10 {
    public static void main(String[] args) {
        System.out.println("hello");
        ClassWork26_5 c1 = new ClassWork26_5();
    }
}