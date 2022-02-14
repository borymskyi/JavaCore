package main.java.net.borymskyi.javacore.homework.lesson24;

public class RunHomework24 {
    public static void main(String[] args) {
//        Animal obj = new Mechenosec("Malek");
//        obj.eat();
//        obj.sleep();
//        System.out.println(obj.name);

        //1
        Mechenosec mech0 = new Mechenosec("riba1");
        System.out.println(mech0.name);
        mech0.swim();
        mech0.eat();
        mech0.sleep();

        System.out.println();

        //2
        Speakable pingvin0 = new Pingvin("pingvin1");
        pingvin0.speak();

        System.out.println();

        //3
        Animal lev1 = new Lev("Lain1");
        System.out.println(lev1.name);
        lev1.eat();
        lev1.sleep();

        System.out.println();

        //4
        Mammal lev2 = new Lev("Lain2");
        System.out.println(lev2.name);
        lev2.eat();
        lev2.sleep();
        lev2.run();
        lev2.speak();

        Mechenosec test = new Mechenosec("test10");
        System.out.println(test);
        System.out.println(test.name);
    }
}
