package eu.reply.academy.lesson26.shape;

public class Dreptunghi extends Patrulater {

    public Dreptunghi(double lungime, double latime) {
        super(lungime, latime);
    }

    public double getArea() {
        return getLatime() * getLungime();
    }


}
