// Урок 17. Всё о классе StringBuilder.
/*
    - Создание StringBuilder
    - StringBuilder is mutable
    - StringBuilder methods
    - StringBuffer class
    - Equality of StringBuilder
 */
package classwork.lesson17;

public class Test17 {

    public static void main(String[] args) {
        StringBuilder sb0 = new StringBuilder("Test String Builder");
        sb0.append(22).append(true).append("Test");
        //System.out.println(sb0);
        //System.out.println(sb0.insert(3, "Hello"));
        //System.out.println(sb0.delete(1, sb0.length()));
        System.out.println(sb0.deleteCharAt(5));
        System.out.println(sb0);
        System.out.println(sb0.reverse());
        System.out.println(sb0.capacity());
        System.out.println(sb0.length());

        StringBuilder sb1 = new StringBuilder("Hello, friend!");
        String s = null;
        s = sb1.append("How are you?").substring(sb1.indexOf("f"), sb1.indexOf("!"));
        System.out.println(s);

//        StringBuilder sb0 = new StringBuilder("Test0");
//        StringBuilder sb1 = sb0.reverse();
        System.out.println(sb0 == sb1);
        System.out.println(sb0.equals(sb1));
        StringBuilder sb3 = new StringBuilder("123");
        StringBuilder sb4 = new StringBuilder("123");
        System.out.println(sb3 == sb4);
        System.out.println(sb3.equals(sb4));

        StringBuilder sb5 = new StringBuilder("awd");
        String str = new String(sb5);
        System.out.println(str);

        StringBuffer sb6 = new StringBuffer("lfg");
        String str1 = new String(sb6);
        System.out.println(str1);

    }
}
