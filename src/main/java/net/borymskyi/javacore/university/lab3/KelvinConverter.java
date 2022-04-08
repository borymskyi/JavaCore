package main.java.net.borymskyi.javacore.university.lab3;

public class KelvinConverter implements Converter {
    @Override
    public double getConvertedValue(double t) {
        return t + 273.15;
    }
}
