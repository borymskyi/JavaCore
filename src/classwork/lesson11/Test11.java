//Урок 11. Использование примитивных и ссылочных типов данных при вызове метода.
package classwork.lesson11;

public class Test11 {

    int x;
    int y;

    public Test11(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "Test11{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public static void main(String[] args) {
        Test11 t1 = new Test11(1, 2);
        Test11 t2 = new Test11(4, 5);

        Test11 t3 = new Test11(0, 0);
        t3 = t1;
        t1 = t2;
        t2 = t3;

        System.out.println(t1);
        System.out.println(t2);

    }
}
