/*
    1. Создайте класс Student со следующими переменными: name (исползуйте StringBuilder), course, grade.
    Примените инкапсуляцию к данному классу. Длина имени объектов не должна быть менее 3-х символов,
    оценки должны быть числами в интервале от 1 до 10, курс должен быть ислом от 1 до 4 включительно.
    Создайте метод showInfo, который будет выводить всю информацию о студенте, не используя переменные класса напрямую.
    Создайте класс TestStudent, в котором создайте объект класса Student, придайте его переменныи значения.
    Произведите вызов метода showInfo.
 */
package main.java.net.borymskyi.javacore.homework.lesson22;

public class Student22 {

    private StringBuilder name;
    private int course;
    private int grade;
    final static int NL = 3;

    public Student22(StringBuilder name, int course, int grade) {
        this.name = name;
        this.course = course;
        this.grade = grade;
    }

    public StringBuilder getName() {
        StringBuilder sb = new StringBuilder(this.name);
        return sb;
    }

    public int getCourse() {
        return course;
    }

    public int getGrade() {
        return grade;
    }

    public void setName(StringBuilder name) {
        if (name.length() >= NL) {
            this.name = name;
        }
    }

    public void setCourse(int course) {
        if (course >= 1 && course <= 4) {
            this.course = course;
        }
    }

    public void setGrade(int grade) {
        if (grade >= 1 && grade <= 10) {
            this.grade = grade;
        }
    }

    public void showInfo(){
        System.out.println(this.getName() + ": " + "grade= " + this.getGrade() + ". course= " + this.getCourse() + ".");
    }
}
