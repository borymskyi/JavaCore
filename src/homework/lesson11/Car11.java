//Урок 11. Использование примитивных и ссылочных типов данных при вызове метода.
//homework
package homework.lesson11;

public class Car11 {

    String color;
    int engine;
    int amount_dors = 50;


    public Car11(String color, int engine, int amount_dors) {
        this.color = color;
        this.engine = engine;
        this.amount_dors = amount_dors;
    }


    public static void main(String[] args) {

        Car11 car0 = new Car11("red", 8, 4);
        System.out.println("amount dors: " + car0.amount_dors);
        CarTest11.change_amount_dors(car0, 1);
        System.out.println("amount dors: " + car0.amount_dors);

        Car11 car1 = new Car11("black", 4, 2);
        System.out.println("color car0: " + car0.color);
        System.out.println("color car1: " + car1.color);
        CarTest11.swap_color(car0, car1);
        System.out.println("color car0: " + car0.color);
        System.out.println("color car1: " + car1.color);
    }

}
