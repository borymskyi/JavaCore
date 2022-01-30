//Урок 6 Перегрузка методов и конструкторов (overloading). Ключевое слово this.
//homework
package homework.lesson6;

 public class StudentTest2 {
    public static void main (String[] args) {

        // 1 объект
        Student2 s0 = new Student2(500, "Dmytrii", "Borymskyi", 4, 3.9, 4.2, 4.1);
        System.out.println(s0);

        // 2 объект
        Student2 s2 = new Student2(600, "Dimoks", "Odmen", 3);
        System.out.println(s2);

        // 3 объект
        Student2 s1 = new Student2();
        System.out.println(s1);



//        Student2 student0 = new Student2();
//        Student2 student1 = new Student2();
//        Student2 student2 = new Student2();
//
//        student0.TicketId = 1;
//        student0.FirstName = "Dmytrii";
//        student0.SecondName = "Bormskyi";
//        student0.course = 4;
//        student0.AverageBallInMath = 4.5;
//        student0.AverageBallInEconomics = 4.2;
//        student0.AverageBallInEnglish = 3.9;
//        double student0_result = (student0.AverageBallInMath + student0.AverageBallInEconomics + student0.AverageBallInEnglish) / 3;
////        System.out.println(student0.FirstName + " have average ball: " + student0_result);
//
//
//        student1.TicketId = 2;
//        student1.FirstName = "Ivan";
//        student1.SecondName = "Ivanov";
//        student1.course = 3;
//        student1.AverageBallInMath = 3.5;
//        student1.AverageBallInEconomics = 3.2;
//        student1.AverageBallInEnglish = 3.7;
//        double student1_result = (student1.AverageBallInMath + student1.AverageBallInEconomics + student1.AverageBallInEnglish) / 3;
////        System.out.println(student1.FirstName + " have average ball: " + student1_result);
//
//        student2.TicketId = 3;
//        student2.FirstName = "Mark";
//        student2.SecondName = "Sidorov";
//        student2.course = 4;
//        student2.AverageBallInMath = 5;
//        student2.AverageBallInEconomics = 4.7;
//        student2.AverageBallInEnglish = 4.6;
//        double student2_result = (student2.AverageBallInMath + student2.AverageBallInEconomics + student2.AverageBallInEnglish) / 3;
////        System.out.println(student2.FirstName + " have average ball: " + student2_result);
//
//        //homework lesson5
//        student0.AverageBallStudent();
    }
}
