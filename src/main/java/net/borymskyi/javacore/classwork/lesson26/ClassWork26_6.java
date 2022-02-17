package main.java.net.borymskyi.javacore.classwork.lesson26;

public class ClassWork26_6 {
    static {
        abc(2);
    }
    static void abc(int a) {
        System.out.print(a + " ");
    }
    ClassWork26_6(){
        abc(5);
    }
    static {
        abc(4);
    }
    {
        abc(6);
    }
    static{
        new ClassWork26_6();
    }
    {
        abc(8);
    }

    public static void main(String[] args) {
//        ClassWork26_6 c = new ClassWork26_6();
    }
}
