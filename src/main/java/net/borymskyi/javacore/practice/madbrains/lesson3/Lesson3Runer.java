package main.java.net.borymskyi.javacore.practice.madbrains.lesson3;

import main.java.net.borymskyi.javacore.practice.madbrains.lesson3.dancer.*;
import main.java.net.borymskyi.javacore.practice.madbrains.lesson3.phone.*;

import java.util.Arrays;
import java.util.List;

public class Lesson3Runer {
    public static void main(String[] args) {
        //employer
//        Dancer dancer = new Dancer("Anton", 38);
//
//        Dancer breakDanceDancer = new BreakDankDancer("Alex", 49);
//        Dancer electronicBoogieDancer = new ElectricBoogieDancer("Igor", 25);
//
//        List<Dancer> discotheque = Arrays.asList(dancer, breakDanceDancer, electronicBoogieDancer);
//        for (Dancer d :discotheque){
//            d.dance();
//        }

        //phone
        AbstractPhone phone = new CellPhone(4, 1);
        phone.ring(380937418685L);
    }
}
