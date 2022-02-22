package main.java.net.borymskyi.javacore.classwork.lesson27;

import java.io.*;

public class Classwork27_4 {

    public void awd() {
        System.out.println("method awd() is runing...");
        File f = new File("file26_2.txt");
        try {
            FileInputStream fis = new FileInputStream(f);
        } catch (FileNotFoundException e) {
            System.out.println("catch exception =) " + e);
        }
    }

    public void lfg() {
        System.out.println("method lfg() is runing...");
        awd();
    }

    public void awdString() {
        String s = null;
        try {
            System.out.println(s.length());
        } catch (NullPointerException e) {
            System.out.println("catch: " + e);
        }
    }

    public static void main(String[] args) {
        Classwork27_4 t = new Classwork27_4();
        t.lfg();
        t.awdString();
    }
}
