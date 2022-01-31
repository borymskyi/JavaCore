/*
    Создайте класс, в котором создайте метод sortirovka. Инпут
    параметром данного метода будет одномерный массив типа int.
    Метод должен возвращать уже отсортированный по возрастанию
    массив.
    Продемонстрируйте данный метод.
 */

package homework.lesson18;

import java.util.Arrays;

public class Homework18 {

    public static int[] sortirovka(int[] array){
        int a;
        for (int i = 0; i < array.length; i++) {
            int min = array[i];
            int index = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < min) {
                    min = array[j];
                    index = j;
                }
            }
            if (i != index) {
                a = array[i];
                array[i] = min;
                array[index] = a;
            }
        }
        return array;
    }


    public static void main(String[] args) {
        int array1[] = {1, 10, 50, -9, 20, 3, 6, 7, 120, -4};
        int array1Sort[] = sortirovka(array1);
        for (int i = 0; i < array1Sort.length; i++) {
            System.out.print(array1Sort[i] + " ");
        }
    }

}
