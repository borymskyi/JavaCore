//Урок 18. Понятие "массив". Работа с масивами.
package classwork.lesson18;

import java.util.Arrays;

public class Test18 {

    public static void maxMin(double[] array) {
        double max = array[0];
        double min = array[0];
        for (int i = 1; i < array.length; i++){
            if (array[i] > i) {
                max = array[i];
            }
            if (array[i] < i) {
                min = array[i];
            }
        }
        System.out.println("Минимальный элемент массива: " + min + "\n"
                        + "Максимальный элемент массива: " + max);
    }

    public static void main(String[] args) {

        double[] array1 = {1.05, -3.14, 8.40, 9.04, -3.0, -20.5};
        maxMin(array1);

        System.out.println();

        char[] arrayChar = {'a', 'b', 'c', 'd'};
//        String str = new String(arrayChar);
//        System.out.println(str);
        StringBuilder sb = new StringBuilder("Hello World");
//        sb.append(arrayChar, 1, 2); //append
        System.out.println(sb);

        System.out.println("Test git");

        System.out.println("new commit | пофиксил loal commit");

        System.out.println("Git commit | пофиксил git commit)");
        System.out.println("Git commit | пофиксил git commit");

        System.out.println("local commit | проверил слияние, pull, commit, checkout, remote, status, log --graph, и тд");



//        String[] array0 = {"privet", "poka", "ok"};
//        System.out.println(array0[0]);
//
//        String[][] arr = {{"awd", "lfg"}, {"dmytrii", "dimoks"}};
//        System.out.println(arr[0][1]);
//
//        int[][] i0 = {{50, 40, 30}, {20, 10, 55}, {80, 99, 15}};
//        //     0  1  2
//        //   0 {50 40 30}
//        //   1 {20 10 55}
//        //   2 {80 99 15}
//        System.out.println(i0[2][0]);
//
//        //str это ссылка на объект(класса стринг) с массивом, в массиве адресса, а эти адресса ссылкаются на объекты с нужными данными.
//        String[][][] str = {{{"Dmytrii", "Borymskyi", "Dimoks"}, {"awd", "lfg", "test"}, {"test0", "test1", "test2"}}};
//        System.out.println(str[0][1][1]);
//
////        int[][] testInt;
////        testInt = new int[3][];
////        testInt[0][0] = 5;
////        testInt[0][1] = -5;
////        testInt[1][0] = 10;
////        testInt[2][0] = 8;
//
//        //динамичиская инициализация
//        String[] array10;
//        int[][] array11;
//
//        //1
//        array10 = new String[3];
//        for (int i = 0; i < array10.length; i++) {
//            array10[i] = "hello" + i;
//            System.out.println(array10[i]);
//        }
//        //2
//        array11 = new int[3][];
//        array11[0] = new int[5];
//        array11[1] = new int[2];
//        array11[2] = new int[7];
//        //      0 1 2 3 4 5 6
//        //   0 {0 0 0 0 0}
//        //   1 {0 0}
//        //   2 {0 0 0 0 0 0 0}
//        for (int i = 0; i < array11.length; i++) {
//            for (int j = 0; j < array11[i].length; j++) {
//                array11[i][j] = i + j;
//                System.out.println(array11[i][j]);
//            }
//        }
//
//        //
//        int[] test0 = new int[5];
//        int[] test1 = {1, 2, 3};
//        int[] test2;
//        test2 = new int[] {1, 2, 3};
//
//        String[] test3 = new String[2];
//        test3[0] = "hello";
//        System.out.println(test3[1]);
//
//        int[][] array30 = { {5, 6}, null};
//        System.out.println(array30[1][0]);
//
//        //методы
//        //sort
//        System.out.println("методы");
//
//        int array80[] = {1, 9, 2, -1, 5, 10, 6, 24};
//        for (int i = 0; i < array80.length; i++) {
//            System.out.print(array80[i] + " ");
//        }
//        System.out.println();
//        Arrays.sort(array80);
//        for (int i = 0; i < array80.length; i++) {
//            System.out.print(array80[i] + " ");
//        }
//        System.out.println();
//        //binarysearch
//        //выдает индекс на котором находится наш элемент (в отсортированном массиве).
//        int index1 = Arrays.binarySearch(array80, 8);
//        System.out.println(index1);
//        //AB
    }



}
