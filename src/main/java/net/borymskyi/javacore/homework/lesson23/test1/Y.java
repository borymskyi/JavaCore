package main.java.net.borymskyi.javacore.homework.lesson23.test1;

public class Y extends X{
    Y(){
    }
    public void abc(){
        System.out.println('Y');
    }

    public static void main(String[] args) {
        Y y = new Y();
        y.abc();
    }
}
