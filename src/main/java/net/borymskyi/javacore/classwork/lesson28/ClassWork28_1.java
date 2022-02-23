package main.java.net.borymskyi.javacore.classwork.lesson28;

import java.io.*;

public class ClassWork28_1 {

//    static int abc() {
//        int result = 5;
//        try {
//            System.out.println("try block:");
//            File f = new File("file26_2.txt");
//            FileInputStream fis = new FileInputStream(f);
//        } catch(FileNotFoundException e) {
//            System.out.println("catch block:");
//            result += 5;
//            System.out.println("result in ctach block = " + result);
//            return result;
//        } finally {
//            System.out.println("finally block: ");
//            result += 10;
//            System.out.println("result in finally block = " + result);
//        }
//        return result;
//    }

    static StringBuilder abc() {
        StringBuilder result = new StringBuilder("hello");
        try {
            System.out.println("try block:");
            File f = new File("file26_2.txt");
            FileInputStream fis = new FileInputStream(f);
        } catch(FileNotFoundException e) {
            System.out.println("catch block:");
            System.out.println("result in ctach block = " + result);
            return result;
        } finally {
            System.out.println("finally block: ");
            result.append(" world!");
            System.out.println("result in finally block = " + result);
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(abc());
    }

}
