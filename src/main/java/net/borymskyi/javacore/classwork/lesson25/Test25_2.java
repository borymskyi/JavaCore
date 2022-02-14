/*
    Classwork 25. Полиморфизм, оператор instanceof.
 */
package main.java.net.borymskyi.javacore.classwork.lesson25;

import java.util.List;

public class Test25_2 {
    public static void main(String[] args) {
//        Employee emp1 = new Teacher();
//        Employee emp2 = new Driver();
//        Employee [] emparray = {emp1, emp2};
//        for (Employee emp : emparray) {
//            emp.work();
//        }
//        System.out.println(emp1 instanceof List);
//        System.out.println(emp1 instanceof Object);
//        System.out.println(emp1 instanceof Driver);
//        System.out.println(emp1 instanceof Employee);
//        System.out.println(emp1 instanceof Test25);
    }
}


abstract class Employee {
    public abstract void work();
}


class Teacher extends Employee implements Test25{
    @Override
    public void work() {
        System.out.println("Teacher work!");
    }

    @Override
    public void speak() {
        System.out.println("Teacher speaking");
    }
}


class Driver extends Employee {
    @Override
    public void work() {
        System.out.println("Driver work!");
    }
}

interface Test25 {
    public void speak();
}