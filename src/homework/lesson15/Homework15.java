//Урок 15. Циклы while и do while.
//homework
package homework.lesson15;

public class Homework15 {

    public static void new_time(){
        int hour = 0;
        OUTER:
        while(hour <= 5) {

            int minute = -1;
            MIDDLE:
            do {
                minute++;
                if (hour > 1 && minute % 10 == 0) {
                    break OUTER;
                }
                int second = 0;
                INNER:
                while (second <= 59) {
                    if (second * hour > minute) {
                        continue MIDDLE;
                    }

                    System.out.println("Time " + hour + ":" + minute + ":" + second);

                    second++;
                }
            } while (minute <= 58);
            hour++;
        }
    }




    public static void main(String[] args) {
        new_time();
    }
}
