//Урок 10. Понятия "import" и "import static". Использование комментариев.
package classwork.lesson10;

import classwork.lesson10_1.ClassB;
import classwork.lesson10_1.lesson10_2.ClassC;
import static classwork.lesson10_1.ClassB.PI;
//import static classwork.lesson10_1.ClassB.*;

public class ClassA {

//    public static double PI = 3.14;

    public static void main(String[] args) {
        ClassB c1 = new ClassB(50);
        c1.you_are_clown();
        String s1 = new String("test");

        ClassC c2 = new ClassC(100);
        c2.get_str();

        double usePI = PI;
        System.out.println(usePI);
    }
}
