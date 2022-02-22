package main.java.net.borymskyi.javacore.classwork.lesson27;

import java.io.*;

public class ClassWork27_8 {

    public void abc() {
        File f = new File("file26_2.txt");
        try {
            FileInputStream fis = new FileInputStream(f);
        } catch(IOException e) {
            System.out.println("catch! IOException");
        } catch(FileNotFoundException e) {
            System.out.println("catch! " + e);
        }
    }

    public static void main(String[] args) {
        ClassWork27_8 t = new ClassWork27_8();
        t.abc();
    }
}
