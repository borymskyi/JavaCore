/*
    ClassWork 27. Исключения и Ошибки.
 */
package main.java.net.borymskyi.javacore.classwork.lesson27;

import java.io.*;

public class ClassWork27_2 {
    public static void main(String[] args) throws Exception {
        File f = new File("file27_2.txt");
        FileInputStream fis = new FileInputStream(f);
        fis.read();
        FileOutputStream fos = new FileOutputStream(f);
        fos.write(125);
    }
}
