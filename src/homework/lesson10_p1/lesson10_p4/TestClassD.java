package homework.lesson10_p1.lesson10_p4;

import homework.lesson10_p1.TestClassA;
import static homework.lesson10_p1.lesson10_p2.TestClassB.PI;
import homework.lesson10_p1.lesson10_p2.lesson10_p3.TestClassC;
import homework.lesson10_p1.lesson10_p4.lesson10_p5.*;

public class TestClassD {

    public int $3;

    public TestClassD(int $3) {
        this.$3 = $3;
    }

    public void get_strD(){
        System.out.println("it's class: TestClassD");
    }

    public static void main(String[] args) {
        TestClassA cA = new TestClassA(1);
        System.out.println(cA.$1);

        TestClassC cC = new TestClassC(2);
        System.out.println(cC.$2);

        TestClassE cE = new TestClassE(3);
        System.out.println(cE.$4);

        double it_is_pi = PI;
        System.out.println(it_is_pi);
    }

}
