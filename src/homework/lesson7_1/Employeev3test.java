//Урок 7. Понятие "package". Модификаторы видимости (access modifiers).
//homework
package homework.lesson7_1;

public class Employeev3test {
    public static void main(String[] args) {
        homework.lesson7.Employeev2 emp4 = new homework.lesson7.Employeev2(401, "Dmytrii", 21, 700, 8);
        System.out.println(emp4);

//        homework.lesson7.Employeev2 emp5 = new homework.lesson7.Employeev2(601, "Dmytrii", 10);

//        System.out.println("атрибуты класса обьекта класса emp2: " + emp4.id);
        System.out.println("атрибуты класса обьекта класса emp2: " + emp4.surname);
//        System.out.println("атрибуты класса обьекта класса emp2: " + emp4.age);
//        System.out.println("атрибуты класса обьекта класса emp2: " + emp4.salary);
//        System.out.println("атрибуты класса обьекта класса emp2: " + emp4.department);
        emp4.coutid();
        emp4.coutsurname();
        emp4.coutsalary();
    }
}
