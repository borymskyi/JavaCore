/*
    Classwork 25.
 */
package main.java.net.borymskyi.javacore.classwork.lesson25;

public class Test25_5 implements InterfaceTest25_5_1, InterfaceTest25_5_2 {

    @Override
    public void awd() {
        System.out.println("ok");
    }

    public static void main(String[] args) {
        Test25_5 t = new Test25_5();
        t.awd();
        System.out.println(((InterfaceTest25_5_1) t).i); //веди себя будто адресс t типа InterfaceTest25_5_1

        InterfaceTest25_5_1 ti = new Test25_5();
        System.out.println(ti.i);
        ti.awd();
    }
}



interface InterfaceTest25_5_1 {
    int i = 10;
    void awd();
}




interface InterfaceTest25_5_2 {
    int i = 20;
    void awd();
}