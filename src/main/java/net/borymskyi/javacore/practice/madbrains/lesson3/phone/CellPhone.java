package main.java.net.borymskyi.javacore.practice.madbrains.lesson3.phone;

public class CellPhone extends WirelessPhone{
    public CellPhone(int year, int hour) {
        super(year, hour);
    }

    @Override
    public void call(long outputNumber) {
        System.out.println("Вызываю номер " + outputNumber);
    }

    @Override
    public void ring(long inputNumber) {
        System.out.println("Вам звонит абонент " + inputNumber);
    }
}
