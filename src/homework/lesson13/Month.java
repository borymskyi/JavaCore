//Урок 13 Конструкция "switch".
//homework
package homework.lesson13;

public class Month {


    public static final int MONTH = 12;


    public static void how_many_days_in_a_month(int month) {
        if (month <= MONTH && month >= 1) {
            switch (month) {
                case 1:
                    System.out.println("RU: Январь 01.01.2022 | 31 дней" + "\n" + "EN: January 01.01.2022 | 31 days");
                    break;
                case 2:
                    System.out.println("RU: Февраль 01.02.2022 | 28 дн" + "\n" + "EN: February 01.01.2022 | 28 days");
                    break;
                case 3:
                    System.out.println("RU: Март 01.03.2022 | 31");
                    break;
                case 4:
                    System.out.println("RU: Апрель 01.04.2022 | 30");
                    break;
                case 5:
                    System.out.println("RU: Май 01.05.2022 | 31");
                    break;
                case 6:
                    System.out.println("RU: Июнь 01.06.2022 | 30");
                    break;
                case 7:
                    System.out.println("RU: Июль 01.07.2022 | 31");
                    break;
                case 8:
                    System.out.println("RU: Август 01.08.2022 | 31");
                    break;
                case 9:
                    System.out.println("RU: Сентябрь 01.09.2022 | 30");
                    break;
                case 10:
                    System.out.println("RU: Октябрь 01.10.2022 | 31");
                    break;
                case 11:
                    System.out.println("RU: Ноябрь 01.11.2022 | 30");
                    break;
                case 12:
                    System.out.println("RU: Декабрь 01.12.2022 | 31");
                    break;
                default:
                    System.out.println("RU: Ошибка!" + "\n" + "EN: Error");
                    break;
            }
        }
        else {
            System.out.println("RU: Вы ввели неверные данные." + "\n" + "EN: You entered incorrect data. Enter from 1 to 12");
        }
    }

    public static void new_how_many_days_in_a_month(int month){
        switch (month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("31 дней");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("30 дней в месяце");
                break;
            case 2:
                System.out.println("28 дней в месяце");
                break;
            default:
                System.out.println("Вы ввели неверные данные.");
                break;
        }
    }


    public static void main(String[] args) {
        how_many_days_in_a_month(8);
        new_how_many_days_in_a_month(8);
    }
}
