//Урок 8. Модификаторы "final" "static". Понятие константа.
//homework
package homework.lesson8;

public class FirstClass {


    static int firstx2(int a, int b, int c) {
        int result = a * b * c;
        return result;
    }

    static void second(int a, int b) {
        int result = a % b;
        System.out.println("Остаток деления: " + result);
    }
}