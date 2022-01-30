//Урок 8. Модификаторы "final" "static". Понятие константа.
//homework
package homework.lesson8;

public class SecondClassRun {
    public static void main(String[] args) {
        SecondClass s1 = new SecondClass();

        s1.nonstaticd2(12.5);

        double result = SecondClass.staticmetod(12.5);
        System.out.println(result);

        double result0 = s1.nonstatic(12.5);
        System.out.println(result0);
    }
}
