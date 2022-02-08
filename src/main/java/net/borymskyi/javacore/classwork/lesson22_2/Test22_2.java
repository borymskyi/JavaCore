//22 Урок. Инкапсуляция
package main.java.net.borymskyi.javacore.classwork.lesson22_2;

import main.java.net.borymskyi.javacore.classwork.lesson22.Chelovek;

public class Test22_2 {
    public static void main(String[] args) {
        Chelovek c2 = new Chelovek("male");
        c2.setName("Dmytrii");
        c2.setVozrast(21);
        c2.setVes(65);
        System.out.println(c2.getName());
        System.out.println(c2.getVozrast());
        System.out.println(c2.getVes());
    }
}
