//22 Урок. Инкапсуляция
package main.java.net.borymskyi.javacore.classwork.lesson22_3_2;

import main.java.net.borymskyi.javacore.classwork.lesson22_3.First;

public class Third extends Second {
    int timeWorkToDay;

    public static void main(String[] args) {
        Third t = new Third();
        t.name = "Dmytrii";
        System.out.println(t.name);
        t.work();

//        Second s1 = new Second();
//        s1.
//        First f1 = new First();
//        f1.

    }
}
    class Test {
        public static void main(String[] args) {
            Third t2 = new Third();
//            t2.work();
        }
    }
