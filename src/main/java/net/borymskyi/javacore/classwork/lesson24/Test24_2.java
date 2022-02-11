// interface
package main.java.net.borymskyi.javacore.classwork.lesson24;

import java.util.ArrayList;
import java.util.List;

public class Test24_2 {
    public static void main(String[] args) {
//        Driver d1 = new Driver();
//        d1.swim();
//        d1.eat();
//        Employee d2 = new Driver();
//        d2.eat();
//        Test_1 t1 = new Driver();
//        t1.swim();
//        Test_2 t2 = new Driver();
//        t2.swim(5);
//        Test_1 t3 = new Driver();
//        t3.stop();
//        Test_1 t4 = new Test_1();
//        List<String> list = new List<>();
//        Employee t0 = new Teacher();
//        t0.sleep();
//        Teacher t1 = new Teacher();
//        t1.sleep();
//        Employee t0 = new Teacher();
//        t0.sleep();
//        Teacher t1 = new Teacher();
//        t1.sleep();
    }
}



class Employee {
    double salary = 100;
    String name = "Kolya";
    int age;
    int experience;

    void eat() {
        System.out.println("Kushat");
    }

    void sleep() {
        System.out.println("Employee is sleeping");
    }
}



class Teacher extends Employee implements Help_able, Test_extends_1 {
    int kolichestvoUchenikov;

    void uchit() {
        System.out.println("Uchit");
    }

    @Override
    public void pomosh() {
        System.out.println("Uchitel okazivaet pomosh");
    }

    @Override
    public void tushitPojar() {
        System.out.println("Uchitel tushit pojar");
    }

    @Override
    public void sleep(){
        System.out.println("Teacher is sleeping");
    }

//    @Override
//    public void sleep(){
//        System.out.println("Teacher is sleeping");
//    }
}



class Driver extends Employee implements Help_able, Swim_able, Test_1 {
    String nazvanieMashini;

    void vodit() {
        System.out.println("Vodit");
    }

    @Override
    public void pomosh() {
        System.out.println("Driver okazivaet pomosh");
    }

    @Override
    public void tushitPojar() {
        System.out.println("Driver tushit pojar");
    }

    @Override
    public void swim(int metrov) {
        System.out.println("Driver swiming" + metrov);
    }

    @Override
    public void stop() {
        System.out.println("Driver ostanovilsay");
    }
}



interface Help_able {
    void pomosh();
    void tushitPojar();
}



interface Swim_able {
    void swim(int metrov);
}



interface Test_1 extends Test_2{
    void swim(int metrov);
    void stop();
}



interface Test_2 {
    void swim(int metrov);
}

interface Test_extends_1 {
    void sleep();
}
