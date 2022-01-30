 //Урок 4. Понятия "класс" и "объект". Знакомство со ссылочными типами данных.
//homework
package homework.lesson4;

public class StudentTest {
    public static void main (String[] args) {

        Student student0 = new Student();
        Student student1 = new Student();
        Student student2 = new Student();

        student0.TicketId = 1;
        student0.FirstName = "Dmytrii";
        student0.SecondName = "Bormskyi";
        student0.course = 4;
        student0.AverageBallInMath = 4.5;
        student0.AverageBallInEconomics = 4.2;
        student0.AverageBallInEnglish = 3.9;
        double student0_result = (student0.AverageBallInMath + student0.AverageBallInEconomics + student0.AverageBallInEnglish) / 3;
//        System.out.println(student0.FirstName + " have average ball: " + student0_result);


        student1.TicketId = 2;
        student1.FirstName = "Ivan";
        student1.SecondName = "Ivanov";
        student1.course = 3;
        student1.AverageBallInMath = 3.5;
        student1.AverageBallInEconomics = 3.2;
        student1.AverageBallInEnglish = 3.7;
        double student1_result = (student1.AverageBallInMath + student1.AverageBallInEconomics + student1.AverageBallInEnglish) / 3;
//        System.out.println(student1.FirstName + " have average ball: " + student1_result);

        student2.TicketId = 3;
        student2.FirstName = "Mark";
        student2.SecondName = "Sidorov";
        student2.course = 4;
        student2.AverageBallInMath = 5;
        student2.AverageBallInEconomics = 4.7;
        student2.AverageBallInEnglish = 4.6;
        double student2_result = (student2.AverageBallInMath + student2.AverageBallInEconomics + student2.AverageBallInEnglish) / 3;
//        System.out.println(student2.FirstName + " have average ball: " + student2_result);

        //homework lesson5
        student0.AverageBallStudent();
    }
}
