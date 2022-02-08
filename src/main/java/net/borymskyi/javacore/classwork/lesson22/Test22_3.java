//22 Урок. Инкапсуляция
package main.java.net.borymskyi.javacore.classwork.lesson22;

public class Test22_3 {
    public static void main(String[] args) {
        Doctor doc = new Doctor();
        doc.name = "Ivan";
        doc.age = 55;
        doc.experience = 25;
        doc.lechit();
        doc.specializaciya = "xirurg";
        doc.sleep();
        doc.eat();
    }
}


class Employee{
    String name;
    int age;
    int experience;
    void eat(){
        System.out.println("eat");
    }
    void sleep(){
        System.out.println("Zzzz");
    }
}


class Doctor extends Employee{
    String specializaciya;

    void lechit(){
        System.out.println("lechit");
    }
}


class Teacher extends Employee{
    int kolUchenikov;

    void uchit(){
        System.out.println("Uchit");
    }
}


class Driver extends Employee{
    String nazvanieCar;

    void vodit(){
        System.out.println("Vodit");
    }
}
