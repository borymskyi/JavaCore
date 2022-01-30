//Урок 11. Использование примитивных и ссылочных типов данных при вызове метода.
//homework
package homework.lesson11;

public class CarTest11 {

    int awd;
    int lfg;

    public CarTest11(int awd, int lfg) {
        this.awd = awd;
        this.lfg = lfg;
    }


    public static void change_amount_dors(Car11 c1, int amount_dors){
        c1.amount_dors = amount_dors;
        System.out.println("change end");
    }

    public static void swap_color(Car11 c1, Car11 c2) {
        Car11 c3 = new Car11(null, 0, 0);
        c3.color = c1.color;
        c1.color = c2.color;
        c2.color = c3.color;
    }
}
