package main.java.net.borymskyi.javacore.classwork.lesson27;

public class ClassWork27_6 {

    public void abc() {
        int [] array = {1, 2, 3};
        try {
            System.out.println(array[5]);
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("exception catch!");
            System.out.println(e);
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        ClassWork27_6 c = new ClassWork27_6();
        c.abc();
    }
}
