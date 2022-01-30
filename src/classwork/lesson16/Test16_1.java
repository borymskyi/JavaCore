//Урок 16. Всё о классе String.
package classwork.lesson16;

import java.util.Locale;

//car
public class Test16_1 {

    String color;
    String engine;

    public Test16_1(String color, String engine) {
        this.color = color;
        this.engine = engine;
    }

    final static int a = 5;

    public Test16_1 abc(String cvet) {
        Test16_1 c10 = new Test16_1(cvet, "V4");
        return c10;
    }

    public static void main(String[] args) {
//        Test16_1 c = new Test16_1("red", "V6");
//        Test16_1 c2 = c.abc("black");
//        System.out.println(c.color + " " + c.engine);
//        System.out.println(c2.color + " " + c2.engine);

        //.length();
        String s1 = new String("Dmytrii Borymskyi");
        int a = s1.length();
        System.out.println("a: " + a);

        //.charAt(); какой чар находится на нужном нам индексе.
        char b = s1.charAt(3);
        System.out.println("b: " + b);

        //.indexOf();
        int c = s1.indexOf('t');
        System.out.println("c: " + c);
        int d = s1.indexOf("tri");
        System.out.println("d: " + d);
        int e = s1.indexOf("b");
        System.out.println("e: " + e);
        int f = s1.indexOf('y', 5);
        System.out.println("f: " + f);

        //.startsWith();
        boolean a1 = s1.startsWith("Dmy");
        System.out.println("a1: " + a1);
        boolean b1 = s1.startsWith("Dmi");
        System.out.println("b1: " + b1);
        boolean c1 = s1.startsWith("Bor", 8);
        System.out.println("c1: " + c1);

        //.endsWith();
        boolean a2 = s1.endsWith("skyi");
        System.out.println("a2: " + a2);
        boolean b2 = s1.endsWith("ski");
        System.out.println("b2: " + b2);

        //.substring();
        String a3 = s1.substring(8);
        System.out.println("a3: " + a3);

        //.trim();
        String s2 = new String("   Test s t r i n g      ");
        String a4 = s2.trim();
        System.out.println("a4: " + a4);

        //.replace();
        String s3 = new String("Test");
        String a5 = s3.replace('e', 'i');
        System.out.println("a5: " + a5);
        String b5 = s3.replace("st", "sting");
        System.out.println("b6: " + b5);

        //.concat(); +
        String s4 = "Dmytrii ";
        String s5 = "Borymskyi";
        System.out.println(s4.concat(s5));

        //.toLowerCase();
        String s6 = "TeSt";
        String a6 = s6.toLowerCase();
        System.out.println("a6: " + a6);

        //.toUpperCase();
        String a7 = s6.toUpperCase();
        System.out.println("a7: " + a7);

        //.contains();
        boolean a8 = s6.contains("St");
        System.out.println("a8: " + a8);
        boolean b8 = s6.contains("ST");
        System.out.println("b8: " + b8);

        //c
        String s7 = "Hello World";
        String s8 = "Urrraaaaaa!!!";
        String s9 = s7.concat(s8).trim().replace("Urrraaaaaa", "УРА").substring(6, 10);
        System.out.println(s9);
        //no c
        System.out.println(s7.substring(s7.indexOf('W')));
    }
}
