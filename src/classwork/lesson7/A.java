//Урок 7. Понятие "package". Модификаторы видимости (access modifiers).
package classwork.lesson7;

public class A {

    private int x;

    private A(int x1) {
        x = x1;
    }

    private void zpx2() {
        System.out.println("result: " + x * 2);
    }




    public static void main(String[] args) {

        A b1 = new A(10);
        b1.zpx2();

    }
}
