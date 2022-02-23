package main.java.net.borymskyi.javacore.classwork.lesson28;

public class ClassWork28_4 {

    public void awd() {
        int [] array = {1, 2, 3};
        try {
            System.out.println(array[5]);
        } catch(ArrayIndexOutOfBoundsException e) {
            String str = null;
            try {
                System.out.println(str.length());
            } catch(NullPointerException ex) {
                System.out.println(ex);
            }
        }
    }

    public static void main(String[] args) {
        ClassWork28_4 c = new ClassWork28_4();
        c.awd();
    }
}