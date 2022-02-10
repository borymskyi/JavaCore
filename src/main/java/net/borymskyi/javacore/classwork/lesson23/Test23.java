/*
    Урок 23. Classwork ООП. Overriding .Hidding. Final. super.
    - Data types of reference variable and object
    - Binding
    - Method overriding
    - Method hiding
    - keyword "super"
 */
package main.java.net.borymskyi.javacore.classwork.lesson23;

public class Test23 {
//    String test(){
//        return null;
//    }

    public static void main(String[] args) {
//        Xirurg x1 = new Xirurg();
//        Doctor x2 = new Xirurg();
//        Employee x3 = new Xirurg();
////        x1.operaciya();
////        x2.lechit();
////        x3.eat();
//        x3.eat();
//        x2.eat();
//        x1.eat();
//        Employee x4 = new Doctor();
//        x4.eat();
//        Employee x5 = new Employee();
//        x5.eat();
////        x3.operaciya();
//        Employee emp = new Employee();
//        emp.eat();
//        Employee emp2 = new Doctor();
//        emp2.eat();
//        Doctor doc = new Doctor();
//        doc.eat();

    }
}


class Employee {
    double salary = 100;
    String name = "Kolya";
    int age;
    int experience;
    static void eat() {
        System.out.println("Employee Kushat");
    }
    void sleep(){
        System.out.println("rabotnik Zzzz");
    }
//    void run(){
//        System.out.println();
//    }
//    void run(int time){
//        System.out.println("i run " + time);
//    }
//    public int run(int time, int distance){
//        System.out.println("i run " + time + ", distatnce: " + distance);
//        return time;
//    }

//    void operaciya(){}
}


class Doctor extends Employee {
    void lechit(){
        System.out.println("lechit");
    }
    static void eat() {
        System.out.println("Doctor kushat");
    }
}


class Xirurg extends Doctor {
    void operaciya(){
        System.out.println("operasi9");
    }
//    @Override
//    void eat(){
//        System.out.println("Xirurg kushatb");
//    }
}

//final class A{}
//
//class B extends A{}

class Animal {
    String showName(){
        return "some Animal";
    }
    void showInfoAboutAnimal() {
        System.out.println("Name of animal: " + showName());
    }
}
class Mause extends Animal{
    String showName() {
        return "Jerry";
    }
    void showInfoAboutMause(){
        System.out.println("Name of mause: " + showName());
    }

    public static void main(String[] args) {
        Mause m = new Mause();
        m.showInfoAboutAnimal();
        m.showInfoAboutMause();
    }
}

class A {
    String abc(A a) {
        System.out.println("A");
        return "A";
    }
}
class B extends A{
    Object abc(B a1) {
        System.out.println("B");
        return "B";
    }
//    @Override
//    String abc(A a) {
//        System.out.println("BB");
//        return "A";
//    }
}
class C extends B{
    @Override
    String abc(B a2) {
        System.out.println("C");
        return "C";
    }

    public static void main(String[] args) {
        A c1 = new C();
        c1.abc(new B());
    }
}