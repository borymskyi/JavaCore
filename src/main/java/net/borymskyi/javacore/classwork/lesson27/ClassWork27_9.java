package main.java.net.borymskyi.javacore.classwork.lesson27;

import java.io.*;

public class ClassWork27_9 {
    public static void main(String[] args) {
        StringBuilder result = new StringBuilder("");
        try {
            File f = new File("file27_2.txt");
            System.out.println("obyekt File sozdalsya");
            FileInputStream fis = new FileInputStream(f);
            System.out.println("Stream sozdalsya");
            int counter = 0;
            while (true) {
                counter++;
                result.append(fis.read());
                System.out.println("Informaciya chitaetsya");
                if (counter == 3) {
                    fis.close();
                }
            }
        } catch(FileNotFoundException e) {
            System.out.println("Exception 1: " + e);
        } catch(IOException e) {
            System.out.println("Catch Exception #2! " + e.getMessage());
        } finally {
            System.out.println("eto finally");
        }
    }
}
