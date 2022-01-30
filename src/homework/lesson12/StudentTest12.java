//Урок 12. Конструкции "if" if else". Тернанрый оператор.
//homework
package homework.lesson12;

public class StudentTest12 {

    String name;
    int age;
    int average_ball_math;


    public StudentTest12(String name, int age, int average_ball_math) {
        this.name = name;
        this.age = age;
        this.average_ball_math = average_ball_math;
    }

    void myequals_first(StudentTest12 s1, StudentTest12 s2) {
        if (s1.age == s2.age && s1.average_ball_math == s2.average_ball_math) {
            System.out.println(s1.name + " and " + s2.name + " равны.");
        }
        else {
            System.out.println("ne ravni");
        }
    }

    void myequals_one(StudentTest12 s1, StudentTest12 s2) {
        if (s1.age == s2.age) {
            if (s1.average_ball_math == s2.average_ball_math) {
                System.out.println(s1.name + " и " + s2.name + " равны");
            }
            else {
                System.out.println(" не равны: " + "\n" + s1.name + " " + s1.age + " " + s1.average_ball_math + "\n" + s2.name + " " + s2.age + " " + s2.average_ball_math);
            }
        }
        else {
            System.out.println(" не равны: " + "\n" + s1.name + " " + s1.age + " " + s1.average_ball_math + "\n" + s2.name + " " + s2.age + " " + s2.average_ball_math);
        }
    }


    public static void main(String[] args) {
        StudentTest12 s1 = new StudentTest12("Dmytrii", 20 , 5);
        StudentTest12 s2 = new StudentTest12("Dimoks", 21, 5);

        s1.myequals_first(s1, s2);
        s1.myequals_one(s1, s2);
    }


}
