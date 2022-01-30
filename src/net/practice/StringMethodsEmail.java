//Практикую матоды стринга | Practicing String methods
package net.practice;

public class StringMethodsEmail {

    public void amount_email(String s1) {
        char c1 = ' ', ch2 = ' ', ch3 = ' ';
        int mail_1 = 0;     // позиция символа @ | position @
        int mail_2 = 0;     // позиция символа . | position .
        int value0 = 0;     // счетчик gmail | counter gmail
        int value1 = 0;     // счетчик mail  | counter mail
        int value2 = 0;     // счетчик yahoo | counter yahoo
        int value3 = 0;     // счетчик ukr   | counter ukr
        String e0 = "gmail";
        String e1 = "mail";
        String e2 = "yahoo";
        String e3 = "ukr";

        for (int i = 0; i < s1.length(); i++) {
            c1 = s1.charAt(i);

            if (c1 == '@') {
                mail_1 = i;
                ch2 = s1.charAt(i);
            }
            if (c1 == '.') {
                mail_2 = i;
                ch3 = s1.charAt(i);
            }

            if (ch2 == '@' && ch3 == '.' && mail_1 < mail_2) {
                String str = " ";
                str = s1.substring(++mail_1, mail_2);
                if (str.equals(e0)){
                    value0 += 1;
                }
                if (str.equals(e1)){
                    value1 += 1;
                }
                if (str.equals(e2)){
                    value2 += 1;
                }
                if (str.equals(e3)){
                    value3 += 1;
                }
                ch2 = ' ';
                ch3 = ' ';
                mail_1 = 0;
                mail_2 = 0;
            }
        }
        System.out.println("gmail: " + value0 + "\n"
                +  "mail: " + value1 + "\n"
                +  "yahoo: " + value2 + "\n"
                +  "ukr: " + value3);
    }


    public static void main(String[] args) {
        StringMethodsEmail project1 = new StringMethodsEmail();
        project1.amount_email("ya@yahoo.com; on@mail.ru; ona@gmail.com; dimoks.kyn@gmail.com; ya@yahoo.com; on@mail.ru; " +
                "ona@gmail.com; dimoks.kyn@gmail.com; ya@yahoo.com; on@mail.ru; ona@gmail.com; dimoks.kyn@gmail.com; " +
                "vasilii.b@gmail.com; ya@yahoo.com; on@mail.ru; ona@gmail.com; dimoks.kyn@gmail.com; ya@yahoo.com; " +
                "on@mail.ru; ona@gmail.com; dimoks.kyn@gmail.com; test.ivan@ukr.net; mark@mail.ru; on@mail.ru; ona@gmail.com; " +
                "dimoks.kyn@gmail.com; test.ivan@ukr.net; mark@mail.ru; on@mail.ru; ona@gmail.com; dimoks.kyn@gmail.com; " +
                "test.ivan@ukr.net; mark@mail.ru; on@mail.ru; ona@gmail.com; dimoks.kyn@gmail.com; test.ivan@ukr.net; mark@mail.ru; " +
                "on@mail.ru; ona@gmail.com; dimoks.kyn@gmail.com; test.ivan@ukr.net; mark@mail.ru; on@mail.ru; ona@gmail.com; " +
                "dimoks.kyn@gmail.com; test.ivan@ukr.net; mark@mail.ru; on@mail.ru; ona@gmail.com; dimoks.kyn@gmail.com; test.ivan@ukr.net; " +
                "mark@mail.ru; on@mail.ru; ona@gmail.com; dimoks.kyn@gmail.com; test.ivan@ukr.net; mark@mail.ru; on@mail.ru; ona@gmail.com; " +
                "dimoks.kyn@gmail.com; test.ivan@ukr.net; mark@mail.ru; on@mail.ru; ona@gmail.com; dimoks.kyn@gmail.com; test.ivan@ukr.net; " +
                "mark@mail.ru; on@mail.ru; ona@gmail.com; dimoks.kyn@gmail.com; test.ivan@ukr.net; mark@mail.ru; on@mail.ru; ona@gmail.com; " +
                "dimoks.kyn@gmail.com; test.ivan@ukr.net; mark@mail.ru; on@mail.ru; ona@gmail.com; dimoks.kyn@gmail.com; test.ivan@ukr.net; " +
                "mark@mail.ru; on@mail.ru; ona@gmail.com; dimoks.kyn@gmail.com; test.ivan@ukr.net; mark@mail.ru; dimoks.kyn@gmail.com; " +
                "test.ivan@ukr.net; mark@mail.ru; on@mail.ru; ona@gmail.com; dimoks.kyn@gmail.com; test.ivan@ukr.net; dimoks.kyn@gmail.com; " +
                "test.ivan@ukr.net; mark@mail.ru; on@mail.ru; ona@gmail.com; dimoks.kyn@gmail.com; test.ivan@ukr.net; dimoks.kyn@gmail.com; " +
                "test.ivan@ukr.net; mark@mail.ru; on@mail.ru; ona@gmail.com; dimoks.kyn@gmail.com; test.ivan@ukr.net; dimoks.kyn@gmail.com; " +
                "test.ivan@ukr.net; mark@mail.ru; on@mail.ru; ona@gmail.com; dimoks.kyn@gmail.com; test.ivan@ukr.net; dimoks.kyn@gmail.com; " +
                "test.ivan@ukr.net; mark@mail.ru; on@mail.ru; ona@gmail.com; dimoks.kyn@gmail.com; test.ivan@ukr.net; dimoks.kyn@gmail.com; " +
                "test.ivan@ukr.net; mark@mail.ru; on@mail.ru; ona@gmail.com; dimoks.kyn@gmail.com; test.ivan@ukr.net; dimoks.kyn@gmail.com; " +
                "test.ivan@ukr.net; mark@mail.ru; on@mail.ru; ona@gmail.com; dimoks.kyn@gmail.com; test.ivan@ukr.net; who.it.is@yahoo.com; alan@ukr.net");
    }
}
