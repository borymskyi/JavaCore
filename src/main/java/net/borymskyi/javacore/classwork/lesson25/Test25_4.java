/*
    classwork 25.
 */
package main.java.net.borymskyi.javacore.classwork.lesson25;

public class Test25_4 {
    public static void main(String[] args) {
        byte b = 5;
        short s = b; //widening
        int i = s;
        long l = i;

        byte b1 = 127; //narrowing //6 - int кастится в байт.
        byte b2 = (byte)i;
        short s1 = 8; //narrowing //6 - int кастится в short.
        char c1 = 100; //narrowing //6 - int кастится в char.
        System.out.println(b2);

//        char ch = (char)-5;
//        int i3 = ch;
//        System.out.println(i3);

//        int i4 = 130;
//        byte b3 = (byte)i4;
//        System.out.println(b3);

        int i10 = 5;
        long l10 = 10L;
        i10 = i10 + (int)l10;
        i10 += l10;
        System.out.println(i10);
    }
}
