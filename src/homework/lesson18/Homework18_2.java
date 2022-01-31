/*
    Создайте класс, в котором создайте метод showArray. Инпут параметром
    данного метода будет двумерный массив типа String. Метод должен
    выводить на экран данный массив в следующем виде:
     { {элемент00, элемент01}, {элемент10}, {элемент10, элемент11} }
 */

package homework.lesson18;

public class Homework18_2 {

    public static void showArray(String[][] str) {
        String[][] str0 = str;
        for (int i = 0; i < str0.length; i++) {
            if (i == 0) {
                System.out.print("{ ");
            }
            System.out.print("{");
            for (int j = 0; j < str0[i].length; j++) {
                System.out.print(str0[i][j]);

                if (j < (str0[i].length - 1)) {
                    System.out.print(", ");
                }
            }
            if (i < (str0.length - 1)) {
                System.out.print("}, ");
            }
            if (i == (str0.length - 1)) {
                System.out.print("} }");
            }
        }
    }


    public static void main(String[] args) {
        String[][] str = { {"элемент00", "элемент01"}, {"элемент10"}, {"элемент10", "элемент11"} };
        showArray(str);
    }

}
