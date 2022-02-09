/*
    1. Создайте класс Student со следующими переменными: name (исползуйте StringBuilder), course, grade.
    Примените инкапсуляцию к данному классу. Длина имени объектов не должна быть менее 3-х символов,
    оценки должны быть числами в интервале от 1 до 10, курс должен быть ислом от 1 до 4 включительно.
    Создайте метод showInfo, который будет выводить всю информацию о студенте, не используя переменные класса напрямую.
    Создайте класс TestStudent, в котором создайте объект класса Student, придайте его переменныи значения.
    Произведите вызов метода showInfo.
 */
package main.java.net.borymskyi.javacore.homework.lesson22;

public class TestStudent22 {
    public static void main(String[] args) {
        Student22 dmytrii = new Student22(new StringBuilder("Dmytrii"), 4, 5);
        dmytrii.showInfo();
        dmytrii.getName().append("!!!!");
        dmytrii.showInfo();
    }
}
