/*
    25 Урок. Полиморфизм, instanceof, DownCastint, cast, upcasting.
 */
package main.java.net.borymskyi.javacore.classwork.lesson25;

public class Test25_3 {
    public static void main(String[] args) {
//        Employee2 emp = new Teacher2(21, 4, "Teacher");
//        System.out.println(((Teacher2) emp).specializaciya);
////        System.out.println(((Doctor2) emp).specializaciya); Exception in thread
//        Employee2 emp2 = new Doctor2(20, 5, "awd"); // upcasting.
//        Doctor2 emp3 = (Doctor2)emp2; // downcasting

        TestInterface25_3 emptest = new Teacher2(50, 10, "test");
        emptest.speak();
        ((Teacher2) emptest).work();
    }
}


class Employee2 {

    int age;

    public Employee2(int age) {
        this.age = age;
    }

    public void work(){
        System.out.println("Employee is working");
    }
}


class Teacher2 extends Employee2 implements TestInterface25_3 {

    int stazTeacher;
    String specializaciya;

    public Teacher2(int age, int stazTeacher, String specializaciya) {
        super(age);
        this.stazTeacher = stazTeacher;
        this.specializaciya = specializaciya;
    }

    @Override
    public void work() {
        System.out.println("Teacher is working");
    }

    @Override
    public void speak() {
        System.out.println("Theacher is speaking");
    }
}


class Doctor2 extends Employee2 {

    int stazDoctor;
    String specializaciya;

    public Doctor2(int age, int stazDoctor, String specializaciya) {
        super(age);
        this.stazDoctor = stazDoctor;
        this.specializaciya = specializaciya;
    }

    @Override
    public void work() {
        System.out.println("Doctor is working");
    }
}


class Driver2 extends Employee2 {

    int stazDriver;
    String specializaciya;

    public Driver2(int age, int stazDriver, String specializaciya) {
        super(age);
        this.stazDriver = stazDriver;
        this.specializaciya = specializaciya;
    }

    @Override
    public void work() {
        System.out.println("Driver2 is working");
    }
}


interface TestInterface25_3 {
    void speak();
}


