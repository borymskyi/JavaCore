//Урок 6 Перегрузка методов и конструкторов (overloading). Ключевое слово this.
package classwork.lesson6;

public class Employee2 {
    int id;
    String surname;
    int age;
    int salary;
    String department;

    public Employee2(int id, String surname) {
        this.id = id;
        this.surname = surname;
    }

    public Employee2(int id, int age, int salary) {
        this.id = id;
        this.age = age;
        this.salary = salary;
    }

    public Employee2(String surname, String department) {
        this.surname = surname;
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee2{" +
                "id=" + id +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", department='" + department + '\'' +
                '}';
    }
}

class Employee2Run {
    public static void main(String[] args) {
        Employee2 e0 = new Employee2(500, "clown");
        System.out.println(e0);

        Employee2 e1 = new Employee2(501, 21, 700);
        System.out.println(e1);

        Employee2 e2 = new Employee2("Dmytrii", "v9");
        System.out.println(e2);

    }
}
