//Урок 14. Классический цикл "for". Выражения "break" и "continue".
package classwork.lesson14;

public class LFirst14 {


    public static void time() {
        for (int i = 0; i <= 23; i++) {
            for (int j = 0; j <= 59; j++) {
                System.out.println("Hour: " + i + ":" + j);
            }
        }
    }

    public static void abc(int x) {
        System.out.println("hello " + x);
    }


    public static void main(String[] args) {

        for (int i = 0; i <= 2; i++) {
            System.out.println("test: " + i);
        }

        for (int i = 0; i <= 2;) {
            System.out.println("test0: " + i);
            i++;
        }

        int b = 0;
        for (; b <= 2; b++) {
            System.out.println("test2 : " + b);
        }

        //переменные одного типа.
        for (int x = 0, y = 2; x <= y || x <= 2; x++, abc(1)) {
            System.out.println("test3: " + x);
        }

        for (int i = 0; i <= 5; i++) {
            if (i == 3) {
                System.out.println("break");
                break;
            }
            System.out.println("test4: " + i);
        }

        for (int i = 0; i <= 10; i++) {
            if (i == 5) {
                System.out.println("continue");
                continue;
            }
            System.out.println("test5: " + i);
            System.out.println("test5");
        }

        time();
    }
}
