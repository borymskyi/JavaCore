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
//        TestInterface25_3 emptest = new Teacher2(50, 10, "test");
//        emptest.speak();
//        ((Teacher2) emptest).work();

        Employee2 emp0 = new Driver2(30, "Tom",  10, "driver", "renault");
        Employee2 emp1 = new Doctor2(32, "Mark",  5, "doctor");
        Employee2 emp2 = new Teacher2(45, "Dmytrii",  12, "teacher");
        Employee2[] emp = {emp0, emp1, emp2};
        for (Employee2 e : emp) {
            if (e instanceof Driver2) {
                System.out.println(e.name + " have a car: " + ((Driver2) e).car);
            }
        }
    }
}




class Employee2 {

    int age;
    String name;

    public Employee2(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public void work(){
        System.out.println("Employee is working");
    }
}




class Teacher2 extends Employee2 implements TestInterface25_3 {

    int stazTeacher;
    String specializaciya;

    public Teacher2(int age, String name, int stazTeacher, String specializaciya) {
        super(age, name);
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

    public Doctor2(int age, String name, int stazDoctor, String specializaciya) {
        super(age, name);
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
    String car;

    public Driver2(int age, String name, int stazDriver, String specializaciya, String car) {
        super(age, name);
        this.stazDriver = stazDriver;
        this.specializaciya = specializaciya;
        this.car = car;
    }

    public void drive() {
        System.out.println("Driver2 drive in " + this.car);
    }

    @Override
    public void work() {
        System.out.println("Driver2 is working");
    }
}




interface TestInterface25_3 {
    void speak();
}


