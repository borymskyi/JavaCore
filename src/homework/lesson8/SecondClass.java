//Урок 8. Модификаторы "final" "static". Понятие константа.
//homework
package homework.lesson8;

public class SecondClass {
    final static double p = 3.14;

    double nonstatic(double radius_kruga){
        double ploshadb_kruga = SecondClass.p * radius_kruga * radius_kruga;
        return ploshadb_kruga;
    }

    static double staticmetod(double radius_kruga){
        double dlina_okruznosti = 2 * SecondClass.p * radius_kruga;
        return dlina_okruznosti;
    }

    void nonstaticd2(double radius){
        System.out.println("Площадь круга: " + nonstatic(radius));
        System.out.println("Длина окружности: " + staticmetod(radius));
    }
}
