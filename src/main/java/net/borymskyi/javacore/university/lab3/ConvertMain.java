/*
    Напишите класс BaseConverter для конвертации из градусов по Цельсию в
    Кельвины, Фаренгейты, и так далее.
    У класса должен быть метод convert, который и делает конвертацию.
 */
package main.java.net.borymskyi.javacore.university.lab3;

public class ConvertMain {
    public static void main(String[] args) {
        double temperature = 19.5;
        System.out.println("Celsius = " + new CelsiusConverter().getConvertedValue(temperature));
        System.out.println("Kelvin = " + new KelvinConverter().getConvertedValue(temperature));
        System.out.println("Fahrenheit = " + new FahrenheitConverter().getConvertedValue(temperature));
    }
}
