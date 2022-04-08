package main.java.net.borymskyi.javacore.university.lab3;

public class FahrenheitConverter implements Converter {
    @Override
    public double getConvertedValue(double t) {
        return t * 1.8 + 32;
    }
}
