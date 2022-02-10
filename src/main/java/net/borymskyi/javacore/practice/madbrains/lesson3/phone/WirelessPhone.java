package main.java.net.borymskyi.javacore.practice.madbrains.lesson3.phone;

public abstract class WirelessPhone extends AbstractPhone{

    private int hour;

    public WirelessPhone(int year, int hour) {
        super(year);
        this.hour = hour;
    }
}
