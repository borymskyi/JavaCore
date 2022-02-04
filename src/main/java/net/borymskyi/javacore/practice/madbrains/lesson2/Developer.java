package main.java.net.borymskyi.javacore.practice.madbrains.lesson2;

public class Developer extends Employer {

    private String language;

    public Developer(String name, int age, String language) {
        super(name, age);
        this.language = language;
    }

    public String getLanguage() {
        return this.language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public void writeCode() {
        System.out.println(getName() + " writes code in " + getLanguage() + " language.");
    }

//    @Override
//    public String maskName(String name, String secondName) {
//        name = name.replace("i", "x");
//        return name;
//    }

    @Override
    public String cout() {
        return "[Developer]" + " language: " + language + " |name: " + getName() + " |age: " + getAge();
    }
}
