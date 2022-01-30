//Урок 16. Всё о классе String.
package classwork.lesson16;

import java.util.Locale;

public class Test16 {
    public static void main(String[] args) {

//        String s1 = "hello";
//        String s2 = "hello";
//        String s3 = new String("hello");
//        String s4 = new String("hello");
//
//        System.out.println(s1 == s2); // один и тот же адресс на один и тот же обьект в пуле стринг.
//        System.out.println(s3 == s4); // разные адресса так как обьекты разные и они не в пуле стринг.
//        //5 объектов

        String s1 = "Чтоб мудро жизнь прожить, знать надобно немало, Два важных правила запомни для начала: Ты"
                +   "лучше голодай, чем что попало есть, И лучше будь один, чем вместе с кем попало.";
        String s2 = s1.toUpperCase();
        char c1;
        char c2;
        for (int i = 0; i < s1.length(); i++) {
            c1 = s1.charAt(i);
            c2 = s2.charAt(i);
            if (c1 != ',' && c1 != ':' && c1 != ' ' && c1 != '.' && c1 == c2) {
                System.out.println();
                System.out.print(c1);
                continue;
            }
            System.out.print(c1);
        }
        System.out.println();
    }
}
