/*
    3. Напишите класс BaseConverter для конвертации из градусов по Цельсию в
    Кельвины, Фаренгейты, и так далее.
    У класса должен быть метод convert, который и делает конвертацию.
 */
package main.java.net.borymskyi.javacore.university.lab3;

class BaseConverter {

    public double convert(int number, double t) {
        switch (number) {
            case 1:
                System.out.print("Celsius = ");
                return t;
            case 2:
                System.out.print("Kelvin = ");
                return t + 273.15;
            case 3:
                System.out.print("Fahrenheit = ");
                return t * 1.8 + 32;
        }
        return t = 0;
    }
}

public class Convert {
    public static void main(String[] args) {
        System.out.println(new BaseConverter().convert(3, 19.5));
    }
}