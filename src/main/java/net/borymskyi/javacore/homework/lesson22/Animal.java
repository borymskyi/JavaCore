// homework 22 .2
package main.java.net.borymskyi.javacore.homework.lesson22;

public class Animal {

    private int eyes;

    Animal(int eyes){
        this.eyes = eyes;
        System.out.println("I am animal");
    }

    public int getEyes(){
        return this.eyes;
    }

    public void setEyes(int eyes){
        this.eyes = eyes;
    }

    public void eat(){
        System.out.println("Animal eats");
    }

    public void dring(){
        System.out.println("Animal drinks");
    }
}
