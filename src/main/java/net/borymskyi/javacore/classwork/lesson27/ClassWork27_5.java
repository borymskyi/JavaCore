package main.java.net.borymskyi.javacore.classwork.lesson27;

import java.io.*;

public class ClassWork27_5 {

    public void abc() throws FileNotFoundException {
        System.out.println("abc method");
        File f = new File("file26_2.txt");
        FileInputStream fis = new FileInputStream(f);
    }

    public void def() throws FileNotFoundException {
        System.out.println("def method");
        abc();
    }

    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("main method");
        ClassWork27_5 c = new ClassWork27_5();
        c.def();
    }

}
