//Урок 3. Арифметические и логические операции. Операции сравнения и присваивания.
package homework.lesson3;

public class Lesson3 {
    public static void main (String[] args) {

        //Homework
        int i1 = 5;
        int i2 = 11;
        double d1 = 5.5;
        double d2 = 1.3;
        long l = 20L;
        double result = 0;
        result = i2 / d1 + d2 % i1 - l;
        //       11 / 5.5 + 1.3 % 5 - 20L
        //       -16.7L
        System.out.println("Firest: " + result);

        int a = 5;
        int result1 = a-- - --a + ++a + a++ + a; //15; a = 5
        System.out.println(result1);
        System.out.println(a);

        int b = 8;
        int result2 = ++b - b++ + ++b - --b; // 1; b= 10
        System.out.println(result2);
        System.out.println(b);

    }
}
