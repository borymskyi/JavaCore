//Урок 7. Понятие "package". Модификаторы видимости (access modifiers).
//homework
package homework.lesson7;

public class Employeev2test {
    public static void main(String[] args) {
        Employeev2 emp2 = new Employeev2(401, "Dmytrii", 21, 700, 8);
        System.out.println(emp2);

        Employeev2 emp3 = new Employeev2(501, "Dmytrii", 1000);
        System.out.println(emp3);

//        Employeev2 emp4 = new Employeev2(1500);

        emp2.coutid();
        emp2.coutsurname();
        emp2.coutsalary();

        System.out.println("атрибуты класса обьекта класса emp2: " + emp2.id);
        System.out.println("атрибуты класса обьекта класса emp2: " + emp2.surname);
        System.out.println("атрибуты класса обьекта класса emp2: " + emp2.age);
//        System.out.println("атрибуты класса обьекта класса emp2: " + emp2.salary);
        System.out.println("атрибуты класса обьекта класса emp2: " + emp2.department);
    }
}
