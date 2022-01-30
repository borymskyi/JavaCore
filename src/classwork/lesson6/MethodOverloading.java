//Урок 6 Перегрузка методов и конструкторов (overloading). Ключевое слово this.
package classwork.lesson6;

public class MethodOverloading {

    public void cout(String s1) {
        System.out.println(s1);
    }

    public void cout(int i1) {
        System.out.println(i1);
    }
}


class Main {
    public static void main(String[] args) {

        MethodOverloading object_overloading = new MethodOverloading();

        String s1 = "it's overloading / это перегрузка ";
        object_overloading.cout(s1);

        int i1 = 5;
        object_overloading.cout(i1);
    }
}
