/*
    Classwork Урок 19 Парамеры метода типа varargs. Аргументы типа command line. Цикл foreach.
    - command line args
    - varargs
    - foreach loop
 */
package classwork.lesson19;

public class Test19 {

    public static void abc(String str, int ... a) {
        System.out.println(str + a.length);
        for (int i = 0; i < a.length; i++){
            System.out.print(a[i] + " ");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int awd = 3, abc = 5, x = 10, y = 30, z = -5;
        abc("Количество параметров: ", awd, abc, x, y, z);
    }
    //AD
}
