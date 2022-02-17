/*
    Classwork 26. methods "equals, toStirng". Wrapper classes.
 */
package main.java.net.borymskyi.javacore.classwork.lesson26;

public class Classwork26 {
    public static void main(String[] args) {
        Test26_1 awd0 = new Test26_1("test", "test");
        Test26_1 awd1 = new Test26_1("test", "test");
        Test26_1 awd2 = new Test26_1("test10", "test20");
        Test26_1 awd3 = awd2;
        System.out.println(awd0 == awd1); // false проверяет ссылаются ли они на один обьект.
        System.out.println(awd2 == awd3); // true

        System.out.println(awd0.equals(awd1)); // false | true
        System.out.println(awd2.equals(awd3)); // true | true
        System.out.println(awd0);
        System.out.println();
        System.out.println(awd0.toString());
    }
}




class Test26_1 {
    String test1;
    String test2;

    public Test26_1(String test1, String test2) {
        this.test1 = test1;
        this.test2 = test2;
    }

    @Override
    public boolean equals(Object obj) {
         if (obj instanceof Test26_1) {
             Test26_1 t = (Test26_1) obj;
             return (this.test1.equals(t.test1) && this.test2.equals(t.test2));
         } else {
             return false;
         }
    }
//    @Override
//    public boolean equals(Test26_1 t) {
//        return (this.test1.equals(t.test1) && this.test2.equals(t.test2));
//    }

    @Override
    public String toString() {
        return "Test26_1{" +
                "test1='" + test1 + '\'' +
                ", test2='" + test2 + '\'' +
                '}';
    }
}
