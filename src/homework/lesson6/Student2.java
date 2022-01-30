//Урок 7. Понятие "package". Модификаторы видимости (access modifiers).
//homework
package homework.lesson6;

public class Student2 {

    int TicketId;
    String FirstName;
    String SecondName;
    int course;
    double AverageBallInMath;
    double AverageBallInEconomics;
    double AverageBallInEnglish;

    public Student2(int id0, String fname0, String sname0, int course0, double abimath0, double abie0, double abien0) {
        TicketId = id0;
        FirstName = fname0;
        SecondName = sname0;
        course = course0;
        AverageBallInMath = abimath0;
        AverageBallInEconomics = abie0;
        AverageBallInEnglish = abien0;
    }

    public Student2(int id1, String fname1, String sname1, int course1) {
        this(id1, fname1, sname1, course1, 0.0, 0.0, 0.0);
    }

    public Student2() {
    }

    //homework lesson5
    public void AverageBallStudent() {
        double result = (AverageBallInMath + AverageBallInEconomics + AverageBallInEnglish) / 3;
        System.out.println(FirstName + " have average ball: " + result);
    }

    @Override
    public String toString() {
        return "Student2{" +
                "TicketId=" + TicketId +
                ", FirstName='" + FirstName + '\'' +
                ", SecondName='" + SecondName + '\'' +
                ", course=" + course +
                ", AverageBallInMath=" + AverageBallInMath +
                ", AverageBallInEconomics=" + AverageBallInEconomics +
                ", AverageBallInEnglish=" + AverageBallInEnglish +
                '}';
    }
}
