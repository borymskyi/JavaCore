package classwork.lesson5;

public class Main {
    public static void main(String[] args) {
        Car c1 = new Car("renault", "red", "motorV5");
        System.out.println(c1.getallattributes());
        System.out.println(c1);
        c1.attributes();
    }
}
