//homework
package homework.lesson4;

public class Student {

    int TicketId;
    String FirstName;
    String SecondName;
    int course;
    double AverageBallInMath;
    double AverageBallInEconomics;
    double AverageBallInEnglish;

    //homework lesson5
    public void AverageBallStudent() {
        double result = (AverageBallInMath + AverageBallInEconomics + AverageBallInEnglish) / 3;
        System.out.println(FirstName + " have average ball: " + result);
    }
}
