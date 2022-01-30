//Урок 7. Понятие "package". Модификаторы видимости (access modifiers).
//homework
package homework.lesson7;

public class Employeev2 {
    int id;
    public String surname;
    int age;
    private int salary;
    int department;

    //public constructor
    public Employeev2(int id0, String surname0, int age0, int salary0, int department0) {
        id = id0;
        surname = surname0;
        age = age0;
        salary = salary0;
        department = department0;
    }

    //default constructor
    Employeev2(int id1, String surname1, int salary1) {
        this(id1, surname1, 0, salary1, 0);
    }

    //private constructor
    private Employeev2(int salary2) {
        this(0, null, 0, salary2, 0);
    }

//    void x2salary() {
//        salary *= 2;
//    }

    public void coutsalary(){
        System.out.println("salary: " + salary);
    }

    public void coutsurname(){
        System.out.println("surname: " + surname);
    }

    public void coutid(){
        System.out.println("id: " + id);
    }

    @Override
    public String toString() {
        return "Employeev2{" +
                "id=" + id +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", department=" + department +
                '}';
    }

    public static void main(String[] args) {
        Employeev2 emp0 = new Employeev2(5, "Dmytrii", 21, 700, 8);
        System.out.println(emp0);

        System.out.println("Методы: ");
        emp0.coutsalary();
        emp0.coutsurname();
        emp0.coutid();
    }

}

