package main.java.net.borymskyi.javacore.classwork.lesson28;

import java.io.*;

public class ClassWork28_2 {

    public void abc() throws FileNotFoundException {
        try {
            File f = new File("file26_2.txt");
            FileInputStream fis = new FileInputStream(f);
        } catch(FileNotFoundException e) {
            System.out.println("exception was catched, but didn't processed");
            throw e;
        }
    }

    public static void main(String[] args) /* throws FileNotFoundException */ {
        ClassWork28_2 c = new ClassWork28_2();
        try {
            c.abc();
        } catch(FileNotFoundException e) {
            System.out.println("exception cached");
        }
    }
}
