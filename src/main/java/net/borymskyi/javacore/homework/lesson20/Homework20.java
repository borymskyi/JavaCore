/*
    Homework 20. Всё о классе ArrayList.
    1. Создайте класс, в котором создайте метод abc. Инпут
       параметром данного метода будет N-ое количество
       парамметров типа String.
       Метод должен возвращать уже отсортированный объект
       ArrayList из неповторяющихся объектов типа String,
       взятых из параметра метода и выводить данный
       объект на экран.
       Продемонстрируйте данный метод.
 */

package main.java.net.borymskyi.javacore.homework.lesson20;

import java.util.ArrayList;
import java.util.Collections;

public class Homework20 {
    public static ArrayList<String> abc(String ... str){
        ArrayList<String> arraystr0 = new ArrayList<>();
        for (int i = 0; i < str.length; i++) {
            arraystr0.add(str[i]);
        }
        Collections.sort(arraystr0);
        System.out.println(arraystr0);
        return arraystr0;
    }

    public static void main(String[] args) {
        String str0 = new String("B");
        String str1 = new String("A");
        String str2 = new String("D");
        String str3 = new String("C");
        ArrayList<String> arraystr = abc(str0, str1, str2, str3);
    }
}
