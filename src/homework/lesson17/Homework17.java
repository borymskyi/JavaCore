/*
    Урок 17. Всё о классе StringBuilder.
    - Создание StringBuilder
    - StringBuilder is mutable
    - StringBuilder methods
    - StringBuffer class
    - Equality of StringBuilder
*/
/*
    Создайте класс, в котором создайте метод ravenstvo. Инпут
    параметрами данного метода будут 2 объекта класса
    StringBuilder. Метод должен иметь boolean return type,
    возвращать true, если значения объектов совпадают, false -
    если не совпадают.
    Продемонстрируйте данный метод.
*/

package homework.lesson17;

public class Homework17 {

    public boolean ravenstvo(StringBuilder sb0, StringBuilder sb1){
        String s0 = new String(sb0);
        String s1 = new String(sb1);
        if (s0.equals(s1)){
            return true;
        }
        return false;
    }


    public static void main(String[] args) {
        Homework17 h17 = new Homework17();

        StringBuilder sb1 = new StringBuilder("awd");
        StringBuilder sb2 = new StringBuilder("awd");

        System.out.println(h17.ravenstvo(sb1, sb2));
    }
}
