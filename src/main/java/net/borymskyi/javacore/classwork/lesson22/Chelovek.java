package main.java.net.borymskyi.javacore.classwork.lesson22;

import com.sun.org.apache.bcel.internal.classfile.ClassElementValue;

public class Chelovek {
    final String pol;
    private String name;
    private int vozrast;
    private int ves;

    public Chelovek(String pol) {
        this.pol = pol;
    }

    public String getName() {
        return name;
    }

    public int getVozrast() {
        return vozrast;
    }

    public int getVes() {
        return ves;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setVozrast(int vozrast) {
        if (vozrast > 0) {
            this.vozrast = vozrast;
        }
    }

    public void setVes(int ves) {
        if (ves > 0) {
            this.ves = ves;
        }
    }

    public static void main(String[] args) {
        Chelovek c = new Chelovek("male");
        c.setName("Kolya");
        c.setVes(50);
        c.setVozrast(15);
        System.out.println(c.getName());
        System.out.println(c.getVozrast());
        System.out.println(c.getVes());

    }
}
