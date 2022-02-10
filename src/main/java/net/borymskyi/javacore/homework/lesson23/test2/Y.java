package main.java.net.borymskyi.javacore.homework.lesson23.test2;

public class Y extends X{
    public void abc() {
        System.out.println('Y');
    }
    public void def(){
        Y y = new Y();
        y.abc();
    }
    public void ghi(){
        X x = new Y();
        x.abc();
    }


    public static void main(String[] args) {
        Y a = new Y();
        a.abc();
        a.def();
        a.ghi();
    }
}
