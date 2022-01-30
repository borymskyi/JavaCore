//Урок 16. Всё о классе String.
//homework
/*
    Создайте класс, в котором создайте метод email. Данный
    метод должен принимать в инпут 1 String параметр. Данный
    параметр должен содержать в себе email-ы в ледующем
    виде: ya@yahoo.com; on@mail.ru; ona@gmail.com; , т.е.
    Поле каждого e-mail должен стоять знак препинания ";".
    Ваш метод должен выводить на экран информацию о том, какой
    почтой пользуются, исходя из параметра, т.е. оутпут должен
    быть следующего вида:
    yahoo
    mail
    gmail
 */

package homework.lesson16;

public class Homework16 {

    int i10 = 0;

    public Homework16(int i10) {
        this.i10 = i10;
    }

    public void email_0(String s1) {
        // Первый вариант, выполняет условие задачи, но на практике не юзабильное.
        boolean b1 = s1.contains("@yahoo.com;"), b2 = s1.contains("@mail.ru;"), b3 = s1.contains("@gmail.com;"), b4 = s1.contains("@ukr.net;");
        if (b1 == true){
            System.out.println("yahoo");
        }
        if (b2 == true){
            System.out.println("mail");
        }
        if (b3 == true){
            System.out.println("gmail");
        }
        if (b4 == true){
            System.out.println("ukr");
        }
    }

    // Второй, лучший вариант. Выполняет все что нужно и даже больше.
    public void email(String s1) {
        char c1 = ' ', ch2 = ' ', ch3 = ' ';
        int mail_1 = 0, mail_2 = 0; //позиция символа @ и .

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
            if (ch2 == '@' && ch3 == '.' && mail_1 > 0 && mail_2 > 0 && mail_1 < mail_2) {
                System.out.println(s1.substring(++mail_1, mail_2));
                ch2 = ' ';
                ch3 = ' ';
                mail_1 = 0;
                mail_2 = 0;
            }
        }
    }

    // Вариант учителя. Выполняет задачу, но не юзабельный, нельзя потавить точку в мейле...
    public void email_1(String s) {
        int a = 0;
        int b = 0;
        int c = 0;
        while (c < s.length() - 1) {
            a = s.indexOf('@', c);
            b = s.indexOf('.', c);
            c = s.indexOf(';', c + 1);
            System.out.println(s.substring(a + 1, b));
        }
    }

    public static void main(String[] args) {
        Homework16 h1 = new Homework16(0);
        //h1.email_1("ya@yahoo.com; on@mail.ru; ona@gmail.com;");
        h1.email("ya@yahoo.com; on@mail.ru; ona@gmail.com; dimoks.kyn@gmail.com");
    }
}
