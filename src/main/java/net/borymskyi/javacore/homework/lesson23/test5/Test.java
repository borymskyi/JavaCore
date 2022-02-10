package main.java.net.borymskyi.javacore.homework.lesson23.test5;

class X{
    String s1 = "privet";
    void abc(){
        System.out.println("awd");
    }
}
class Y extends X{
    boolean bool = false;
    void awd(){
        System.out.println("lsf");
    }
}
public class Test {
    public static void main(String[] args) {
        X x = new Y();
//        System.out.println(x.s1 = "" + x.bool);
        x.abc();
//        x.awd();
    }
}
