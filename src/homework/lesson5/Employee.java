//Урок 5. Создание объектов. Понятие ,конструктор,. Объявление и вызов методов.
//homework lesson5
package homework.lesson5;

public class Employee {
    int id;
    String surname;
    int age;
    int SalaryDepartment;

    public Employee(int id, String surname, int age, int SalaryDepartment) {
        this.id = id;
        this.surname = surname;
        this.age = age;
        this.SalaryDepartment = SalaryDepartment;
    }

    public void x2SalaryDepartment() {
        SalaryDepartment *= 2;
    }
}
