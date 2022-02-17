/*
    26 CW. initializers block
 */
package main.java.net.borymskyi.javacore.classwork.lesson26;

public class Classwork26_4 {
    public Classwork26_4() {
        System.out.println("konstructor");
    }
    {
        System.out.println("init block");
    }
}

class Test26_3 {
    public static void main(String[] args) {
        Classwork26_4 c = new Classwork26_4();
    }
}
