package main.java.net.borymskyi.javacore.homework.lesson24;

public interface Speakable {

    default void speak(){
        System.out.println("Somebody speaks");
    }
}
