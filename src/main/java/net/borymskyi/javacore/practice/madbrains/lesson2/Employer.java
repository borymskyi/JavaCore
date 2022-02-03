package main.java.net.borymskyi.javacore.practice.madbrains.lesson2;

public class Employer {

    private String name;
    private int age;

    public Employer(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public void setName(String name) {
        System.out.println("name is set");
        this.name = name;
    }

    public void setAge(int age) {
        System.out.println("age is set");
        this.age = age;
    }

    public void work(int hour){
        System.out.println("I worked today: " + hour);
    }

    public String cout() {
        return "Employer{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
