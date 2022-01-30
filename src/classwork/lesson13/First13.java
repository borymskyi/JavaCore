//Урок 13. Конструкция "switch".
package classwork.lesson13;

public class First13 {


    int x;


    public First13(int x) {
        this.x = x;
    }


    public static void main(String[] args) {
        First13 f1 = new First13(4);

        if (f1.x > 3) {
            System.out.println("You lose");
        }
        else if (f1.x == 3) {
            System.out.println("Вы заняли бронзу.");
        }
        else if (f1.x == 2) {
            System.out.println("Вы заняли серебро.");
        }
        else if (f1.x == 1) {
            System.out.println("Вы заняли золото!");
        }
        else {
            System.out.println("Ошибка...");
        }

        // byte | short | int | char | String
        switch (f1.x + 5) {
            case 1:
                System.out.println("Вы заняли золото!");
                break;
            case 2:
                System.out.println("Вы заняли серебро.");
                break;
            case 3:
                System.out.println("Вы заняли бронзу.");
                break;
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                System.out.println("Вы проиграли.");
                break;
            default:
                System.out.println("Ошибка...");
        }
    }
}
