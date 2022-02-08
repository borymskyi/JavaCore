//22 Урок. Инкапсуляция
package main.java.net.borymskyi.javacore.classwork.lesson22_3_2;

import main.java.net.borymskyi.javacore.classwork.lesson22_3.First;

public class Second extends First {
    protected int exp;

    public static void main(String[] args) {
        Second s0 = new Second();
        s0.name = "testsecond";
        System.out.println(s0.name);
    }
}
