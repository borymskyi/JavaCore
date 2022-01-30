//Урок 12. Конструкции "if" и "else". Тернарный оператор
package classwork.lesson12;

import com.sun.prism.impl.FactoryResetException;

public class First12 {

    void abc(){
        String str = "test";
        int a = 10;

        if (a>=10) {
            str = "Privet";
        }

        if (a < 10) {
            str = "Poka";
        }

        System.out.println(str);
    }


    public static void main(String[] args) {


        First12 f1 = new First12();
        f1.abc();


    }


//    public static void main(String[] args) {

//        boolean a = true;
//
//        //if - true folse.
//        if (a != false) {
//            System.out.println("true!");
//        } else {
//            System.out.println("folse!");
//        }
//
//        //if / else if / else.
//        int b = 190;
//        if (b < 100){
//            System.out.println("b < 100 | > 50");
//        }
//        else if (b < 150){
//            System.out.println("b < 150 | > 100");
//        }
//        else if (b < 200){
//            System.out.println("b < 200 | > 150");
//        }
//        else {
//            System.out.println("else");
//        }
//
//
//        String s1 = new String("test");
//        String s2 = new String("test");
//        if (s1 == s2) {
//            System.out.println("true");
//        }
//        else {
//            System.out.println("folse");
//        }
//        System.out.println(s1.equals(s2));
}
