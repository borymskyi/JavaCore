// homework 22 .2
package main.java.net.borymskyi.javacore.homework.lesson22;

public class Dog extends Pet{

    Dog(String name) {
        super(name);
        System.out.println("I am dog and my name is: " + this.getName());
    }

    public void play(){
        System.out.println("Dog plays");
    }
}
