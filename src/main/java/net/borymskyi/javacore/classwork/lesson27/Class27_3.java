package main.java.net.borymskyi.javacore.classwork.lesson27;

import java.io.*;

public class Class27_3 {
    public static void main(String[] args) {
//        int [] array = {1, 2, 3, 4};
//        System.out.println("create new array");
//
//        try {
//            System.out.println(array[3]);
//            System.out.println(array[10]);
//            System.out.println("print array, try block");
//        }
//        catch (ArrayIndexOutOfBoundsException e){
//            System.out.println("catch block " + e);
//        }
//        finally {
//            System.out.println("finally block.");
//        }
//
//        System.out.println("end");
//#####
//        File f = new File("file27_2.txt");
//        try {
//            System.out.println("try block.");
//            FileInputStream fis = new FileInputStream(f);
//            fis.read();
//        } catch (FileNotFoundException e) {
//            System.out.println("catch block 1.");
//            e.printStackTrace();
//        } catch (IOException e) {
//            System.out.println("catch block 2.");
//            e.printStackTrace();
//        } finally {
//            System.out.println("finally block.");
//        }
        //#### CompiletimeException
//        String s = null;
//        try {
//            System.out.println(s.length());
//        } catch (NullPointerException e) {
//            System.out.println("catch: " + e);
//        }
        // ## RuntimeException
        File file = new File("file25_2.txt");
        try {
            FileInputStream fis = new FileInputStream(file);
            fis.read();
        } catch (FileNotFoundException e) {
            System.out.println("catch1: " + e);
        } catch (IOException e) {
            System.out.println("catch2: " + e);
        }
    }
}
