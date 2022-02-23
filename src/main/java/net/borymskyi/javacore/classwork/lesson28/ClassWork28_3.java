package main.java.net.borymskyi.javacore.classwork.lesson28;

import java.io.*;

public class ClassWork28_3 {

    FileInputStream fis1, fis2;

    public void awd() {
        try {
            fis1 = new FileInputStream("file26_2.txt");
            try {
                fis2 = new FileInputStream("file27_2.txt");
            } catch(FileNotFoundException e) {
                System.out.println("#2 file27_2.txt not found.");
            }
        } catch(FileNotFoundException e) {
            System.out.println("#1 file27_2.txt not found.");
        } finally {
            System.out.println("it is out finally block.");
            try {
                fis1.close();
                fis2.close();
            } catch(IOException e) {
                System.out.println("#1 Exception was found in the finally block.");
            } catch(NullPointerException e) {
                System.out.println("#2 Exception was found in the finally block." + "\n Exception: " + e);
            }
        }
    }

    public static void main(String[] args) {
        ClassWork28_3 c = new ClassWork28_3();
        c.awd();
    }
}
