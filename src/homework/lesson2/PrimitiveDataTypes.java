//Урок 2 Примитивные типы данных. Понятие "переменная". Системы счисления.
package homework.lesson2;

public class PrimitiveDataTypes {
    public static void main(String[] args) {

        //Homework
        byte b0 = 0B1100; //2
        System.out.println("byte Bin: " + b0);
        byte b1 = 014; //8
        System.out.println("byte Oct: " + b1);
        byte b2 = 12; //10
        System.out.println("byte Dec: " + b2);
        byte b3 = 0XC; //16
        System.out.println("byte Hex: " + b3);

        short s0 = 0B10100010100; //2
        System.out.println("short Bin: " + s0);
        short s1 = 02424; //8
        System.out.println("short Oct: " + s1);
        short s2 = 1300; //10
        System.out.println("short Dec: " + s2);
        short s3 = 0X514; //16
        System.out.println("short Hex: " + s3);

        int i0 = 0B0; //2
        System.out.println("int Bin: " + i0);
        int i1 = 00; //8
        System.out.println("int Oct: " + i1);
        int i2 = 0; //10
        System.out.println("int Dec: " + i2);
        int i3 = 0X0; //16
        System.out.println("int Hex: " + i3);

        long l0 = 0B111010110111100110100010101L; //2
        System.out.println("long Bin: " + l0);
        long l1 = 0726746425L; //8
        System.out.println("long Oct: " + l1);
        long l2 = 123456789L; //10
        System.out.println("long Dec: " + l2);
        long l3 = 0X75BCD15L; //16
        System.out.println("long Hex: " + l3);

        float f0 = 1.1F;
        System.out.println("float: " + f0);
        double d0 = 1.1;
        System.out.println("double: " + d0);
        boolean bool = true;
        System.out.println("booleand: " + bool);

        char c0 = 'A';
        char c1 = ' ';
        char c2 = '*';
        char c3 = 250;
        char c4 = '\u0500';
        System.out.println(c0 + System.lineSeparator() + c1 + System.lineSeparator() + c2 + System.lineSeparator() + c3 + System.lineSeparator() + c4);
    }
}
