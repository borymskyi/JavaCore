//Урок 14. Классический цикл "for". Выражения "break" и "continue".
//homework
package homework.lesson14;

public class Class14 {
    public static void time() {
        OUTER:
        for (int hour = 0; hour <= 5; hour++) {
            INNER_ONE:
            for (int minute = 0; minute <= 59; minute++) {

                if (hour > 1 && minute % 10 == 0) {
                    break OUTER;
                }

                INNER_TWO:
                for (int second = 0; second <= 59; second++) {

                    if (second * hour > minute) {
                        continue INNER_TWO;
                    }

                    System.out.println("Time " + hour + ":" + minute + ":" + second);
                }
            }
        }
    }


    public static void main(String[] args) {
        time();
    }
}
