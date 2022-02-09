// homework 22 .2
package main.java.net.borymskyi.javacore.homework.lesson22;

public class Cat extends Pet{

    Cat(String name){
        super(name);
        System.out.println("I am cat and my name is: " + this.getName());
    }

    public void sleep(){
        System.out.println("Cat sleeps");
    }
}
