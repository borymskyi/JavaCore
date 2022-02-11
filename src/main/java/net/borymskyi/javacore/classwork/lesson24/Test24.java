/*
    Урок 24. Абстрактные Дефолтные Статические методы в Интерфейсе.
 */
package main.java.net.borymskyi.javacore.classwork.lesson24;

public class Test24 {
    public static void main(String[] args) {
//        Figura f = new Figura();
//        Figura f1 = new Kvadrat(4);
    }
}



abstract class Figura {
    int kolichestvoStoron = 0;

//    Figura(int kolichestvoStoron) {
//        this.kolichestvoStoron = kolichestvoStoron;
//    }

    abstract void perimetr();

    abstract void ploshad();

    void showInfo() {
        System.out.println("Eto figura");
    }
}



class Kvadrat extends Figura {
    int kolichestvoStoron = 4;
    int storona1 = 10;

//    Kvadrat(int kolichestvoStoron) {
//       super(kolichestvoStoron);
//       this.kolichestvoStoron = kolichestvoStoron;
//    }

    public void perimetr(){
        System.out.println("Perimetr Kvadrata: " + 4 * storona1);
    }

    public void ploshad(){
        System.out.println("Ploshad kvadrata: " + storona1 * storona1);
    }
}



class Pryamougolnik extends Figura {
    int kolichestvoStoron = 4;
    int storona1 = 8;
    int storona2 = 4;

    public void perimetr(){
        System.out.println("Perimetr pryamougolnika: " + 2 * (storona1 + storona2));
    }

    public void ploshad(){
        System.out.println("Ploshad pryamougolnika: " + storona1 * storona2);
    }
}



class Okrujnost extends Figura {
    int kolichestvoStoron = 4;
    int radius = 3;

    public void perimetr(){
        System.out.println("Perimetr okrujnosti: " + 2 * 3.14 * radius);
    }

    public void ploshad(){
        System.out.println("Ploshad okrujnosti: " + 3.14 * radius * radius);
    }
}