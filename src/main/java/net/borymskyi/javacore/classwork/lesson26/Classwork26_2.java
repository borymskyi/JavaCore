/*
    classwork 26 wrapper classes
 */
package main.java.net.borymskyi.javacore.classwork.lesson26;

public class Classwork26_2 {
    public static void main(String[] args) {
//        Integer i = new Integer(10);
//        int i2 = i;
//        System.out.println(i2);
//
//        int i3 = 5;
//        Integer ci = i3;
//        Long cl = 5L;

        String s1 = "50  ";
        String result = s1.trim();
        int i = Integer.parseInt(result);
        System.out.println(i);
        String s2 = "3.10";
        String s3 = "true";
        Double d1 = Double.valueOf(s2);
        Boolean b1 = Boolean.valueOf(s3);
        Double d2 = Double.valueOf(5.2);
        System.out.println(d1 + " , " + b1 + " , " + d2 );
    }
}
