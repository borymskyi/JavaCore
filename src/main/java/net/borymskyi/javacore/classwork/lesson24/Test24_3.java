//interface
/*
    - abstract методы
    - abstract классы
    - interface
 */
package main.java.net.borymskyi.javacore.classwork.lesson24;

public class Test24_3 {
    public static void main(String[] args) {
        MlecopitaushiePovidenie hum = new Human(1, 2);
        hum.jump();
    }
}



interface MlecopitaushiePovidenie {
    void jump();
}



class Human extends SushistvaMlecopitaushie implements MlecopitaushiePovidenie {
    Human(int xrebet, int glaz) {
        super(xrebet, glaz);
    }
    @Override
    public void jump(){
        System.out.println("now, Human can jump, and hi have: " + this.glaz + " glaz, and: " + this.xrebet + " xrebet, and can:");
        dishat();
    }
    @Override
    public void dishat(){
        System.out.println("Human dishit");
    }
}



class Delfin extends SushistvaMlecopitaushie implements MlecopitaushiePovidenie {
    public Delfin(int xrebet, int glaz) {
        super(xrebet, glaz);
    }

    @Override
    public void jump() {
        System.out.println("now, Animal can jump");
    }
}

//#######

abstract class SushistvaMlecopitaushie {
    int xrebet;
    int glaz;

    SushistvaMlecopitaushie(int xrebet, int glaz) {
        this.xrebet = xrebet;
        this.glaz = glaz;
    }

    public void dishat(){
        System.out.println("dishit");
    }
}