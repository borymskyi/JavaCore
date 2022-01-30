//Урок 15. Циклы while do while.
package classwork.lesson15;

public class Test15 {
    public static void main(String[] args) {

//        int i = 100;
//        while (i > 0) {
//
//            System.out.println("Ваш баланс: " + i);
//            System.out.println("Делаем ставки");
//            i -= 10;
//            System.out.println("Вы проиграли...");
//        }
//        System.out.println("какая жалость");


//        boolean work = true;
//
//        int x = 1;
//
//        while (work) {
//            System.out.println(x);
//            if (x % 3 == 0 && x % 7 == 0) {
//                work = false;
//                //break;
//            }
//            x++;
//        }


//        int a = 5;
//        while (a++ < 10) {
//            a++;
//        }
//        System.out.println(a);


        for (int hour = 0; hour <= 23; hour++) {
            int minute = 0;

            while (minute <= 59) {
                System.out.println(hour + ":" + minute);
                minute++;
            }
        }


//        int chas = -1;
//
//        OUTER:
//        do {
//            chas++;
//            int minuta = 0;
//
//            INNER:
//            while (minuta < 60) {
//                if (minuta == 20) {
//                    continue INNER;
//                }
//                System.out.println(chas + ":" + minuta);
//                minuta++;
//            }
//        } while (chas < 24);


//        int a = 5;
//        do {
////            int a = 5;
//            System.out.println(a++ + " ");
//        } while (a <= 15);
//
    }
}