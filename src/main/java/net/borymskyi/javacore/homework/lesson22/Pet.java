// homework 22 .2
package main.java.net.borymskyi.javacore.homework.lesson22;

public class Pet extends Animal{

    private String name;
    private final int TAIL = 1;
    private final int PAW = 4;

    Pet(String name) {
        super(2);
        this.name = name;
        System.out.println("I am pet");
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public int getTAIL() {
        return TAIL;
    }

    public int getPAW() {
        return PAW;
    }

    public void run(){
        System.out.println("Pet runs");
    }

    public void jump(){
        System.out.println("Pet jumps");
    }
}
