package classwork.lesson5;

public class Car {
    String name;
    String color;
    String engine;

    public Car(String im9, String zvet, String motorr) {
        name = im9;
        color = zvet;
        engine = motorr;
    }

    public String getallattributes() {
        String result = "name: " + name + "\n" + "color: " + color + "\n" + "engine: " + engine;
        return result;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", engine='" + engine + '\'' +
                '}';
    }

    public void attributes() {
        System.out.println("name: " + name + "\n" + "color: " + color + "\n" + "engine: " + engine);
    }
}
