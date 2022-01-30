//Урок 5. Создание объектов. Понятие ,конструктор,. Объявление и вызов методов.
//homework lesson5
package homework.lesson5;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee o1 = new Employee(0, "Dmytrii", 21, 300);
        Employee o2 = new Employee(1, "Dimoks", 20, 500);

        //first
        System.out.println("first: " + o1.SalaryDepartment);
        o1.x2SalaryDepartment();
        System.out.println("first x2: " + o1.SalaryDepartment);

        //second
        System.out.println("second: " + o2.SalaryDepartment);
        o2.x2SalaryDepartment();
        System.out.println("second x2  : " + o2.SalaryDepartment);
    }
}
