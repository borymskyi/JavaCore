//Урок 6 Перегрузка методов и конструкторов (overloading). Ключевое слово this.
//homework
package homework.lesson6;

public class Main {

    public int summa() {
        int result = 0;
        System.out.println("Сумма нулевого чисала: " + result);
        return result;
    }

    public int summa(int x) {
        int result = x;
        System.out.println("Сумма одного чисала: " + result);
        return result;
    }

    public int summa(int x, int y) {
        int result = x + y;
        System.out.println("Сумма двух целых чисел: " + result);
        return result;
    }

    public int summa(int x, int y, int z) {
        int result = x + y + z;
        System.out.println("Сумма трех целых чисел: " + result);
        return result;
    }

    public int summa(int x, int y, int z, int d) {
        int result = x + y + z + d;
        System.out.println("Сумма четырёх целых чисел: " + result);
        return result;
    }
}

class MainRun {
    public static void main(String[] args) {
        Main m1 = new Main();
        m1.summa(5, 10, 20, 30);
    }
}
