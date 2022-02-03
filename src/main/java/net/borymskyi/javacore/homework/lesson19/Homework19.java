/*
    Создайте метод abc, инпут параметра котоорго - N-ое количество массивов типа String.
    В методе создайте новый массив, который будет состоять из элементов массивов-параметров
    и будт оутпутом данного метода.
    В методе main вызовите метод abc и его элементам, которые равны значениям command line парамемтров,
    присвойте значение null.
    Выведите элементы обновлённого массива на экран.
    Везде, где возможно, используйте foreach loop.
    Запустите приложение с командной строки.
 */
package main.java.net.borymskyi.javacore.homework.lesson19;

public class Homework19 {

//    public static void abc(String[] ... n) {
//        String[][] allStr = new String[n.length][n[0].length]; // {{5, 2}, {3, 5}}
//        for (int i = 0; i < n.length; i++) {
//            for (int j = 0; j < n[i].length; j++) {
//                allStr[i][j] = n[i][j];
//            }
//        }
//        for (int i = 0; i < allStr.length; i++) {
//            for (int j = 0; j < allStr[i].length; j++) {
//                System.out.println(allStr[i][j]);
//            }
//        }
//    }
//
//    public static void main(String[] args) {
//        String[] test0 = {"test0"};
//        String[] test1 = {"test1"};
//        String[] test2 = {"test2"};
//        String[] test3 = {"test3"};
//        String[] test4 = {"test4"};
//        System.out.println(args[0]);
//        abc(test0, test1, test2, test3, test4);
//    }

    public static String[] abc(String[]... array1) {
        int length = 0;
        for (String[] array2 : array1) {
            length += array2.length;
        }
        String[] target = new String[length];
        int count = 0;
        for (String[] array2 : array1) {
            for (String s : array2) {
                target[count] = s;
                count++;
            }
        }
        return target;
    }

    public static void main(String[] args) {
        String[] target = abc(new String[]{"ok", "privet", "poka"}, new String[]{"ok", "hello", "bye"});

        for (String s : args) {
            for (int i = 0; i < target.length; i++) {
                if (s.equals(target[i])) {
                    target[i] = null;
                }
            }
        }
        for (String s : target) {
            System.out.println(s + " ");
        }
        System.out.println();
    }



}
