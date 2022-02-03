package main.java.net.borymskyi.javacore.practice.madbrains;

import main.java.net.borymskyi.javacore.practice.madbrains.lesson2.Developer;

public class Program {

    public static void main(String[] args) {
        Developer dev0 = new Developer("Dmytrii", 21, "Java");
        dev0.writeCode();
        dev0.work(6);
        System.out.println(dev0.cout());
        dev0.setAge(25);
        System.out.println(dev0.cout());
    }
}
