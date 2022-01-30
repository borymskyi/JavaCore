//Урок 9. Разновидности переменных и пределы их видимости. GC.
//homework
package homework.lesson9;

public class FirstL9 {

    int x;


    FirstL9(int x){
        this.x = x;
    }


    static void create_object() {
        String s1 = new String("clown");
        String s2 = new String("who?");
    }


    public static void main(String[] args) {
        FirstL9 f1 = new FirstL9(1);
        FirstL9 f2 = new FirstL9(2);
        FirstL9 f3 = new FirstL9(3);
        FirstL9 f4 = new FirstL9(4);
        FirstL9 f5 = new FirstL9(5);
        FirstL9 f6 = new FirstL9(6);
        FirstL9 f7 = new FirstL9(7);
        FirstL9 f8 = new FirstL9(8);

        f3 = null;
        f4 = null;
        f5 = null;
        f6 = null;
        f7 = null;
        f8 = null;

        System.out.println(f1);
        System.out.println(f2);
        System.out.println(f3);
        System.out.println(f4);
        System.out.println(f5);
        System.out.println(f6);
        System.out.println(f7);
        System.out.println(f8);

        FirstL9 f10 = new FirstL9(1);
        create_object();
        FirstL9 f11 = new FirstL9(2);
        create_object();
    }
}
