package main.java.net.borymskyi.javacore.practice.madbrains.lesson3.phone;

public abstract class AbstractPhone {
    private int year;

    public AbstractPhone(int year) {
        this.year = year;
    }

    public abstract void call(long outputNumber);
    public abstract void ring(long inputNumber);
}
